package friday;

public class Point {
	
	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(Point point) {
		this(point.x, point.y);
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public static String origin() {
		return "Point(0, 0)";
	}
	
	public String toString() {
		return "Point("+this.x+", "+this.y+")";
	}
	
	public boolean equals(double x, double y) {
		return this.x == x && this.y == y;
	}
	
	public int hashCode() {
        int hash = 17;
        Double X = this.x;
        Double Y = this.y;
        hash = hash * 23 + X.hashCode();
        hash = hash * 23 + Y.hashCode();
        return hash;
	}
	
	public static Line Add(Point A, Point B) {
		Line AB = new Line(A, B);
		return AB;
	}
}
