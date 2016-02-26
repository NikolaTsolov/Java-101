package friday;

public class TestThread {
	public static void main(String args[]) {
		MyRunnable T1 = new MyRunnable("Messanger1");
		T1.start();
		MyRunnable T2 = new MyRunnable("Messanger2");
		T2.start();
		
	}
}
