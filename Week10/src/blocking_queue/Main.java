package blocking_queue;

public class Main {
	public static void main(String[] args) {
		BlockingQueue <Integer> queue = new BlockingQueue<>();
		Producer p1 = new Producer(queue);
		//Producer p2 = new Producer(queue);
		//Consumer c2 = new Consumer(queue);
		Consumer c1 = new Consumer(queue);
		Thread t = new Thread(p1);
		Thread tt = new Thread(c1);
		long tStart = System.currentTimeMillis();
		t.start();
		//p2.start();
		tt.start();
		//c2.start();
		long tEnd = System.currentTimeMillis();
		System.out.println("Time needed" + (tStart - tEnd));
	}
}
