package Figures;
import java.awt.Color;
import java.util.Random;

import javax.swing.text.MutableAttributeSet;
import javax.swing.text.Position;

import Basics.Direction;
import Basics.Operator;
import Basics.Point;

public class Triangle extends Figure {
	Point p1;
	Point p2;
	Point p3;
	Direction n = new Direction(0, 0, 0);

	public Triangle(Point p1, Point p2, Point p3, Direction normal, Color color, double kd, double ks,double kr, boolean light) {
		super(new Point(0, 0, 0), color, kd, ks,kr, normal);
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		Direction v0v1 = Operator.subP(p2,p1); 
		Direction v0v2 = Operator.subP(p3,p1); 
	    // no need to normalize
		n = Operator.crossProduct(v0v1, v0v2); 
		is_light=light;
		n.normalize();
		normal = n;
	//	setLight(luz);
	
		
		//super.name= name;
	    // get triangle edge vectors and plane normal
		//center.sub(u, this.p2, this.p1);
	//	u= Operator.subP( this.p2, this.p1);
		//center.sub(v, this.p3, this.p1);
	//	v= Operator.subP( this.p3, this.p1);
	    //super.normal= Operator.crossProduct(u, v);              // cross product
	    
	}

	public Direction getNormal() {
		return normal;
	}

	public void setNormal(Direction normal) {
		this.normal = normal;
	}

	public double intersect( Point O,Direction D) {

	    double EPSILON = 0.0000001; 
	    Direction edge1, edge2, h, s, q;
	    double a,f,u,v;
	    edge1 = Operator.subP(p2,p1);
	    edge2 = Operator.subP(p3,p1);
	    h = Operator.crossProduct(D, edge2);
	    a = Operator.dotProduct(edge1, h);
	    if (a > -EPSILON && a < EPSILON)
	        return -1;
	    f = 1/a;
	    s = Operator.subP(O, p1);
	    u = f * (Operator.dotProduct(s, h));
	    if (u < 0.0 || u > 1.0)
	        return -1;
	    q = Operator.crossProduct(s, edge1);
	    v = f * Operator.dotProduct(D, q);
	    if (v < 0.0 || u + v > 1.0)
	        return -1;
	    // At this stage we can compute t to find out where the intersection point is on the line.
	    double t = f * Operator.dotProduct(edge2, q);
	    if (t > EPSILON) // ray intersection
	    {
	        return t;
	    }
	    else // This means that there is a line intersection but not a ray intersection.
	        return -1;
	} 
	
	public Point getRnd() {
		/*	Random r=new Random();
			double rand1=r.nextDouble();
			double rand2=r.nextDouble();
			Direction d1= Geometry.subD(p2, p1);
			d1=d1.scale(rand1);
			Direction d2= Geometry.subD(p3, p1);
			d2=d2.scale(rand2);
			d1=Geometry.addD(d1, d2);
			d1.scale(0.5);
			return Geometry.addP(p1,d1);
		*/Random r=new Random();
			double rand1=r.nextDouble();
			double rand2=rand1*r.nextDouble();
			Direction d1= Operator.subP(p2, p1);
			d1=d1.scale(rand1);
			Direction d2= Operator.subP(p3, p1);
			d2=d2.scale(rand2);
			d1=Operator.addD(d1, d2);
			return Operator.addD(p1,d1);
		
			}
}
