package oo.day04;

public class StaticDemo {

	public static void main(String[] args) {
		Loo o1=new Loo();
		o1.show();
		
		Loo o2=new Loo();
		o2.show();
		
		System.out.println(Loo.b);
		System.out.println(o1.b);  //������
		
		Moo.test();
		
		Noo n3=new Noo();
		Noo n4=new Noo();
		

	}

}


class Noo{
	static{
		System.out.println("��̬��");
	}
	Noo(){
		System.out.println("��̬����");
	}
}


class Moo{
	int a;
	static int b;
	void show(){
		System.out.println(a);
		System.out.println(b);
		
	}
    static void test(){
    	//System.out.println(a);  //�������
    	System.out.println(b);
    }
}

class Loo{
	int a;
	static int b;
	Loo(){
		a++;
		b++;
	}
	void show(){
		System.out.println(a);
		System.out.println(b);
	}
}
