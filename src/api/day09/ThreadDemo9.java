package api.day09;

/**
	 *  void join()
	 *   
	 *  join��������ʹ���ø÷������߳̽�������״̬��
	 *  ֱ���÷�����ʹ���߳���ɹ����Ż������ø÷����̵߳�����״̬��
	 *  
	 *  joinһ�����ڶ���߳�ֱ�ӵ�ͬ������
	 * 
	 */
public class ThreadDemo9 {
	//��ʾͼƬ�Ƿ��������
	public static boolean isFinish=false;
	public static void main(String[] args) {
	    final Thread t1=	new Thread(){               //����final��˵����t2ָ�����һ�������ֲ��ڲ��࣬
	    	                                            //t2���������main�����ľֲ�����t1����java1.8֮ǰ��Ҫ������ֲ�������final���Ρ�
	    	                                            //��Ҳ������� isFinishҪ������main�����ⲿ��ԭ��
			public void run(){
				System.out.println("��ʼ���أ�");
				for(int i=1;i<101;i++){
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(70);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println("�������");
			}
		};
		
		Thread t2=new Thread(){
			public void run(){
				System.out.println("��ʼ��ʾͼƬ");
				if(!isFinish){
				   try {
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				isFinish=true;
				System.out.println("ͼƬ��ʾ���");
			}
			
		};
		
		t1.start();
		t2.start();

	}

}
