package oo.day04;

public class OverrideVSOverload {
    public static void main(String[] args){
    	Goo goo=new Goo();
    	Eoo o=new Foo();//��������
    	goo.test(o);    //���ؿ����ã���test(Eoo o)),��д�����󣨵�Foo��o.show())
    }
}
class Goo{
	void test(Eoo o){
		System.out.println("�������");
		o.show();
	}
	void test(Foo o){
		System.out.println("�������");
		o.show();
	}
}
class Eoo {
	void show(){
		System.out.println("Eoo");
	}
}
class Foo extends Eoo{
	void show(){
		System.out.println("Foo");
	}
}
