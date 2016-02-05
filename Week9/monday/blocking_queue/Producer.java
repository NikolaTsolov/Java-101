package blocking_queue;

import java.util.Random;

public class Producer extends Thread {

	public BlockingQueue queue;

	public Producer(BlockingQueue queue) {
		this.queue = queue;
	}

	public void run() {
		Random rand = new Random();
		for (int i = 1000000; i > 0; i--) {
			int randInt = rand.nextInt(101) + 0;
			queue.qAdd(randInt);
		}
	}

}
