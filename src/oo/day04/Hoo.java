package oo.day04;

public class Hoo {

	public int a;     //本类，同包类，子类，其他类
	protected int b; //本类，同包类，子类
	int c;            //本类，同包类
	private int d;   //本类
	
	void  show(){
		a=1;
		b=2;
		c=3;
		d=4;
	}
}
class  Ioo{        //演示 private
	void show(){
		Hoo hoo=new Hoo();
		hoo.a=1;
		hoo.b=2;
		hoo.c=3;
		//hoo.d=4   //报错
	}
}
