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
 *  聊天室客户端
 *  
 * @author Administrator
 *
 */
public class Client {
    /**
     *   java.net.Socket
     *   封装了TCP协议，使用它就可以基于TCP协议进行网络通信
     *   Socket是运行在客户端的
     */
	private Socket socket;
	/**
	 *  构造方法，用来初始化客户端
	 *  实例化Socket时需要传两个参数：
	 *    1.服务器端地址：通过ip地址找到服务器
	 *    2.服务器端端口：通过端口找到服务器上的应用
	 *    
	 *  实例化Socket的过程是连接的过程，若远程计算机没反应就会抛出异常
	 * 
	 * @throws Exception
	 */
	public Client() throws Exception{
		System.out.println("正在连接服务器。。。。");
		socket=new Socket("176.46.3.120",8088);
		System.out.println("与服务器建立连接！");
	}
	/**
	 *  启动客户端
	 * @throws IOException 
	 */
	public void start() throws IOException{
		try {
			/**
			 *  Socket提供的方法：
			 *  OutputStream getOutputStream（）
			 *  获取一个字节数出流，通过该流写出的数据会被发送至远端计算机
			 */
			OutputStream out=socket.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(out,"UTF-8");
			PrintWriter pw=new PrintWriter(osw,true);
			
			
			/**
			 *  启动线程处理服务器发回来的消息
			 */
			ServerHandler sh=new ServerHandler();
			Thread tc=new Thread(sh);
			tc.start();
			
			Scanner sc=new Scanner(System.in);
			/**
			 * 先发个昵称给服务器
			 */
			System.out.println("请输入昵称：");
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
			System.out.println("客户端启动失败！");
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
