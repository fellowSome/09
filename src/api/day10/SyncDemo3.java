package api.day10;

/**
 *  同步块
 *  有效的缩小同步范围可以在保证并发安全的同时提高并发效率
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
				shop1.buy();       //与对象无关
			}
		};
		Thread t2=new Thread(){
			public void run(){
				shop2.buy();      //与对象无关 ，测试结果是，没锁住哈
			}
		};
        
		t1.start();
		t2.start();
	}

}
