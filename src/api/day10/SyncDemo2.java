package api.day10;

/**
 *  同步块
 *  有效的缩小同步范围可以在保证并发安全的同时提高并发效率
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
			System.out.println(t.getName()+":正在挑衣服");
			Thread.sleep(5000);
			synchronized(this){
			   System.out.println(t.getName()+"正在试衣服");
			   Thread.sleep(5000);
			}
			
			
			System.out.println("结账离开");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}