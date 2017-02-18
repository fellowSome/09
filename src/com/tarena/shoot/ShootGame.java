package com.tarena.shoot;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Arrays;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;

/** 主程序类 */
public class ShootGame extends JPanel {
	public static final int WIDTH = 400;  //窗口�?
	public static final int HEIGHT = 654; //窗口�?
	
	//静�?�资�?(图片)
	public static BufferedImage background; //背景�?
	public static BufferedImage start;      //启动�?
	public static BufferedImage pause;      //暂停�?
	public static BufferedImage gameover;   //游戏结束�?
	public static BufferedImage airplane;   //敌机
	public static BufferedImage bee;        //小蜜�?
	public static BufferedImage bullet;     //子弹
	public static BufferedImage hero0;      //英雄�?0
	public static BufferedImage hero1;      //英雄�?1
	
	public static final int START = 0;     //启动状�??
	public static final int RUNNING = 1;   //运行状�??
	public static final int PAUSE = 2;     //暂停状�??
	public static final int GAME_OVER = 3; //游戏结束状�??
	private int state = START; //当前状�??(默认为启动状�?)
	
	static{ //加载/初始化静态资�?
		try{
			background = ImageIO.read(ShootGame.class.getResource("background.png"));
			start = ImageIO.read(ShootGame.class.getResource("start.png"));
			pause = ImageIO.read(ShootGame.class.getResource("pause.png"));
			gameover = ImageIO.read(ShootGame.class.getResource("gameover.png"));
			airplane = ImageIO.read(ShootGame.class.getResource("airplane.png"));
			bee = ImageIO.read(ShootGame.class.getResource("bee.png"));
			bullet = ImageIO.read(ShootGame.class.getResource("bullet.png"));
			hero0 = ImageIO.read(ShootGame.class.getResource("hero0.png"));
			hero1 = ImageIO.read(ShootGame.class.getResource("hero1.png"));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private Hero hero = new Hero();      //英雄机对�?
	private FlyingObject[] flyings = {}; //敌人(敌机+小蜜�?)数组对象
	private Bullet[] bullets = {};       //子弹数组对象
	
	/** 生成敌人(敌机+小蜜�?)对象 */
	public FlyingObject nextOne(){
		Random rand = new Random(); //随机数对�?
		int type = rand.nextInt(20); //生成0�?19之间的随机数
		if(type < 4){ //若为0则返回小蜜蜂对象
			return new Bee();
		}else{ //若为1�?19则返回敌机对�?
			return new Airplane();
		}
	}
	
	int flyEnteredIndex = 0; //敌人入场计数
	/** 敌人(敌机+小蜜�?)入场 */
	public void enterAction(){ //10毫秒走一�?
		flyEnteredIndex++; //�?10毫秒�?1�?
		if(flyEnteredIndex%40==0){ //400(10*40)毫秒走一�?
			FlyingObject obj = nextOne(); //获取敌人(敌机+小蜜�?)对象
			flyings = Arrays.copyOf(flyings,flyings.length+1); //扩容
			flyings[flyings.length-1] = obj; //将敌人对象赋值给flyings数组的最后一个元�?
		}
	}
	
	/** 飞行�?(敌机+小蜜�?+子弹+英雄�?)走一�? */
	public void stepAction(){ //10毫秒走一�?
		hero.step(); //英雄机走�?�?
		for(int i=0;i<flyings.length;i++){ //遍历�?有敌�?(敌机+小蜜�?)
			flyings[i].step(); //敌人走一�?
		}
		for(int i=0;i<bullets.length;i++){ //遍历�?有子�?
			bullets[i].step(); //子弹走一�?
		}
	}
	
	int shootIndex = 0; //子弹入场计数
	/** 子弹入场(英雄机发射子�?) */
	public void shootAction(){ //10毫秒走一�?
		shootIndex++; //�?10毫秒�?1
		if(shootIndex%30==0){ //300(10*30)毫秒走一�?
			Bullet[] bs = hero.shoot(); //获取子弹对象(由英雄机发射出来�?)
			bullets = Arrays.copyOf(bullets,bullets.length+bs.length); //扩容(bs有几个元素，就扩大几个容�?)
			System.arraycopy(bs,0,bullets,bullets.length-bs.length,bs.length); //数组的追�?(将bs数组追加到bullets数组末尾)
		}
	}
	
	/** 删除越界的飞行物(敌机+小蜜�?+子弹) */
	public void outOfBoundsAction(){
		int index = 0; //1.不越界敌人数组下�?  2.不越界敌人个�?
		FlyingObject[] flyingLives = new FlyingObject[flyings.length]; //不越界敌人数组，初始长度即为flyings的长�?
		for(int i=0;i<flyings.length;i++){ //遍历�?有敌�?
			FlyingObject f = flyings[i]; //获取每一个敌�?
			if(!f.outOfBounds()){ //若不越界
				flyingLives[index] = f; //将不越界敌人对象添加到不越界敌人数组�?
				index++; //1.不越界数组下标增�?  2.不越界敌人个数增�?
			}
		}
		flyings = Arrays.copyOf(flyingLives,index); //将不越界敌人数组复制到flyings中，flyings的长度为index
		
		index = 0; //1.下标归零  2.不越界个数归�?
		Bullet[] bulletLives = new Bullet[bullets.length]; //不越界子弹数组，初始长度即为bullets的长�?
		for(int i=0;i<bullets.length;i++){ //遍历�?有子�?
			Bullet b = bullets[i]; //获取每一个子�?
			if(!b.outOfBounds()){ //若不越界
				bulletLives[index] = b; //将不越界子弹对象添加到不越界子弹数组�?
				index++; //1.不越界数组下标增�?  2.不越界子弹个数增�?
			}
		}
		bullets = Arrays.copyOf(bulletLives,index); //将不越界子弹数组复制到bullets中，bullets的长度为index
	}

	/** �?有子弹与�?有敌�?(敌机+小蜜�?)的碰�? */
	public void bangAction(){
		for(int i=0;i<bullets.length;i++){ //遍历�?有子�?
			Bullet b = bullets[i]; //获取每一个子�?
			bang(b); //�?个子弹与�?有敌人的碰撞
		}
	}
	
	int score = 0; //玩家的得�?
	/** �?个子弹与�?有敌�?(敌机+小蜜�?)的碰�? */
	public void bang(Bullet b){
		int index = -1; //被撞敌人的下�?
		for(int i=0;i<flyings.length;i++){ //遍历�?有敌�?
			FlyingObject f = flyings[i]; //获取每一个敌�?
			if(f.shootBy(b)){ //撞上�?
				index = i; //记录被撞敌人的下�?
				break; //剩余敌人不再比较�?
			}
		}
		if(index!=-1){ //有撞上的
			FlyingObject one = flyings[index]; //获取被撞的敌人对�?
			if(one instanceof Enemy){ //若为敌人
				Enemy e = (Enemy)one; //强转为敌�?
				score += e.getScore(); //玩家得分
			}
			if(one instanceof Award){ //若为奖励
				Award a = (Award)one; //强转为奖�?
				int type = a.getType(); //获取奖励类型
				switch(type){ //根据奖励类型获取不同的奖�?
				case Award.DOUBLE_FIRE:   //若奖励为火力值则
					hero.addDoubleFire(); //英雄机增火力
					break;
				case Award.LIFE:    //若奖励为命则
					hero.addLife(); //英雄机增�?
					break;
				}
			}
			
			//将被撞的敌人对象与数组中的最后一个元素交�?
			FlyingObject t = flyings[index];
			flyings[index] = flyings[flyings.length-1];
			flyings[flyings.length-1] = t;
			//缩容(去掉�?后一个元素，即被撞的敌人对象)
			flyings = Arrays.copyOf(flyings,flyings.length-1);
			
		}
	}
	
	/** �?查游戏是否结�? */
	public void checkGameOverAction(){
		if(isGameOver()){ //若游戏结束则
			state=GAME_OVER; //修改当前状�?�为游戏结束状�??
		}
	}
	
	/** 判断游戏是否结束 返回true表示游戏结束 */
	public boolean isGameOver(){
		for(int i=0;i<flyings.length;i++){ //遍历�?有敌�?
			FlyingObject f = flyings[i]; //获取每一个敌�?
			if(hero.hit(f)){ //撞上�?
				hero.subtractLife(); //英雄机减�?
				hero.clearDoubleFire(); //英雄机清空火力�??
				//将被撞的敌人对象与数组中的最后一个元素交�?
				FlyingObject t = flyings[i];
				flyings[i] = flyings[flyings.length-1];
				flyings[flyings.length-1] = t;
				//缩容(去掉�?后一个元素，即被撞的敌人对象)
				flyings = Arrays.copyOf(flyings,flyings.length-1);
			}
		}
		return hero.getLife()<=0; //英雄机命�?<=0，即为游戏结�?
	}
	
	/** 启动程序的执�? */
	public void action(){
		//鼠标侦听�?
		MouseAdapter l = new MouseAdapter(){
			/** 重写鼠标移动事件 */
			public void mouseMoved(MouseEvent e){
				if(state==RUNNING){ //当前状�?�为运行状�?�时操作
					int x = e.getX(); //鼠标的x坐标
					int y = e.getY(); //鼠标的y坐标
					hero.moveTo(x, y); //英雄机随�?鼠标�?
				}
			}
			/** 重写鼠标点击事件 */
			public void mouseClicked(MouseEvent e){
				switch(state){ //根据当前状�?�做不同操作
				case START: //启动状�?�时
					state=RUNNING; //当前状�?�变为运行状�?
					break;
				case GAME_OVER: //游戏结束状�?�时
					score = 0; //清理现场，数据归�?
					hero = new Hero();
					flyings = new FlyingObject[0];
					bullets = new Bullet[0];
					state=START; //当前状�?�变为启动状�?
					break;
				}
			}
			/** 重写鼠标移出事件 */
			public void mouseExited(MouseEvent e){
				if(state==RUNNING){ //运行状�?�时变为暂停状�??
					state=PAUSE;
				}
			}
			/** 重写鼠标移入事件 */
			public void mouseEntered(MouseEvent e){
				if(state==PAUSE){ //暂停状�?�时变为运行状�??
					state=RUNNING;
				}
			}
		};
		this.addMouseListener(l); //处理鼠标操作事件
		this.addMouseMotionListener(l); //处理鼠标滑动事件
		
		Timer timer = new Timer(); //定时器对�?
		int intervel = 10; //定时的间�?(以毫秒为单位)
		timer.schedule(new TimerTask(){
			public void run(){ //定时干的那个�?(10毫秒�?�?)
				if(state==RUNNING){ //当前状�?�为运行状�?�时操作
					enterAction(); //敌人(敌机+小蜜�?)入场
					stepAction();  //飞行�?(敌机+小蜜�?+子弹+英雄�?)走一�?
					shootAction(); //子弹入场(英雄机发射子�?)
					outOfBoundsAction(); //删除越界的飞行物(敌机+小蜜�?+子弹)
					bangAction();  //子弹与敌�?(敌机+小蜜�?)的碰�?
					checkGameOverAction(); //�?查游戏是否结�?
				}
				repaint();     //重画(调用paint()方法)
			}
		},intervel,intervel); //定时计划
	}
	
	/** 重写paint() g:画笔 */
	public void paint(Graphics g){
		g.drawImage(background,0,0,null); //画背景图
		paintHero(g); //画英雄机对象
		paintFlyingObjects(g); //画敌�?(敌机+小蜜�?)对象
		paintBullets(g); //画子弹对�?
		paintScoreAndLife(g); //画分和画�?
		paintState(g); //画状�?
	}
	/** 画英雄机对象 */
	public void paintHero(Graphics g){
		g.drawImage(hero.image,hero.x,hero.y,null); //画英雄机对象
	}
	/** 画敌�?(敌机+小蜜�?)对象 */
	public void paintFlyingObjects(Graphics g){
		for(int i=0;i<flyings.length;i++){ //遍历敌人(敌机+小蜜�?)数组
			FlyingObject f = flyings[i]; //获取每一个敌�?(敌机+小蜜�?)
			g.drawImage(f.image,f.x,f.y,null); //画敌�?(敌机+小蜜�?)对象
		}
	}
	/** 画子弹对�? */
	public void paintBullets(Graphics g){
		for(int i=0;i<bullets.length;i++){ //遍历子弹数组
			Bullet b = bullets[i]; //获取每一个子�?
			g.drawImage(b.image,b.x,b.y,null);
		}
	}
	/** 画分和画�? */
	public void paintScoreAndLife(Graphics g){
		g.setColor(new Color(0xFF0000)); //设置颜色(纯红)
		g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,24)); //设置字体样式(字体:SANS_SERIF 样式:BOLD加粗 字号:24)
		g.drawString("SCORE: "+score,10,25); //画分
		g.drawString("LIFE: "+hero.getLife(),10,45); //画命
	}
	/** 画状�? */
	public void paintState(Graphics g){
		switch(state){ //根据当前状�?�画不同的图
		case START: //启动状�?�时画启动图
			g.drawImage(start,0,0,null);
			break;
		case PAUSE: //暂停状�?�时画暂停图
			g.drawImage(pause,0,0,null);
			break;
		case GAME_OVER: //游戏结束状�?�时画游戏结束图
			g.drawImage(gameover,0,0,null);
			break;
		}
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Fly"); //创建窗口对象
		ShootGame game = new ShootGame(); //创建面板对象
		frame.add(game); //将面板添加到窗口�?
		
		frame.setSize(WIDTH, HEIGHT); //设置窗口大小
		frame.setAlwaysOnTop(true); //设置总是在最上面
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置默认关闭操作(关闭窗口中�??出程�?)
		frame.setLocationRelativeTo(null); //设置窗口位置(居中)
		frame.setVisible(true); //1.设置窗口可见  2.尽快调用paint()
		
		game.action(); //启动程序的执�?
	}
}









