package Figures;

import java.awt.Color;

import Basics.*;

public class Plane extends Figure{
	//private Color c;
	Point o;
	double d;
	Direction normal;
	
	public Plane(Point o,Direction normal, Color c, double d, double kd, double ks) {
		super(o,c,kd, ks, normal);
		this.d=d;
		//this.normal=normal;
	}

	public Point getO() {
		return o;
	}

	public void setO(Point o) {
		this.o = o;
	}


	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public Direction getNormal() {
		return normal;
	}

	public void setNormal(Direction normal) {
		this.normal = normal;
		this.normal.normalize();
	}
	
	public double getKd() {
		return super.getKd();
	}
	public double intersect(Point O,Direction D){
		double t= -(Operator.dotProduct(super.getNormal(O), O)+d)/Operator.dotProduct(D,super.getNormal(O));
		if (t>0) {
			return t;
		}
		else return -1;
	}
	
}
