package api.day10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *  线程池
 *  线程池主要有两个作用：
 *    1.重用线程
 *    2.控制线程数量
 *  
 *  当我们的应用需要创建大量线程或者发现线程会频繁创建和销毁时就应当考虑用线程池来维护
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
        		
        			System.out.println("正在运行线程："+t.getName());
        			try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
        		}
        	};
        	threadPool.execute(runable);
        }
		threadPool.shutdown();       //执行玩任务后停止。而 trheadPool.shutdowmNow()是强制终止线程池
		System.out.println("线程池停止了");
		
		
	}

}
