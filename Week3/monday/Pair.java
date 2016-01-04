package monday;

public class Pair <T1, T2>{
	
	private T1 first;
	private T2 second;
	
	public void set_first(T1 first) {
		this.first = first;
	}
	
	public void set_second(T2 second) {
		this.second = second;
	}
	
	public T1 get_first() {
		return first;
	}
	
	public T2 get_second() {
		return second;
	}
	
	public String toString() {
		return first.toString() + " " + second.toString();
	}

}
