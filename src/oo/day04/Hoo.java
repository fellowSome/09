package oo.day04;

public class Hoo {

	public int a;     //���࣬ͬ���࣬���࣬������
	protected int b; //���࣬ͬ���࣬����
	int c;            //���࣬ͬ����
	private int d;   //����
	
	void  show(){
		a=1;
		b=2;
		c=3;
		d=4;
	}
}
class  Ioo{        //��ʾ private
	void show(){
		Hoo hoo=new Hoo();
		hoo.a=1;
		hoo.b=2;
		hoo.c=3;
		//hoo.d=4   //����
	}
}
