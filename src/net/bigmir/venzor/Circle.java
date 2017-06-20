package net.bigmir.venzor;

public class Circle extends Shape {
	Point r;
	Point a;
	String name="circle";

	public Circle(Point r, Point a) {
		super();
		this.r = r;
		this.a = a;
	}
	public Circle() {
		super();
	}
	public Point getR() {
		return r;
	}
	public void setR(Point r) {
		this.r = r;
	}
	public Point getA() {
		return a;
	}
	public void setA(Point a) {
		this.a = a;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	double getPerimetr() {
		double p=2*Math.PI*Point.lenght(this.a, this.r);
		return p;
	}
	@Override
	double getArea() {
		double area=Math.PI*Math.pow(Point.lenght(this.a, this.r), 2);
		return area;
	}
	@Override
	boolean ifExist() {
		if (this.r.getX()!=this.a.getX() && this.r.getY()!=this.a.getY()){
			return true;
		}
		return false;
	}
	
	

}
