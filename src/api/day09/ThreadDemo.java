package api.day09;
/**
 * ��һ�ִ����̵߳ķ�ʽ
 * �̳�Thread����дrun���������������߳�Ҫִ�е�����
 * 
 * �ô����̵߳ķ�ʽ���������㣺
 * 1.����java�ǵ��̳У����̳���Thread��Ͳ��ܼ̳�������
 * 2.���ڼ̳���Thread����дrun�����������͹涨���߳�ִ�е�����
 *   �⵼���߳�������֮��ı�Ȼ��Ϲ�ϵ���������̵߳����á�
 * 
 * @author Administrator
 *
 */
public class ThreadDemo {

	public static void main(String[] args) {
		Thread t1=new MyThread1();
		Thread t2=new MyThread2();
		/**
		 *  �����߳�Ҫָ��start����������������ֱ�ӵ���run����������run�����������߳�Ҫִ�е�
		 *  ���񡣵��̵߳�start�������������ú��߳̾ͽ�����runnable״̬��һ����ȡcpuʱ�䣬
		 *  run���������ᱻ�Զ�����
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
				System.out.println("����˭ѽ��");
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
		    	System.out.println("���ǲ�ˮ��ģ�");
			}
		}
	}
}