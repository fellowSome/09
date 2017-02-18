package api.day07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *  ���������ڶ�д����
 * 
 *  ��������һ�Ը߼����������Ƿ����дjava�еĶ���
 *  
 * һ�� java.io.ObjectOutputStream
 *  ��������������Խ������Ķ���ת��Ϊһ���ֽں�д��
 *  
 *  1.oos��Person����ת��Ϊһ���ֽ�
 *    ��һ������ת��Ϊһ���ֽڵĹ��̣�
 *    ��Ϊ���������л�
 *    
 *  2.��ͨ��fos������д��Ӳ��
 *    ������ת�����ֽ�д��Ӳ�������ñ���Ĺ��̣�
 *    ��Ϊ������־û�
 *    
 * ����java.io.ObjectInputStream
 * ��������������ҵ�ǿ��Խ��ж������л�
 * ��ȡһ���ֽڲ���ԭ�ɶ���
 * 
 * 
 * @author Administrator
 *
 */
public class ObjectStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Person p=new Person();
		p.setName("����ʦ");
		p.setAge(22);
		p.setGender("Ů");
		List<String> list=new ArrayList<String>();
		list.add("��һ����Ա");
		list.add("��������");
		list.add("ϲ��д����");
		list.add("�������ͬ����������ʦ");
		p.setOtherInfo(list);
		
		FileOutputStream fos=new FileOutputStream("fos.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.close();
		
		FileInputStream fis=new FileInputStream("fos.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
	    Person pp=(Person)ois.readObject();
        System.out.println(pp.toString());
        ois.close();
	}

}
class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private String name;
	private int age;
	private String gender;
	private List<String> otherInfo;
	
	Person(){
		
	}
	
	public Person(String name, int age, String gender, List<String> otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(List<String> otherInfo) {
		this.otherInfo = otherInfo;
	}
	public String toString(){
		return name+","+age+","+gender+","+otherInfo;
	}
	
}
