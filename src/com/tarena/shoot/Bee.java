package com.tarena.shoot;

import java.util.Random;

/** 小蜜�?: 是飞行物，也是奖�? */
public class Bee extends FlyingObject implements Award{
	private int xSpeed = 1; //x坐标移动速度
	private int ySpeed = 2; //y坐标移动速度
	private int awardType; //奖励类型
	/** 构�?�方�? */
	public Bee(){
		image = ShootGame.bee; //图片
		width = image.getWidth();   //�?
		height = image.getHeight(); //�?
		Random rand = new Random(); //随机数对�?
		x = rand.nextInt(ShootGame.WIDTH-this.width); //x:0�?(窗口�?-蜜蜂�?)之间的随机数 
		y = -this.height; //y:负的蜜蜂的高
		awardType = rand.nextInt(2); //奖励类型�?0�?1之间的随机数
	}
	
	/** 重写getType() */
	public int getType(){
		return awardType; //返回奖励类型(0�?1)
	}

	/** 重写step() */
	public void step(){
		x += xSpeed; //x+(向右/向左)
		y += ySpeed; //y+(向下)
		if(this.x >= ShootGame.WIDTH-this.width){ //蜜蜂的x>=(屏幕�?-蜜蜂�?)时，意味�?到最右边了，应向�?(即为�?)
			xSpeed = -1;
		}
		if(this.x <= 0){ //蜜蜂的x<=0，意味着到最左边了，应向�?(即为�?)
			xSpeed = 1;
		}
	}

	/** 重写outOfBounds */
	public boolean outOfBounds(){
		return this.y>=ShootGame.HEIGHT; //蜜蜂的y>=窗口的高，即为越�?
	}
}











