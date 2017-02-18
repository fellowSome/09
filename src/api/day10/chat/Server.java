package api.day10.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *  �����ҷ����
 *  
 *  �����ڷ������̵�ServerSocket��Ҫ����
 *    1.��ϵͳ�������˿�
 *        �ͻ��˾���ͨ������˿���֮���ӵ�
 *    2.��������ķ���˿ڣ���һ���ͻ���ͨ���ö˿ڳ��Խ�������ʱ��
 *      ServerSocket���ڷ������˽���һ��Socket��ͻ�������
 *      
 * @author Administrator
 *
 */

public class Server {
	
     private ServerSocket server;
     private Map<PrintWriter,String> map;
     /**
      *  ��ʼ��������
     * @throws IOException 
      */
     public Server() throws IOException{
    	 server=new ServerSocket(8088);
    	 map=new HashMap<PrintWriter,String>();
     }
     public synchronized void addOut(PrintWriter pw,String name){
    	 map.put(pw,name);
     }
     public synchronized void removeOut(PrintWriter pw){
    	 map.remove(pw);
     }
     public synchronized void sentToAll(String message){
    	 Set<Entry<PrintWriter,String>> set=map.entrySet();
    	 Iterator<Entry<PrintWriter,String>> it=set.iterator();
    	 while(it.hasNext()){
    		 Entry<PrintWriter,String> entry=it.next();
    		 entry.getKey().println(message);
    	 }
     }
     public synchronized void sentToOne(PrintWriter p,String message){
    	 
     }
     /**
      *  ����˿�ʼ����
     * @throws IOException 
      */
     public void start() throws IOException{
    	 while(true){
    		 System.out.println("�ȴ��ͻ������ӡ�������������");
    		 Socket socket=server.accept();
    		 String host=socket.getInetAddress().getHostAddress();
    		 System.out.println(host+":"+socket.getLocalPort()+" �ɹ��������ӣ�");
    		 
    		 ClientHandler ch=new ClientHandler(socket);
    		 Thread t=new Thread(ch);
    		 t.start();
    	 }
     }
     
     public static void main(String[] args) {
		try {
			Server server=new Server();
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("������������ʧ�ܣ�");
		}
	}
     /**
      * ���̸߳�����һ���ͻ��˵Ľ���
      * 
      * @author Administrator
      *
      */
     class ClientHandler implements Runnable{
    	 Socket socket;
    	 String host;
    	 String name;
    	 PrintWriter pw;
    	 public ClientHandler(Socket socket){
    		 this.socket=socket;
    		 host=socket.getInetAddress().getHostAddress();
    	 };
		@Override
		public void run() {
			 try {
				
	    		 /**
	    		  *   ServerSocket��accept����,
	    		  *   ��һ�����������������Ǽ�������˿ڣ�ֱ���ͻ������Ӳ�����һ��Socket��
	    		  *   ʹ�ø�Socket����������ӵĿͻ��˽��н���
	    		  *   
	    		  *   Socket�ṩ�ķ���
	    		  *   InputStream getInputStream����
	    		  *   �÷������Ի�ȡһ�����������Ӹ�����ȡ�����ݾ��Ǵ�Զ�˼������������
	    		  *   
	    		  *   OutputStream getOutputStream();
	    		  */
	    		
	    		 
	    		 InputStream in=socket.getInputStream();
	    		 InputStreamReader isr=new InputStreamReader(in,"UTF-8");
	    		 BufferedReader bf=new BufferedReader(isr);
	    		 String mess;
	    		 
	    		 name=bf.readLine();
	    			    		 
	    		 OutputStream out=socket.getOutputStream();
	    		 OutputStreamWriter osw=new OutputStreamWriter(out,"UTF-8");
	    		 pw=new PrintWriter(osw,true);
	    		 
	    		 /**
	    		  *  �����Ե���������뼯�ϣ�Ȼ��ͨ���������ϣ����κ�һ���ͻ��˵�����㲥�����е������
	    		  */
	    		 addOut(pw,name);
	    		 
	    		 /**
	    		  *  bf.readLine �ڶ�ȡ�ͻ��˷��͹�������Ϣʱ��
	    		  *  ���ڿͻ��˶��ߣ��������ϵͳ��ͬ��
	    		  *  �����ȡ��Ľ����ͬ��
	    		  *  ��windows�Ŀͻ��˶Ͽ�ʱ��br.readLine���׳��쳣��
	    		  *  ��linux�Ŀͻ��˶Ͽ�ʱ��br.readLine�᷵��null
	    		  * 
	    		  */
	    		 while(( mess=bf.readLine())!=null){
	    			 System.out.println("����������"+map.size());
	    			 int len;
	    			 String nam;
	    			 String text;
	    			 if(mess.startsWith("@") && ((len=mess.indexOf(':'))!=-1)){
    					 nam=mess.substring(1, len);
    					 text=mess.substring(len+1);
    					 System.out.println(nam+":"+text);
    					
	    			 }else{
	    				 sentToAll(host+":"+name+" ˵��"+mess);
	    			 }
                     
                        
	    		 }
				
			} catch (Exception e) {
				//e.printStackTrace();    //����˵�Ķ������쳣��������,һ�����ע�͵�
			}finally{
				/**
				 * ��ǰ�ͻ��˶˿ڵ��߼�
				 */
				System.out.println(host+"������");
				try {
					 /**
		    		  *  ���û�����ʱ���ڹرո�socket֮ǰ���ȰѸ�socket��pw��list���Ƴ���
		    		  */
		    		 removeOut(pw);
					 System.out.println("����������"+map.size());
					 socket.close();
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
		}
    	 
     }
}
