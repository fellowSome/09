package com.tarena.shoot;
import java.awt.image.BufferedImage;

/** 英雄�?: 是飞行物 */
public class Hero extends FlyingObject{
	private int life; //�?
	private int doubleFire; //火力�?
	private BufferedImage[] images; //图片数组(用于两张英雄机图片的切换)
	private int index; //协助图片切换
	
	/** 构�?�方�? */
	public Hero(){
		image = ShootGame.hero0; //图片
		width = image.getWidth();   //�?
		height = image.getHeight(); //�?
		x = 150; //固定的x坐标
		y = 400; //固定的y坐标
		life = 3; //命数�?3
		doubleFire = 0; //火力值为0(单�?�火�?)
		images = new BufferedImage[]{ShootGame.hero0,ShootGame.hero1}; //图片数组(hero0和hero1)
		index = 0; //默认设置�?0
	}
	
	/** 重写step() */
	public void step(){ //10毫秒走一�?
		image = images[index++/10%images.length]; //100毫秒切换�?�?
		
		/*
		index++;
		int a = index/10;
		int b = a%2;
		image = images[b];
		*/
		/*
		 * 10M  index=1  a=0 b=0
		 * 20M  index=2  a=0 b=0
		 * 30M  index=3  a=0 b=0
		 * ...
		 * 100M index=10 a=1 b=1
		 * 110M index=11 a=1 b=1
		 * 120M index=12 a=1 b=1
		 * ...
		 * 200M index=20 a=2 b=0
		 * 210M index=21 a=2 b=0
		 * ...
		 * 300M index=30 a=3 b=1
		 */
	}

	/** 英雄机发射子�?(生成子弹对象) */
	public Bullet[] shoot(){
		int xStep = this.width/4; //1/4英雄机的�?
		if(doubleFire>0){ //双�??
			Bullet[] bs = new Bullet[2];
			bs[0] = new Bullet(this.x+1*xStep,this.y-20); //x:英雄机的x+1/4英雄机的�?  y:英雄机的y-20
			bs[1] = new Bullet(this.x+3*xStep,this.y-20); //x:英雄机的x+3/4英雄机的�?  y:英雄机的y-20
			doubleFire-=2; //发射�?次双倍火力，则火力�?�减2
			return bs;
		}else{ //单�??
			Bullet[] bs = new Bullet[1];
			bs[0] = new Bullet(this.x+2*xStep,this.y-20); //x:英雄机的x+2/4英雄机的�?  y:英雄机的y-20			
			return bs;
		}
	}
	
	/** 英雄机随�?鼠标�?  x:鼠标的x坐标 y:鼠标的y坐标 */
	public void moveTo(int x,int y){
		this.x = x-this.width/2;  //英雄机的x=鼠标的x-1/2英雄机的�?
		this.y = y-this.height/2; //英雄机的y=鼠标的y-1/2英雄机的�?
	}
	
	/** 重写outOfBounds */
	public boolean outOfBounds(){
		return false; //永不越界
	}

	/** 加命 */
	public void addLife(){
		life++; //命数�?1
	}
	
	/** 获取�? */
	public int getLife(){
		return life; //返回命数
	}
	
	/** 减命 */
	public void subtractLife(){
		life--; //命数�?1
	}
	
	/** 加火力�?? */
	public void addDoubleFire(){
		doubleFire+=40; //火力值加40
	}

	/** 清空火力�? */
	public void clearDoubleFire(){
		doubleFire = 0; //火力值归�?
	}
	
	/** 英雄机与敌人的碰�?  this:英雄�?  other:敌人*/
	public boolean hit(FlyingObject other){
		int x1 = other.x-this.width/2;             //x1:敌人的x+1/2英雄机的�?
		int x2 = other.x+other.width+this.width/2; //x2:敌人的x+敌人的宽+1/2英雄机的�?
		int y1 = other.y-this.height/2; //y1:敌人的y-1/2英雄机的�?
		int y2 = other.y+other.height+this.height/2; //y2:敌人的y+敌人的高+1/2英雄机的�?
		int x = this.x+this.width/2; //x:英雄机的x+1/2英雄机的�?
		int y = this.y+this.height/2; //y:英雄机的y+1/2英雄机的�?
		
		return x>=x1 && x<=x2
			   &&
			   y>=y1 && y<=y2; //x在x1和x2之间，并且，y在y1和y2之间，即为撞上了
			   
	}
	
}











