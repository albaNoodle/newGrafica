package Basics;

public class Point {
	double x;
	double y;
	double z;
	double w;
	public Point(double x,double y,double z) {
		this.x=x;
		this.y=y;
		this.z=z;
		w=1;
	}

	public Direction scale(double k) {
		return new Direction(x*k,y*k,z*k);
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
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
}
