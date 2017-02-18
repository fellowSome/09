package com.tarena.shoot;
import java.util.Random;

/** 敌机: 是飞行物，也是敌�? */
public class Airplane extends FlyingObject implements Enemy {
	private int speed = 2; //移动的�?�度
	/** 构�?�方�? */
	public Airplane(){
		image = ShootGame.airplane; //图片
		width = image.getWidth();   //�?
		height = image.getHeight(); //�?
		Random rand = new Random(); //随机数对�?
		x = rand.nextInt(ShootGame.WIDTH-this.width); //x:0�?(窗口�?-敌机�?)之间的随机数
		y = -this.height; //y:负的敌机的高
	}
	
	/** 重写getScore() */
	public int getScore(){
		return 5; //打掉�?个敌机得5�?
	}

	/** 重写step() */
	public void step(){
		y+=speed; //y+(向下)
	}

	/** 重写outOfBounds */
	public boolean outOfBounds(){
		return this.y>=ShootGame.HEIGHT; //敌机的y>=窗口的高，即为越�?
	}
}





