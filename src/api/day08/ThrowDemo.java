package api.day08;

/**
 * �����쳣���׳�
 * 
 * @author Administrator
 *
 */
public class ThrowDemo {

	public static void main(String[] args) {
		Person p=new Person();
		try{
		   p.setAge(200);
		} catch (ExceptionBySelfeDefine e) {
			e.printStackTrace();
		}
        System.out.println(p.getAge());
	}

}
class Person{
	private int age;
    
	public Person(){
		
	}
	public Person(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws ExceptionBySelfeDefine {
		if(age<0 || age>130){
		    throw new ExceptionBySelfeDefine("���䲻�Ϸ�");
		}
		this.age = age;
	}
	
}
