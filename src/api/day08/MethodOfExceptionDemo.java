package api.day08;

/**
 * Exception常用方法
 * 
 * @author Administrator
 *
 */
public class MethodOfExceptionDemo {

	public static void main(String[] args) {
		try {
			String str = "abc";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
		}

	}

}
