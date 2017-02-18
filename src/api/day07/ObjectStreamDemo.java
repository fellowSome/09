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
 *  对象流用于读写对象
 * 
 *  对象流是一对高级流，作用是方便读写java中的对象
 *  
 * 一、 java.io.ObjectOutputStream
 *  对象输出流，可以将给定的对象转换为一组字节后写出
 *  
 *  1.oos将Person对象转换为一组字节
 *    将一个对象转换为一组字节的过程，
 *    称为：对象序列化
 *    
 *  2.在通过fos将对象写到硬盘
 *    将对象转换的字节写入硬盘做长久报错的过程，
 *    称为：对象持久化
 *    
 * 二、java.io.ObjectInputStream
 * 对象输入流，作业是可以进行对象反序列化
 * 读取一组字节并还原成对象
 * 
 * 
 * @author Administrator
 *
 */
public class ObjectStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Person p=new Person();
		p.setName("苍老师");
		p.setAge(22);
		p.setGender("女");
		List<String> list=new ArrayList<String>();
		list.add("是一名演员");
		list.add("声音甜美");
		list.add("喜欢写大字");
		list.add("广大男性同胞的启蒙老师");
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
