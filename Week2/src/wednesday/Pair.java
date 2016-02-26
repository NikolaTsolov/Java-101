package wednesday;

public final class Pair {

	final private Object one;
	final private Object two;
	
	public Pair(Object one, Object two) {
		this.one = one;
		this.two = two;
	}

	public Object get_a() {
		return one;
	}

	public Object get_b() {
		return two;
	}

	public String toString() {
		return one + ", " + two;
	}

	public boolean equals(Pair secondPair) {
		return (this.one.equals(secondPair.one) && (this.two.equals(secondPair.two)));

	}
	
	public static void main(String[] args) {
		Pair oposites = new Pair('o', 'u');
		System.out.println(oposites);
		Pair point = new Pair(3, 4);
		
		System.out.println(point);
		
	}

}
