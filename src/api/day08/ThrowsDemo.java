package api.day08;

/**
 * 重写父类一个含有throws异常抛出声明的方法时，
 * 子类该方法的throws的重写原则
 *   1.可以在重写该方法时，不声明trhows（不抛出异常）
 *   2.可以在重写该方法时，抛出父类中的部分异常
 *   3.可以在重写该方法时，抛出父类异常的子类型异常
 *   
 *   4.不可以抛出额外的异常
 *   5.不可以抛出父类异常的父异常
 * @author Administrator
 *
 */
public class ThrowsDemo {

	public static void main(String[] args) {
		

	}

}
