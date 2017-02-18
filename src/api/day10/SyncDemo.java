package api.day10;

/**
 *  多线程并发访问同一资源时，就会形成“抢”的现象，
 *  由于线程切换时间不确定，可能导致执行代码顺序混乱，严重时导致系统瘫痪
 *  
 * 
 * @author Administrator
 *
 */
public class SyncDemo {

	public static void main(String[] args) {
		final Table table=new Table();
		Thread t1=new Thread(){
			public void run(){
				while(true){
					int b=table.getBean();
					System.out.println(this.currentThread().getName()+":"+b);
				}
			}
		};
        t1.start();
        Thread t2=new Thread(){
			public void run(){
				while(true){
					int b=table.getBean();
					System.out.println(this.currentThread().getName()+":"+b);
				}
			}
		};
        t2.start();
	}

}
class Table{
	private int beans=20;
	/**
	 * 一个方法被synchronized 修饰后，该方法为同步方法，即多个线程不能同时进入方法内部执行。
	 * 对于成员方法而言，synthronized会在一个线程调用该方法时将该对象所属对象枷锁。
	 * 其他线程在执行该方法时由于执行方法的线程未被释放，所以只能在方法外阻塞，
	 * 直到持有方法锁的线程将方法执行完毕
	 * @return
	 */
	public synchronized int getBean(){
		if(beans==0){
			throw new RuntimeException("没有豆子了");
		}
	//	Thread.yield();
		return beans--;
		
	}
	
}
