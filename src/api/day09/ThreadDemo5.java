package api.day09;

/**
 *  ��ȡ�߳������Ϣ�ķ���
 * 
 * @author Administrator
 *
 */
public class ThreadDemo5 {

	public static void main(String[] args) {
		// ��ȡmain�������߳�
		Thread main=Thread.currentThread();
		//��ȡ�߳�id
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
