package api.day09;

/**
 *  ʹ�������ڲ������ʽ����ɷ�ʽһ�뷽ʽ�����̴߳���
 * 
 * @author Administrator
 *
 */
public class ThreadDemo3 {

	public static void main(String[] args) {
		//��ʽһ
		Thread t1=new MyThread2();
		t1.start();
		//��ʽ��
		new Thread(new MyRunnable1(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("����˭ѽ��");
				}
			}
		}).start();

	}

}
