package concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class blocingq {

	public static void main(String[] args) {
		
	
	 BlockingQueue<Integer> queue=new ArrayBlockingQueue<Integer>(10);
	 
	 Thread p=new ProducerBQ(queue);
	 Thread c=new ConsumerBQ(queue);
	 p.start();
	 c.start();
	
	}
}
