package api.day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue;
 * 队列可以存储一组元素，但是存取元素必须遵循
 * “先进先出”原则
 * 
 * java.util.LinkedList处理实现List接口外
 * 也实现了Queue接口
 * LinkedList也实现了Queue的子接口Deque，它允许在队列两端双向进出（offer/poll)
 * 
 * @author Administrator
 *
 */
public class Queue_LinkedList_Demo {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		/**
		 * boolean offer(E e)
		 * 入队操作，将元素追加到队列末尾
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		queue.offer("five");
        System.out.println(queue);
        
        /**
         * E poll();
         * 移除队列中第一个元素
         */
        while(queue.size()>0){
	        
	        System.out.println(queue.poll());
        }
        
        /**
         * E peek();
         * 获取队列中第一个元素（仅仅是获取，不移除）
         */
        System.out.println(queue.peek());
        System.out.println(queue);
	}

}
