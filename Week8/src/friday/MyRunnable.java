package friday;

public class MyRunnable implements Runnable{
	
	private Thread thread;
	private String threadName;
	
	public MyRunnable(String threadName) {
		System.out.println("Creating" + threadName);
		this.threadName = threadName;
	}
	
	

	@Override
	public void run() {
		try {
			for(int i=10; i>0; i--) {
				System.out.println(i +" Thread " + threadName);
			}
		
			Thread.sleep(50);
			} catch (InterruptedException e) {
				System.out.println("Thread " +  threadName + " interrupted.");
			e.printStackTrace();
		}
		
		System.out.println("Thread " + threadName + " is existing");
		
	}
	
	public void start() {
		System.out.println("Starting " + threadName);
		if(thread==null) {
			thread = new Thread(this, threadName);
			thread.start();
		}
	}	
}
