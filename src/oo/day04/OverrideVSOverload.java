package oo.day04;

public class OverrideVSOverload {
    public static void main(String[] args){
    	Goo goo=new Goo();
    	Eoo o=new Foo();//向上造型
    	goo.test(o);    //重载看引用（调test(Eoo o)),重写看对象（调Foo的o.show())
    }
}
class Goo{
	void test(Eoo o){
		System.out.println("父类参数");
		o.show();
	}
	void test(Foo o){
		System.out.println("子类参数");
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
