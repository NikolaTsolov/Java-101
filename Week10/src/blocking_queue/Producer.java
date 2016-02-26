package blocking_queue;

import java.util.Random;

public class Producer extends Thread {

	private BlockingQueue queue;
	private int ELEMENTS_TO_ADD = 1000000;
	
	public Producer(BlockingQueue queue) {
		this.queue = queue;
	}

	public void run() {
		Random rand = new Random();
		for (int i = ELEMENTS_TO_ADD; i > 0; i--) {
			int randInt = rand.nextInt(101) + 0;
			queue.qAdd(randInt);
		}
	}

}
