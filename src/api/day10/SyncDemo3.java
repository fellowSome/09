package api.day10;

/**
 *  ͬ����
 *  ��Ч����Сͬ����Χ�����ڱ�֤������ȫ��ͬʱ��߲���Ч��
 *  
 * @author Administrator
 *
 */
public class SyncDemo3{

	public static void main(String[] args) {
		Shop shop1=new Shop();
		Shop shop2=new Shop();
		Thread t1=new Thread(){
			public void run(){
				shop1.buy();       //������޹�
			}
		};
		Thread t2=new Thread(){
			public void run(){
				shop2.buy();      //������޹� �����Խ���ǣ�û��ס��
			}
		};
        
		t1.start();
		t2.start();
	}

}
