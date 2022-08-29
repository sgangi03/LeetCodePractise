package concurrency;

import java.util.concurrent.BlockingQueue;

public class ProducerBQ extends Thread {

	BlockingQueue<Integer> queue;
	
	ProducerBQ(BlockingQueue<Integer> queue){
		this.queue=queue;
	}
	
	
	@Override
public void run() {
		
		for(int i=0;i<100000;i++)
		{
			
			try {
				queue.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
