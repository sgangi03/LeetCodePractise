package concurrency;

import java.util.concurrent.BlockingQueue;

public class ConsumerBQ extends Thread {

	BlockingQueue<Integer> queue;
	
	ConsumerBQ(BlockingQueue<Integer> queue){
		this.queue=queue;
	}
	
	
	@Override
public void run() {
		
	try {
		while(!queue.isEmpty())
		System.out.println(queue.take());
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
