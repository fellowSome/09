package api.day10;

/**
 *  ������
 *  synchronizedҲ�л�����������
 *  ʹ��synchronized���ζ�δ��룬ֻҪ���ǵ�
 *  ͬ����ض�����ͬ����ô�⼸�δ������ǻ����ϵ������
 *  ����̲߳���ͬʱִ����Щ����
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
		 * ������������ͬ����һ����������a�������Ե�t1��methodAû��ִ�����ʱ��t2ֻ����methodB�ȴ�
		 */
		synchronized(a){
		  System.out.println("���ڴ���A");
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
	}
	public void methodB(){
		synchronized(a){
		   System.out.println("���ڵ���B");
		   try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
	}
}
