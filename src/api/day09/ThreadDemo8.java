package api.day09;

/**
 *  �ػ��������ֳ�Ϊ��̨����
 *  
 *  ��һ�������е�����ǰ̨�̶߳�����ʱ�����̾�Ҫ�����������к����߳����У���ô��̨�̻߳�
 *  ��ǿ�ƽ���
 * 
 * @author Administrator
 *
 */
public class ThreadDemo8 {

	public static void main(String[] args) {
		Thread rose=new Thread(){
			public void run(){
				for(int i=0;i<10;i++){
				    System.out.println("let me go");
				    try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("������������������������������");
				System.out.println("��ͨ��");
			}
		};
		
		Thread jack=new Thread(){
			  public void run(){
				  while(true){
					  System.out.println("u jump,i jump!");
					  try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				  }
			  }
		};
		
		jack.setDaemon(true);
		rose.start();
		jack.start();

	}

}
