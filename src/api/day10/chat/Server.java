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
 *  聊天室服务端
 *  
 *  运行在服务器短的ServerSocket主要负责：
 *    1.向系统申请服务端口
 *        客户端就是通过这个端口与之连接的
 *    2.监听申请的服务端口，当一个客户端通过该端口尝试建立连接时，
 *      ServerSocket会在服务器端建立一个Socket与客户端连接
 *      
 * @author Administrator
 *
 */

public class Server {
	
     private ServerSocket server;
     private Map<PrintWriter,String> map;
     /**
      *  初始化服务器
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
      *  服务端开始工作
     * @throws IOException 
      */
     public void start() throws IOException{
    	 while(true){
    		 System.out.println("等待客户端连接。。。。。。。");
    		 Socket socket=server.accept();
    		 String host=socket.getInetAddress().getHostAddress();
    		 System.out.println(host+":"+socket.getLocalPort()+" 成功建立连接！");
    		 
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
			System.out.println("服务器端启动失败！");
		}
	}
     /**
      * 该线程负责处理一个客户端的交互
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
	    		  *   ServerSocket的accept方法,
	    		  *   是一个阻塞方法，作用是监听服务端口，直到客户端连接并创建一个Socket，
	    		  *   使用该Socket即可与刚连接的客户端进行交互
	    		  *   
	    		  *   Socket提供的方法
	    		  *   InputStream getInputStream（）
	    		  *   该方法可以获取一个输入流，从该流读取的数据就是从远端计算机发送来的
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
	    		  *  把所以的输出流加入集合，然后通过遍历集合，把任何一个客户端的输入广播给所有的输出流
	    		  */
	    		 addOut(pw,name);
	    		 
	    		 /**
	    		  *  bf.readLine 在读取客户端发送过来的消息时，
	    		  *  由于客户端断线，而其操作系统不同，
	    		  *  这里读取后的结果不同：
	    		  *  当windows的客户端断开时：br.readLine会抛出异常；
	    		  *  当linux的客户端断开时：br.readLine会返回null
	    		  * 
	    		  */
	    		 while(( mess=bf.readLine())!=null){
	    			 System.out.println("在线人数："+map.size());
	    			 int len;
	    			 String nam;
	    			 String text;
	    			 if(mess.startsWith("@") && ((len=mess.indexOf(':'))!=-1)){
    					 nam=mess.substring(1, len);
    					 text=mess.substring(len+1);
    					 System.out.println(nam+":"+text);
    					
	    			 }else{
	    				 sentToAll(host+":"+name+" 说："+mess);
	    			 }
                     
                        
	    		 }
				
			} catch (Exception e) {
				//e.printStackTrace();    //上面说的断线抛异常就在这里,一般可以注释调
			}finally{
				/**
				 * 当前客户端端口的逻辑
				 */
				System.out.println(host+"下线了");
				try {
					 /**
		    		  *  当用户下线时，在关闭该socket之前，先把该socket的pw从list中移除。
		    		  */
		    		 removeOut(pw);
					 System.out.println("在线人数："+map.size());
					 socket.close();
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
		}
    	 
     }
}
