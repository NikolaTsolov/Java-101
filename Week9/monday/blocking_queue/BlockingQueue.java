package blocking_queue;

import java.util.LinkedList;

public class BlockingQueue {

	private LinkedList<Integer> queue = new LinkedList<>();
	private int MAX_SIZE = 100;

	public synchronized void qAdd(int value) {
		while (queue.size() > MAX_SIZE) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		queue.add(value);
		notifyAll();
	}

	public synchronized int qPoll() {
		while (queue.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		notifyAll();
		return queue.poll();
	}

}