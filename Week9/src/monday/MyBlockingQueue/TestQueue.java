package monday.MyBlockingQueue;

import java.util.LinkedList;

public class TestQueue {

	public static void main(String[] args) {

		MyBlockingQueue<Integer> mq = new MyBlockingQueue<>(10000);
		LinkedList<Integer> l = new LinkedList<>();

		for (int i = 0; i < 100000; i++) {
			l.add(i);
		}

		Producer<Integer> pr1 = new Producer<>(mq, l);
		Consumer<Integer> cn1 = new Consumer<>(mq, pr1);
		Consumer<Integer> cn2 = new Consumer<>(mq, pr1);
		Consumer<Integer> cn3 = new Consumer<>(mq, pr1);
		Consumer<Integer> cn4 = new Consumer<>(mq, pr1);
		long startTime = System.currentTimeMillis();
		pr1.start();
		cn1.start();
		cn2.start();
		cn3.start();
		cn4.start();
		while (pr1.isAlive() || cn1.isAlive() || cn2.isAlive() || cn3.isAlive() || cn4.isAlive()) {

		}
		System.out.println("It took:" + (System.currentTimeMillis() - startTime) + "ms");

	}

}
