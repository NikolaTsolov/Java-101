package blocking_queue;

public class Main {
	public static void main(String[] args) {
		BlockingQueue queue = new BlockingQueue();
		Producer p1 = new Producer(queue);
		//Producer p2 = new Producer(queue);
		//Consumer c2 = new Consumer(queue);
		Consumer c1 = new Consumer(queue);
		p1.start();
		//p2.start();
		c1.start();
		//c2.start();
	}
}
