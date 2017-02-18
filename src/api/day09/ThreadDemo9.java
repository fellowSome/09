package api.day09;

/**
	 *  void join()
	 *   
	 *  join方法可以使调用该方法的线程进入阻塞状态，
	 *  直到该方法所使用线程完成工作才会解除调用该方法线程的阻塞状态。
	 *  
	 *  join一般用于多个线程直接的同步工作
	 * 
	 */
public class ThreadDemo9 {
	//表示图片是否下载完毕
	public static boolean isFinish=false;
	public static void main(String[] args) {
	    final Thread t1=	new Thread(){               //关于final的说明，t2指向的是一个匿名局部内部类，
	    	                                            //t2里面调用了main方法的局部变量t1；在java1.8之前，要求这个局部变量用final修饰。
	    	                                            //这也是上面的 isFinish要定义在main方法外部的原因
			public void run(){
				System.out.println("开始下载：");
				for(int i=1;i<101;i++){
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(70);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println("下载完毕");
			}
		};
		
		Thread t2=new Thread(){
			public void run(){
				System.out.println("开始显示图片");
				if(!isFinish){
				   try {
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				isFinish=true;
				System.out.println("图片显示完毕");
			}
			
		};
		
		t1.start();
		t2.start();

	}

}
