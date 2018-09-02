package Figures;

import java.awt.Color;

import Basics.Direction;
import Basics.Operator;
import Basics.Point;

public abstract class Figure {
	Point center;
	Color color;
	double t;
	double kd;
	double ks;
	double kr; //indice de refraccion

	Direction normal;
	
	boolean is_sphere = false;
	public boolean is_light = false;

	public boolean isIs_light() {
		return is_light;
	}

	public void setIs_light(boolean is_light) {
		this.is_light = is_light;
	}

	public Figure(Point center, Color color, double kd, double ks, double kr, Direction normal) {
		this.center = center;
		this.color = color;
		this.kd = kd;
		this.ks = ks;
		this.kr=kr;
		this.normal = normal;
		normal.normalize();
	}

	public double getKs() {
		return ks;
	}

	public void setKs(double ks) {
		this.ks = ks;
	}

	public Direction getNormal(Point p) {
		return normal;
	}

	public double getT() {
		return t;
	}

	public void setT(double t) {
		this.t = t;
	}

	public Color getColor() {
		return color;
	}

	public boolean is_sphere() {
		return is_sphere;
	}

	public boolean is_sphereT() {
		return is_sphere = true;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Point getCenter() {
		return center;
	}

	public double getKd() {
		return kd;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public double intersect(Point n2, Direction d) {
		return -1;
	}

	public double getKr() {
		return kr;
	}

	public void setKr(double kr) {
		this.kr = kr;
	}
}