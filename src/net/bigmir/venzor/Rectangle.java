package net.bigmir.venzor;

public class Rectangle extends Shape {
	private Point a;
	private Point b;
	private Point c;
	private Point d;
	private String name = "rectangle";

	public Rectangle(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Rectangle() {
		super();
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public Point getD() {
		return d;
	}

	public void setD(Point d) {
		this.d = d;
	}

	@Override
	public String getName() {
		return name;
	}

	// proverka na to, chto 3 ula po 90 gradusov
	@Override
	boolean ifExist() {
		Point vecOne = Point.vect(a, b);
		Point vecTwo = Point.vect(b, c);
		Point vecTrhee = Point.vect(c, d);
		Point vecFour = Point.vect(d, a);
		double scalOne = vecOne.getX() * vecTwo.getX() + vecOne.getY() * vecTwo.getY();
		double scalTwo = vecTwo.getX() * vecTrhee.getX() + vecTwo.getY() * vecTrhee.getY();
		double scalThree = vecTrhee.getX() * vecFour.getX() + vecTrhee.getY() * vecFour.getY();
		if (scalOne == 0 && scalTwo == 0 && scalThree == 0) {
			return true;
		} else {
			System.out.println("dots does not match to rectangle");
		}
		return false;
	}

	@Override
	double getPerimetr() {
		double ab = Point.lenght(this.a, this.b);
		double bc = Point.lenght(this.b, this.c);
		double p = (ab + bc) * 2;
		return p;
	}

	@Override
	double getArea() {
		double ab = Point.lenght(this.a, this.b);
		double bc = Point.lenght(this.b, this.c);
		double area = ab * bc;
		return area;
	}

}
