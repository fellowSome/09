package api.day10;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueDemo {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<Integer> queue=new ArrayBlockingQueue<Integer>(10);
		for(int i=0;i<20;i++){
			queue.offer(i, 5000,TimeUnit.MILLISECONDS);
			System.out.println(queue.toString());
			queue.poll(5000, TimeUnit.MILLISECONDS);
			System.out.println(queue.toString());
		}
	}

}
