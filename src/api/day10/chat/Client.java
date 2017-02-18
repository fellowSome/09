package api.day10.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *  �����ҿͻ���
 *  
 * @author Administrator
 *
 */
public class Client {
    /**
     *   java.net.Socket
     *   ��װ��TCPЭ�飬ʹ�����Ϳ��Ի���TCPЭ���������ͨ��
     *   Socket�������ڿͻ��˵�
     */
	private Socket socket;
	/**
	 *  ���췽����������ʼ���ͻ���
	 *  ʵ����Socketʱ��Ҫ������������
	 *    1.�������˵�ַ��ͨ��ip��ַ�ҵ�������
	 *    2.�������˶˿ڣ�ͨ���˿��ҵ��������ϵ�Ӧ��
	 *    
	 *  ʵ����Socket�Ĺ��������ӵĹ��̣���Զ�̼����û��Ӧ�ͻ��׳��쳣
	 * 
	 * @throws Exception
	 */
	public Client() throws Exception{
		System.out.println("�������ӷ�������������");
		socket=new Socket("176.46.3.120",8088);
		System.out.println("��������������ӣ�");
	}
	/**
	 *  �����ͻ���
	 * @throws IOException 
	 */
	public void start() throws IOException{
		try {
			/**
			 *  Socket�ṩ�ķ�����
			 *  OutputStream getOutputStream����
			 *  ��ȡһ���ֽ���������ͨ������д�������ݻᱻ������Զ�˼����
			 */
			OutputStream out=socket.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(out,"UTF-8");
			PrintWriter pw=new PrintWriter(osw,true);
			
			
			/**
			 *  �����̴߳������������������Ϣ
			 */
			ServerHandler sh=new ServerHandler();
			Thread tc=new Thread(sh);
			tc.start();
			
			Scanner sc=new Scanner(System.in);
			/**
			 * �ȷ����ǳƸ�������
			 */
			System.out.println("�������ǳƣ�");
			String name=sc.nextLine();
			pw.println(name);
			while(true){
				
				pw.println(sc.nextLine());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		try {
			Client client =new Client();
			client.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�ͻ�������ʧ�ܣ�");
		}
	}
	class ServerHandler implements Runnable{

		@Override
		public void run() {
			try {
				InputStream in=socket.getInputStream();
				InputStreamReader isw=new InputStreamReader(in,"UTF-8");
				BufferedReader br=new BufferedReader(isw);
				String reback;
				while((reback=br.readLine())!=null){
					System.out.println(reback);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
