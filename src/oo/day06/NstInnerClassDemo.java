package oo.day06;
//�����ڲ���
public class NstInnerClassDemo {

	public static void main(String[] args) {
		final int num=5;
		
		//1.����Inter2��һ�����࣬��û������
		//2.Ϊ�����ഴ����һ������ ���� o1
		//3.�������������������
		Inter2 o1=new Inter2(){};
	
		Inter3 o3=new Inter3(){
			public void show() {
				System.out.println(num);
				System.out.println("abc");
			}
			
		};
		o3.show();

	}

}
interface Inter3{
	void show();
}
interface Inter2{
	
}