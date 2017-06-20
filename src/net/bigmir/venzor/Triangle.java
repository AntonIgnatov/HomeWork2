package net.bigmir.venzor;

public class Triangle extends Shape {
	private Point a;
	private Point b;
	private Point c;
	private String name = "triangle";

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
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

	@Override
	public String getName() {
		return name;
	}

	@Override
	double getPerimetr() {
		double p = Point.lenght(this.a, this.b) + Point.lenght(this.b, this.c) + Point.lenght(this.c, this.a);
		return p;
	}

	@Override
	double getArea() {
		double p = getPerimetr() / 2;
		double ab = Point.lenght(this.a, this.b);
		double bc = Point.lenght(this.b, this.c);
		double ca = Point.lenght(this.c, this.a);
		double arrea = Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
		return arrea;
	}

	@Override
	boolean ifExist() {
		double ab = Point.lenght(this.a, this.b);
		double bc = Point.lenght(this.b, this.c);
		double ca = Point.lenght(this.c, this.a);
		if (ab + bc != ca && bc + ca != ab && ca + ab != bc) {
			return true;
		}
		System.out.println("this dots are on one line");
		return false;
	}

}
