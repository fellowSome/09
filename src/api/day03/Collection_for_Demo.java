package api.day03;

/**
 * 增強for循环
 * java1.5以后推出的特性
 * 业界也习惯称之为：新循环，增强循环，for each
 * 
 * 新循环不取代就循环的工作，仅仅用来遍历集合或数组
 * 
 * 新循环只被编译器认可，jvm不认可，所以编译器会将新循环修改为迭代器，
 * 因此不能通过集合的方法增删元素！！！！！！！
 * 
 * @author Administrator
 *
 */
public class Collection_for_Demo {

	public static void main(String[] args) {
		
			String[] array={"one","two","three","four"};
			for(String str:array){
				System.out.println(str);
			}
	}

}
