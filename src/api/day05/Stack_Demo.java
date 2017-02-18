package api.day05;

import java.util.Deque;
import java.util.LinkedList;

/**
 *  java.tuil.Deque
 *  双向队列，两端都可以进出的队列
 *  当只调用从一段的进出方法时，就形成了“栈”
 *  
 *  栈：存储一组元素，存取遵循先进后出的原则，
 *      常用于实现后退功能（如windows资源浏览器的前进、后退功能就可以用两个栈实现）
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
		
		for(String s:stack){       //无损遍历
		   System.out.println(s);
		}
		
		while(stack.size()>0){    //移出遍历
			System.out.println(stack.poll());   
		}
		
	}

}
