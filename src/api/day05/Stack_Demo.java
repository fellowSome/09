package api.day05;

import java.util.Deque;
import java.util.LinkedList;

/**
 *  java.tuil.Deque
 *  ˫����У����˶����Խ����Ķ���
 *  ��ֻ���ô�һ�εĽ�������ʱ�����γ��ˡ�ջ��
 *  
 *  ջ���洢һ��Ԫ�أ���ȡ��ѭ�Ƚ������ԭ��
 *      ������ʵ�ֺ��˹��ܣ���windows��Դ�������ǰ�������˹��ܾͿ���������ջʵ�֣�
 * @author Administrator
 *
 */
public class Stack_Demo {

	public static void main(String[] args) {
		Deque<String> stack =new LinkedList<String>();
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		stack.push("five");
		
		System.out.println(stack);
		
		for(String s:stack){       //�������
		   System.out.println(s);
		}
		
		while(stack.size()>0){    //�Ƴ�����
			System.out.println(stack.poll());   
		}
		
	}

}
