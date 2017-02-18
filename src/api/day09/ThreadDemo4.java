package api.day09;

/**
 *  static Thread currentThread();
 *  获取运行当前方法的线程。
 * 
 * @author Administrator
 *
 */
public class ThreadDemo4 {

	public static void main(String[] args) {
		Thread main=Thread.currentThread();
		System.out.println("运行main方法的线程是："+main);
		
		doSome();
		
		new Thread(){
			public void run(){
				Thread t=Thread.currentThread();
				System.out.println("运行run方法的线程是："+t);
				
				doSome();
			}
		}.start();
	}
	public static void doSome(){
		Thread some=Thread.currentThread();
		System.out.println("运行doSome方法的线程是："+some);
	}

}
