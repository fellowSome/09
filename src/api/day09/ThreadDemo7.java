package api.day09;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *  static void sleep(long ms)
 *  
 * 线程提供的静态方法sleep可以使运行该方法的线程进入赌赛状态指定毫秒，
 * 指定时间结束，会自动进入runnable状态
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
