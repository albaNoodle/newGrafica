package Scene;

import Basics.*;

public class Camera {
	private Point c;
	//private Direction o;
	private Direction x = new Direction(-1, 0, 0);
	private Direction y = new Direction(0, -1, 0);
	private Direction z = new Direction(0, 0, -1);
	
	public Camera(Point c) {
		Point px=Operator.addD(c,x);
		Point py=Operator.addD(c,y);
		Point pz=Operator.addD(c,z);
		x=Operator.subP(px,c);
		x.normalize();
		y=Operator.subP(py,c);
		y.normalize();
		z=Operator.subP(pz,c);
		z.normalize();
		this.c=c;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public Direction getX() {
		return x;
	}

	public void setX(Direction x) {
		this.x = x;
	}

	public Direction getY() {
		return y;
	}

	public void setY(Direction y) {
		this.y = y;
	}

	public Direction getZ() {
		return z;
	}

	public void setZ(Direction z) {
		this.z = z;
	}

}
