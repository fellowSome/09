package api.day09;
/**
 * 第一种创建线程的方式
 * 继承Thread并重写run（）方法来调用线程要执行的任务
 * 
 * 该创建线程的方式有两个不足：
 * 1.由于java是单继承，当继承了Thread后就不能继承其他类
 * 2.由于继承了Thread后重写run（）方法，就规定了线程执行的任务，
 *   这导致线程与任务之间的必然耦合关系，不利于线程的重用。
 * 
 * @author Administrator
 *
 */
public class ThreadDemo {

	public static void main(String[] args) {
		Thread t1=new MyThread1();
		Thread t2=new MyThread2();
		/**
		 *  启动线程要指定start（）方法，而不是直接调用run（）方法，run（）方法是线程要执行的
		 *  任务。当线程的start（）方法被调用后，线程就进入了runnable状态，一旦获取cpu时间，
		 *  run（）方法会被自动调用
		 */
		t1.start();
		t2.start();
	}
}
class MyThread1 extends Thread{
	public void run(){
		for(int i=0; i<1000;i++)	{
			if(i==999){
				System.out.println("????????????????");
			}else{
				System.out.println("你是谁呀？");
			}
		}
	}
}
class MyThread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			if(i==999){
				System.out.println("!!!!!!!!!!!!!!!!");
			}else{
		    	System.out.println("我是查水表的！");
			}
		}
	}
}