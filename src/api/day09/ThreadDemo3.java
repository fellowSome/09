package api.day09;

/**
 *  使用你们内部类的形式来完成方式一与方式二的线程创建
 * 
 * @author Administrator
 *
 */
public class ThreadDemo3 {

	public static void main(String[] args) {
		//方式一
		Thread t1=new MyThread2();
		t1.start();
		//方式二
		new Thread(new MyRunnable1(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("你是谁呀？");
				}
			}
		}).start();

	}

}
