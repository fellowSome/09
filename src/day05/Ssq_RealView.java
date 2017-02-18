package day05;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolTip;

public class Ssq_RealView extends JPanel {
	public static BufferedImage backImage;
	public static BufferedImage background;
	
	
	static {
		try {
			backImage = ImageIO.read(Ssq_RealView.class.getResource("red.png"));
			background = ImageIO.read(Ssq_RealView.class.getResource("background.png"));
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static List<Ball> balls;
	public static Ball ball = null;

	
	public static void main(String[] args) {

		loader();

		JFrame jf = new JFrame("玩转双色球");
		jf.setSize(280, 180);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);

		Ssq_RealView ssqr = new Ssq_RealView();
		ssqr.setSize(280, 100);
		jf.add(ssqr,BorderLayout.CENTER);

		JPanel jp = new JPanel();
		jp.setSize(280, 80);
		jp.setLocation(0, 300);
		

		JButton jb = new JButton("开始机选");
		jb.setSize(30, 30);
		
	    jb.addMouseListener(new MouseAdapter(){
	    	public void mouseClicked(MouseEvent e){
	    		if(balls.size()>6){
		    		Random rd=null;
		    		int t=0;
		    		String str="";
		    		for(int i=0;i<6;i++){
		    			rd=new Random();
		    			t=rd.nextInt(balls.size());
		    			str+=" "+balls.get(t).getDigital();
		    			//balls.remove(t);  			
		    		}
		    		System.out.println(str);
	    		}else{
	    			System.out.println("the count of red ball too less");
	    		}
	    	}
	    });
       
	    
		jp.add(jb,BorderLayout.EAST);
		

		jf.add(jp,BorderLayout.SOUTH);
   
		// jf.setResizable(false);
		jf.setVisible(true);
       
		ssqr.mouseEve();

	}
	public static void loader(){
		balls = new ArrayList<Ball>();
		for (int i = 1; i < 34; i++) {
			Ball b = new Ball(i);
			b.setDigital(i);
			if (i > 22) {
				b.setX((i - 22) * 20);
				b.setY(40);
			} else if (i > 11) {
				b.setX((i - 11) * 20);
				b.setY(20);
			} else {
				b.setX(i * 20);
				b.setY(0);
			}
			balls.add(b);

		}
	}

	private int x;
	private int y;
	private int x_t;
	private int y_t;

	private void mouseEve() {
		MouseAdapter m = new MouseAdapter() {
			public void mousePressed(MouseEvent e) {	
					if (ball == null) {
						for (int i = 0; i < balls.size(); i++) {
							Ball ba = balls.get(i);
							if (e.getX() >= ba.getX() && (e.getX() <= ba.getX() + ba.getWidth()) && e.getY() >= ba.getY()
									&& (e.getY() <= ba.getY() + ba.getHeight())) {
								x_t=ba.getX();
								y_t=ba.getY();
								ball = ba;
								System.out.print(ball.getDigital()+" ");
								break;
							}
						}
					}else{
						ball.setX(x_t);
						ball.setY(y_t);
						ball=null;
					}
			}

			public void mouseMoved(MouseEvent e) {
				x = e.getX();
				y = e.getY();
			}

			public void mouseExited(MouseEvent e) {
				if (ball != null) {
					balls.remove(ball);
					ball = null;
				}
			}
		};

		this.addMouseListener(m);
		this.addMouseMotionListener(m);
		Timer timer = new Timer();
		int intervel = 10;
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				repaint();
			}
		}, intervel, intervel);
	}

	public void draw(Graphics g) {
		int t;
		for (int i = 0; i < balls.size(); i++) {
			if (ball != null && ball == balls.get(i)) {
				ball.moveTo(x, y);
				g.drawImage(backImage, ball.getX(), ball.getY(), null);
			} else {
				if (i > 22) {
					t = i - 22;
					g.drawImage(backImage, balls.get(i).getX(), balls.get(i).getY(), null);
				} else if (i > 11) {
					t = i - 11;
					g.drawImage(backImage, balls.get(i).getX(), balls.get(i).getY(), null);
				} else {
					g.drawImage(backImage, balls.get(i).getX(), balls.get(i).getY(), null);

				}
			}
		}
	}

	public void paint(Graphics g) {
		g.drawImage(background, 0, 0, this);
		draw(g);
	}

}

class Ball extends JPanel {
	private int x;
	private int y;
	private int width;
	private int height;
	private BufferedImage image;
	private int digital;

	Ball(int i) {
		image = Ssq_RealView.backImage;
		width = image.getWidth();
		height = image.getHeight();
		this.digital = i;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDigital() {
		return digital;
	}

	public void setDigital(int digital) {
		this.digital = digital;
	}

	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return this.digital + "," + this.x + "," + this.y;
	}
}
