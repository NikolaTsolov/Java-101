package monday.MyBlockingQueue;

public class Consumer<E> implements Runnable {
	
	private MyBlockingQueue<E> queue;
	private Thread t = null;
	private Producer<E> p;
	
	public Consumer(MyBlockingQueue<E> queue, Producer<E> p) {
		this.queue = queue;
		this.p = p;
	}

	@Override
	public void run() {
		while(queue.isEmpty() || p.isAlive()) {
			System.out.println(queue.poll());
		}
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
