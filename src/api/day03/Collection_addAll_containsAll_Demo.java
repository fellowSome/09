package api.day03;
/**
 * boolean addAll(E e)
 * ֻҪ�������е�Ԫ�ط����仯�ͷ���true��
 * 
 * boolean removeAll(E e)
 * ֻҪ�������е�Ԫ�ط����仯�ͷ���true;
 * 
 * 
 * boolean containsAll��E e��
 * �жϵ�ǰ�����Ƿ������������������Ԫ�أ���equals�Ƚ���
 * 
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Collection_addAll_containsAll_Demo {

	public static void main(String[] args) {
		Collection co=new HashSet();
		co.add("java");
		co.add("c");
		co.add("c++");
		
		Collection co2=new ArrayList();
		co2.add("java");
		co2.add("php");
		co2.add("js");
		co2.add("java");
		
		co.addAll(co2);
		System.out.println(co);   //�����[c++, java, c, php, js]
		                          //��Ȼco2�еġ�java��û�мӽ�ȥ������������true��
		                          //��Ϊco�е�Ԫ�ط����˱仯
		
		Collection co3=new ArrayList();
		co3.add("java");
		co3.add("php");
		co3.add("python");
		
		co.removeAll(co3);
		System.out.println(co);   //��Ȼco��û�С�python������co�е�Ԫ�ط����˱仯������true��
		                           //���ҿ���ɾ����γ��ֵ�Ԫ��java
        
		System.out.println(co.containsAll(co3));
	}

}
