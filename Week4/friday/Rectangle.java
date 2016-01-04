package friday;

import java.lang.Math;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Rectangle {

	private Point D;
	private Point B;

	public Rectangle(Point D, Point B) {
		boolean one = D.getX() * B.getX() > 0;
		boolean two = D.getY() * B.getY() > 0;
		if (one || two) {
			System.out.println("Points are on the same axis");
		} else {
			this.D = D;
			this.B = B;
		}
	}

	public Point getUpperLeft() {
		return this.D;
	}

	public Point getUpperRight() {
		Point C = new Point(this.B.getX(), this.D.getY());
		return C;
	}

	public Point getLowerRight() {
		return this.B;
	}

	public Point getLowerLeft() {
		Point A = new Point(this.D.getX(), this.B.getY());
		return A;
	}

	public Line getUpperLine() {
		Line DC = new Line(this.getUpperLeft(), this.getUpperRight());
		return DC;
	}

	public Line getRightLine() {
		Line CB = new Line(this.getUpperRight(), this.getLowerRight());
		return CB;
	}

	public Line getLowerLine() {
		Line AB = new Line(this.getLowerLeft(), this.getLowerRight());
		return AB;
	}

	public Line getLeftLine() {
		Line DC = new Line(this.getLowerLeft(), this.getUpperLeft());
		return DC;
	}

	public double getWidth() {
		if (this.getUpperLine().getLenght() > this.getRightLine().getLenght()) {
			return this.getUpperLine().getLenght();
		} else
			return this.getRightLine().getLenght();
	}

	public double getHeight() {
		if (this.getUpperLine().getLenght() < this.getRightLine().getLenght()) {
			return this.getUpperLine().getLenght();
		} else
			return this.getRightLine().getLenght();
	}

	public Point getCenter() {
		double halfX = (this.B.getX() - this.D.getX()) / 2;
		double halfY = (this.D.getY() - this.B.getY()) / 2;
		Point center = new Point(halfX, halfY);
		return center;
	}

	public double getParimeter() {
		return 2 * this.getHeight() + 2 * this.getWidth();
	}
	
	public double getArea() {
		return this.getHeight() * this.getWidth();
	}
	
	public String toString() {
		return "Rectangle[("+this.getCenter().getX()+
				", " +this.getCenter().getY()+"), ("+
				this.getHeight()+","+this.getWidth()+")]";
	}
	
	public static void main(String[] args) {
		String [] arg = {"ready"};
		String formated = "".format("Are you {}", arg);
		System.out.println(formated);
	}

}
