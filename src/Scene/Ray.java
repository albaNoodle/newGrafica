package Scene;

import Basics.*;
import Figures.Figure;

public class Ray {
	private Point o;
	private Direction d;
	
	public Ray (Point o, Direction d) {
		this.o=o;
		this.d=d;
		this.d.normalize();
	}
	
	public Ray (Point o, Point dest) {
		this.o=o;
		d=Operator.subP(dest,o);
		d.normalize();
	}
	
	public Point getO() {
		return o;
	}

	public void setO(Point o) {
		this.o = o;
	}

	public Direction getD() {
		return d;
	}

	public void setD(Direction d) {
		this.d = d;
		this.d.normalize();
	}

	public Ray perfectRefraction(Ray ray, Figure f) {
		Ray r=ray;
		
		return r;
	}
}
