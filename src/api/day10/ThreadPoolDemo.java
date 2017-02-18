package api.day10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *  �̳߳�
 *  �̳߳���Ҫ���������ã�
 *    1.�����߳�
 *    2.�����߳�����
 *  
 *  �����ǵ�Ӧ����Ҫ���������̻߳��߷����̻߳�Ƶ������������ʱ��Ӧ���������̳߳���ά��
 * 
 * @author Administrator
 *
 */
public class ThreadPoolDemo {

	public static void main(String[] args) {
		
		ExecutorService threadPool=Executors.newFixedThreadPool(2);
		for(int i=0;i<5;i++){
            Runnable runable=new Runnable(){
        	    Thread t=Thread.currentThread();
        	    public void run(){
        		
        			System.out.println("���������̣߳�"+t.getName());
        			try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
        		}
        	};
        	threadPool.execute(runable);
        }
		threadPool.shutdown();       //ִ���������ֹͣ���� trheadPool.shutdowmNow()��ǿ����ֹ�̳߳�
		System.out.println("�̳߳�ֹͣ��");
		
		
	}

}
