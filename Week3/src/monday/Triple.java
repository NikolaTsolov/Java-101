package monday;

public class Triple <T1, T2, T3> {
	
	private T1 first;
	private T2 second;
	private T3 third;
	
	public void set_first(T1 first) {
		this.first = first;
	}
	
	public void set_second(T2 second) {
		this.second = second;
	}
	
	public void set_third(T3 third) {
		this.third = third;
	}
	
	public T1 get_first() {
		return first;
	}
	
	public T2 get_second() {
		return second;
	}
	
	public T3 get_third() {
		return third;
	}
	
	public String toString() {
		return first.toString() + " " + second.toString()
				+ " " + third.toString();
	}

}
