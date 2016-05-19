package monday.MyBlockingQueue;

import java.util.LinkedList;

public class MyBlockingQueue<E> {

	private LinkedList<E> queue;
	private int maxSize;

	public MyBlockingQueue(int maxSize) {
		queue = new LinkedList<>();
		this.maxSize = maxSize;
	}

	public synchronized void add(E element) {
		while (queue.size() > maxSize) {
			try {
				System.out.println("I am full");
				System.out.println();
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		queue.add(element);
		notifyAll();

	}

	public synchronized E poll() {
		while (queue.isEmpty()) {
			try {
				System.out.println("I am empty");
				System.out.println();
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		notifyAll();
		return queue.poll();
	}
	
	public boolean isEmpty() {
		synchronized (queue) {
			return queue.isEmpty();
		}		
	}

}
