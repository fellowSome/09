package api.day10;

/**
 *  ͬ����
 *  ��Ч����Сͬ����Χ�����ڱ�֤������ȫ��ͬʱ��߲���Ч��
 *  
 * @author Administrator
 *
 */
public class SyncDemo2 {

	public static void main(String[] args) {
		Shop shop=new Shop();
		Thread t1=new Thread(){
			public void run(){
				shop.buy();
			}
		};
		Thread t2=new Thread(){
			public void run(){
				shop.buy();
			}
		};
        
		t1.start();
		t2.start();
	}

}
class Shop{
	public void buy(){
		Thread t=Thread.currentThread();
		try{
			System.out.println(t.getName()+":�������·�");
			Thread.sleep(5000);
			synchronized(this){
			   System.out.println(t.getName()+"�������·�");
			   Thread.sleep(5000);
			}
			
			
			System.out.println("�����뿪");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}