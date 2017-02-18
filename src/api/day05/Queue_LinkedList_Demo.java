package api.day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue;
 * ���п��Դ洢һ��Ԫ�أ����Ǵ�ȡԪ�ر�����ѭ
 * ���Ƚ��ȳ���ԭ��
 * 
 * java.util.LinkedList����ʵ��List�ӿ���
 * Ҳʵ����Queue�ӿ�
 * LinkedListҲʵ����Queue���ӽӿ�Deque���������ڶ�������˫�������offer/poll)
 * 
 * @author Administrator
 *
 */
public class Queue_LinkedList_Demo {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		/**
		 * boolean offer(E e)
		 * ��Ӳ�������Ԫ��׷�ӵ�����ĩβ
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		queue.offer("five");
        System.out.println(queue);
        
        /**
         * E poll();
         * �Ƴ������е�һ��Ԫ��
         */
        while(queue.size()>0){
	        
	        System.out.println(queue.poll());
        }
        
        /**
         * E peek();
         * ��ȡ�����е�һ��Ԫ�أ������ǻ�ȡ�����Ƴ���
         */
        System.out.println(queue.peek());
        System.out.println(queue);
	}

}
