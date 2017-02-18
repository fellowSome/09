package oo.day04.vis;

import oo.day04.Hoo;

public class Joo{      //演示 同包
	void show(){
		Hoo o=new Hoo();
		o.a=1;
		//o.b=2;  报错
		//o.b=3;  报错
		//o.c=4;  报错	
	}

}
class Koo extends Hoo{    //挎包继承  ，演示子类
	void show(){
		a=1;
	    b=2;
	   // c=3;   报错
	   // d=4;   报错
	}
}
