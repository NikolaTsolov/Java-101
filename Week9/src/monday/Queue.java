package monday;

import java.util.LinkedList;

public class Queue<T>{
	
	public LinkedList list = new LinkedList<>();
	
	
	public T poll() {
		while(list.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		T first = (T) list.getFirst();
		list.removeFirst();
		return first;
	}
	
	public class Que implements LinkedList {
		
	}
	
	
}
