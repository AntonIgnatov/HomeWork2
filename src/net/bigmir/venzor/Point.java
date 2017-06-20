package net.bigmir.venzor;

public class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
		super();
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	// opredelenie koordinat vektora:
	public static Point vect(Point a, Point b) {
		Point c = new Point();
		c.setX(b.getX() - a.getX());
		c.setY(b.getY() - a.getY());
		return c;
	}

	public static double lenght(Point a, Point b) {
		double l = Math.hypot((b.getX() - a.getX()), (b.getY() - a.getY()));
		return l;
	}

}
