package com.tarena.shoot;
import java.awt.image.BufferedImage;

/** è±éæ?: æ¯é£è¡ç© */
public class Hero extends FlyingObject{
	private int life; //å?
	private int doubleFire; //ç«åå?
	private BufferedImage[] images; //å¾çæ°ç»(ç¨äºä¸¤å¼ è±éæºå¾ççåæ¢)
	private int index; //åå©å¾çåæ¢
	
	/** æé? æ¹æ³? */
	public Hero(){
		image = ShootGame.hero0; //å¾ç
		width = image.getWidth();   //å®?
		height = image.getHeight(); //é«?
		x = 150; //åºå®çxåæ 
		y = 400; //åºå®çyåæ 
		life = 3; //å½æ°ä¸?3
		doubleFire = 0; //ç«åå¼ä¸º0(åå?ç«å?)
		images = new BufferedImage[]{ShootGame.hero0,ShootGame.hero1}; //å¾çæ°ç»(hero0åhero1)
		index = 0; //é»è®¤è®¾ç½®ä¸?0
	}
	
	/** éåstep() */
	public void step(){ //10æ¯«ç§èµ°ä¸æ¬?
		image = images[index++/10%images.length]; //100æ¯«ç§åæ¢ä¸?æ¬?
		
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

	/** è±éæºåå°å­å¼?(çæå­å¼¹å¯¹è±¡) */
	public Bullet[] shoot(){
		int xStep = this.width/4; //1/4è±éæºçå®?
		if(doubleFire>0){ //åå??
			Bullet[] bs = new Bullet[2];
			bs[0] = new Bullet(this.x+1*xStep,this.y-20); //x:è±éæºçx+1/4è±éæºçå®?  y:è±éæºçy-20
			bs[1] = new Bullet(this.x+3*xStep,this.y-20); //x:è±éæºçx+3/4è±éæºçå®?  y:è±éæºçy-20
			doubleFire-=2; //åå°ä¸?æ¬¡ååç«åï¼åç«åå?¼å2
			return bs;
		}else{ //åå??
			Bullet[] bs = new Bullet[1];
			bs[0] = new Bullet(this.x+2*xStep,this.y-20); //x:è±éæºçx+2/4è±éæºçå®?  y:è±éæºçy-20			
			return bs;
		}
	}
	
	/** è±éæºéç?é¼ æ å?  x:é¼ æ çxåæ  y:é¼ æ çyåæ  */
	public void moveTo(int x,int y){
		this.x = x-this.width/2;  //è±éæºçx=é¼ æ çx-1/2è±éæºçå®?
		this.y = y-this.height/2; //è±éæºçy=é¼ æ çy-1/2è±éæºçé«?
	}
	
	/** éåoutOfBounds */
	public boolean outOfBounds(){
		return false; //æ°¸ä¸è¶ç
	}

	/** å å½ */
	public void addLife(){
		life++; //å½æ°å?1
	}
	
	/** è·åå? */
	public int getLife(){
		return life; //è¿åå½æ°
	}
	
	/** åå½ */
	public void subtractLife(){
		life--; //å½æ°å?1
	}
	
	/** å ç«åå?? */
	public void addDoubleFire(){
		doubleFire+=40; //ç«åå¼å 40
	}

	/** æ¸ç©ºç«åå? */
	public void clearDoubleFire(){
		doubleFire = 0; //ç«åå¼å½é?
	}
	
	/** è±éæºä¸æäººçç¢°æ?  this:è±éæ?  other:æäºº*/
	public boolean hit(FlyingObject other){
		int x1 = other.x-this.width/2;             //x1:æäººçx+1/2è±éæºçå®?
		int x2 = other.x+other.width+this.width/2; //x2:æäººçx+æäººçå®½+1/2è±éæºçå®?
		int y1 = other.y-this.height/2; //y1:æäººçy-1/2è±éæºçé«?
		int y2 = other.y+other.height+this.height/2; //y2:æäººçy+æäººçé«+1/2è±éæºçé«?
		int x = this.x+this.width/2; //x:è±éæºçx+1/2è±éæºçå®?
		int y = this.y+this.height/2; //y:è±éæºçy+1/2è±éæºçé«?
		
		return x>=x1 && x<=x2
			   &&
			   y>=y1 && y<=y2; //xå¨x1åx2ä¹é´ï¼å¹¶ä¸ï¼yå¨y1åy2ä¹é´ï¼å³ä¸ºæä¸äº
			   
	}
	
}











