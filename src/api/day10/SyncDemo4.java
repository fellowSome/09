package api.day10;

/**
 *  互斥锁
 *  synchronized也叫互斥锁，即：
 *  使用synchronized修饰多段代码，只要他们的
 *  同步监控对象相同，那么这几段代码间就是互斥关系，即：
 *  多个线程不能同时执行这些代码
 * 
 * @author Administrator
 *
 */
public class SyncDemo4 {

	public static void main(String[] args) {
		final Boo boo=new Boo();
		Thread t1=new Thread(){
			public void run(){
				boo.methodA();
			}
		};
		Thread t2=new Thread(){
			public void run(){
				boo.methodB();
			}
		};
		t1.start();
		t2.start();

	}

}
class Boo{
	private Integer a=new Integer(2);
	public  void methodA(){
		/**
		 * 两个方法上了同样的一把锁（都是a），所以当t1的methodA没有执行完毕时，t2只能在methodB等待
		 */
		synchronized(a){
		  System.out.println("正在代用A");
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
	}
	public void methodB(){
		synchronized(a){
		   System.out.println("正在调用B");
		   try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
	}
}
