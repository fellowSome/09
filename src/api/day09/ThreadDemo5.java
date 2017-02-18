package api.day09;

/**
 *  获取线程相关信息的方法
 * 
 * @author Administrator
 *
 */
public class ThreadDemo5 {

	public static void main(String[] args) {
		// 获取main方法的线程
		Thread main=Thread.currentThread();
		//获取线程id
		long id=main.getId();
		System.out.println(id);
		
		String name=main.getName();
		System.out.println(name);
		
		int priority=main.getPriority();
		System.out.println(priority);
		
		boolean isAlive=main.isAlive();
		System.out.println(isAlive);
		
		boolean isDeamon=main.isDaemon();
		System.out.println(isDeamon);
		
		boolean isInterrupted=main.isInterrupted();
		System.out.println(isInterrupted);
		

	}

}
