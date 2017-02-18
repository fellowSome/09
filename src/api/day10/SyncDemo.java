package api.day10;

/**
 *  ���̲߳�������ͬһ��Դʱ���ͻ��γɡ�����������
 *  �����߳��л�ʱ�䲻ȷ�������ܵ���ִ�д���˳����ң�����ʱ����ϵͳ̱��
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
	 * һ��������synchronized ���κ󣬸÷���Ϊͬ��������������̲߳���ͬʱ���뷽���ڲ�ִ�С�
	 * ���ڳ�Ա�������ԣ�synthronized����һ���̵߳��ø÷���ʱ���ö����������������
	 * �����߳���ִ�и÷���ʱ����ִ�з������߳�δ���ͷţ�����ֻ���ڷ�����������
	 * ֱ�����з��������߳̽�����ִ�����
	 * @return
	 */
	public synchronized int getBean(){
		if(beans==0){
			throw new RuntimeException("û�ж�����");
		}
	//	Thread.yield();
		return beans--;
		
	}
	
}
