package api.day09;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *  static void sleep(long ms)
 *  
 * �߳��ṩ�ľ�̬����sleep����ʹ���и÷������߳̽������״ָ̬�����룬
 * ָ��ʱ����������Զ�����runnable״̬
 * 
 * 
 * @author Administrator
 *
 */
public class ThreadDemo7 {

	public static void main(String[] args) {
		
	new Thread(){
			
			SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
			public void run(){
				while(true){
					
					try {
						
						System.out.println(sdf.format(new Date()));
						this.sleep(1000);
					} catch (InterruptedException e) {
					
						e.printStackTrace();
					}
					
				}
			}
		}.start();;

	}

}
