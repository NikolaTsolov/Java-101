package friday;
import java.lang.Math;

public class Line {
	
	private Point A;
	private Point B;
	
	public Line(Point A, Point B) {
		if(A.equals(B)) {
			System.out.println("Cannot create a line segment with zero lenght");
		} else {
			this.A = A;
			this.B = B;
		}
	}
	
	public Line(Line a) {
		this(a.getA(), a.getB());
	}
	
	public Point getA() {
		return this.A;
	}
	
	public Point getB() {
		return this.B;
	}
	
	public double getLenght() {
		double sideA = this.A.getX() - this.B.getX();
		double sideB = this.A.getY() - this.B.getY();
		double len = sideA * sideA + sideB * sideB;
		return Math.sqrt(len);
	}
	
	public String toString() {
		return "Line[("+this.A.getX()+", "+this.A.getY()+"), ("
				+this.B.getX()+", "+this.B.getY()+")]";
	}
	
	public boolean equals(Line BC) {
		boolean areEquals1 = this.A.getX() == BC.getA().getX() 
				&& this.A.getY() == BC.getA().getY();
		boolean areEquals2 = this.B.getX() == BC.getB().getX() 
				&& this.B.getY() == BC.getB().getY();
		
		return  areEquals1 && areEquals2;
	}
	
	public double compare(Line A, Line B) {
		return A.getLenght() - B.getLenght();
	}
	
	public int hashCode() {
		int hash = 17;
	    hash = hash * 23 + this.A.hashCode();
	    hash = hash * 23 + this.B.hashCode();
	    return hash;
	}
}
