package api.day09;

/**
 *  守护进出，又称为后台进程
 *  
 *  当一个进程中的所有前台线程都结束时，进程就要结束，若还有后退线程运行，那么后台线程会
 *  被强制结束
 * 
 * @author Administrator
 *
 */
public class ThreadDemo8 {

	public static void main(String[] args) {
		Thread rose=new Thread(){
			public void run(){
				for(int i=0;i<10;i++){
				    System.out.println("let me go");
				    try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊");
				System.out.println("噗通！");
			}
		};
		
		Thread jack=new Thread(){
			  public void run(){
				  while(true){
					  System.out.println("u jump,i jump!");
					  try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				  }
			  }
		};
		
		jack.setDaemon(true);
		rose.start();
		jack.start();

	}

}
