package api.day09;

/**
 *  static Thread currentThread();
 *  ��ȡ���е�ǰ�������̡߳�
 * 
 * @author Administrator
 *
 */
public class ThreadDemo4 {

	public static void main(String[] args) {
		Thread main=Thread.currentThread();
		System.out.println("����main�������߳��ǣ�"+main);
		
		doSome();
		
		new Thread(){
			public void run(){
				Thread t=Thread.currentThread();
				System.out.println("����run�������߳��ǣ�"+t);
				
				doSome();
			}
		}.start();
	}
	public static void doSome(){
		Thread some=Thread.currentThread();
		System.out.println("����doSome�������߳��ǣ�"+some);
	}

}
