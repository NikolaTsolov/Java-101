package monday.MyBlockingQueue;

import java.util.LinkedList;

public class Producer<E> implements Runnable {
	
	private MyBlockingQueue<E> queue;
	private LinkedList<E> list;
	private Thread t = null;
	
	public Producer(MyBlockingQueue<E> queue, LinkedList<E> list) {
		this.queue = queue;
		this.list = list;
	}

	@Override
	public void run() {
		for (E e : list) {
			queue.add(e);
		}
		System.out.println("Finished with adding");
	}
	
	public void start() {
		t = new Thread(this);
		t.start();
	}
	
	public boolean isAlive() {
		if(t != null) {
			return t.isAlive();
		}
		return false;
	}

	
	
}
