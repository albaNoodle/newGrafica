package Basics;

public class Direction {
	double x;
	double y;
	double z;
	double w;
	public Direction(double x,double y,double z) {
		this.x=x;
		this.y=y;
		this.z=z;
		w=0;
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
	
	public Direction scale(double k) {
		return new Direction(x*k,y*k,z*k);
	}
	
	public double module() {
		return Math.sqrt(x*x+y*y+z*z);
	}
	
	public void normalize() {
		this.scale(1/this.module());
	}
	
}
