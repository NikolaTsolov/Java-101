package blocking_queue;

public class Consumer extends Thread {
	public BlockingQueue queue;

	public Consumer(BlockingQueue queue) {
		this.queue = queue;
	}

	public void run() {
		for (int i = 1000000; i > 0; i--) {
			System.out.println(queue.qPoll());
		}
	}
}
