package Figures;

import java.awt.Color;

import Basics.*;

public class Sphere extends Figure{
	
	private double radio;
	//private Point center;
	
	public Sphere (Point center, double radio, Color color,double kd, double ks, double kr) {
		super(center,color,kd,ks,kr,new Direction(0,0,0));
		is_sphereT();
		this.radio=radio;
	}
	
	public double getKd() {
		return super.getKd();
	}
	
	public Direction getNormal(Point p) {
		Direction d=Operator.subP(getCenter(),p);
		d.normalize();
		return d;
	} 

	public void setCenter(Point center) {
		this.center = center;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double intersect(Point O, Direction d) {
		double a=d.getX()*d.getX()+d.getY()*d.getY()+d.getZ()*d.getZ();
		double b=2*(d.getX()*(O.getX()-center.getX())+d.getY()*(O.getY()-center.getY())
				+d.getZ()*(O.getZ()-center.getZ()));
		double c=center.getX()*center.getX()+center.getY()*center.getY()+center.getZ()*center.getZ()+
				O.getX()*O.getX()+O.getY()*O.getY()+O.getZ()*O.getZ()
				-2*(center.getX()*O.getX()+center.getY()*O.getY()+center.getZ()*O.getZ())-radio*radio;
		double det= b*b-4*a*c;
		double t=-1.0;
		if (det<0) {
			t= -1.0;
		}
		else {
			double tmas=(-b+Math.sqrt(det))/(2*a);
			double tmenos=(-b-Math.sqrt(det))/(2*a);
			if(tmas>0 && tmenos<0) {
				t= tmas;
			}
			else if(tmas<0 && tmenos>0) {
				System.out.println("AQUI MOLO MAS");
				t= tmenos;
			}
			else if(tmas< tmenos) {
				t= tmas;
				System.out.println(tmas + "SUPER T");
				System.out.println(tmenos + "MENOR T");
			}
			else if(tmas> tmenos) {
				t= tmenos;
			}
		}
		return t;
	}
}


