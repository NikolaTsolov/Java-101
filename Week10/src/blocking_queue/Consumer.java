package blocking_queue;

public class Consumer extends Thread {
	private BlockingQueue queue;
	private int ELEMENTS_TO_POLL = 1000000;
	
	public Consumer(BlockingQueue queue) {
		this.queue = queue;
	}

	public void run() {
		for (int i = ELEMENTS_TO_POLL; i > 0; i--) {
			System.out.println(queue.qPoll());
		}
	}
}
