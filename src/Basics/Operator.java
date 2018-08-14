package Basics;

public class Operator {
	
	public static Point addP(Point o, Point d) {
		return new Point (o.getX()+d.getX(),o.getY()+d.getY(),o.getZ()+d.getZ());
	}
	
	public static Point addPD(Point o, Direction d) {
		return new Point (o.getX()+d.getX(),o.getY()+d.getY(),o.getZ()+d.getZ());
	}
	
	//p->d
	public static Direction subP(Point o, Point d) {
		return new Direction (o.getX()-d.getX(),o.getY()-d.getY(),o.getZ()-d.getZ());
	}
	
	public static Direction addD(Direction o, Direction d) {
		return new Direction (o.getX()+d.getX(),o.getY()+d.getY(),o.getZ()+d.getZ());
	}
	
	public static Point addD(Point o, Direction d) {
		return new Point (o.getX()+d.getX(),o.getY()+d.getY(),o.getZ()+d.getZ());
	}
	
	public static Direction addD2(Point o, Direction d) {
		return new Direction(o.getX()+d.getX(),o.getY()+d.getY(),o.getZ()+d.getZ());
	}
	
	public static Direction subD(Direction o, Direction d) {
		return new Direction (o.getX()-d.getX(),o.getY()-d.getY(),o.getZ()-d.getZ());
	}
	
	public static double dotProduct(Direction o, Direction d) {
		return o.getX()*d.getX()+o.getY()*d.getY()+o.getZ()*d.getZ();
	}
	
	public static double dotProduct(Direction o, Point d) {
		return o.getX()*d.getX()+o.getY()*d.getY()+o.getZ()*d.getZ();
	}
	
	public static double dotProduct(Point o, Point d) {
		return o.getX()*d.getX()+o.getY()*d.getY()+o.getZ()*d.getZ();
	}
	
	public static Direction crossProduct(Direction o, Direction d) {
		double x= o.getY()*d.getZ()-o.getZ()*d.getY();
		double y=o.getZ()*d.getX()-o.getX()*d.getZ();
		double z=o.getX()*d.getY()-o.getY()*d.getX();
		return new Direction(x,y,z);
	}
	
	public static double angle(Direction o, Direction d) {
		return Math.asin(dotProduct(o,d)/(o.module()*d.module()));
	}
	
	public static double[][] getMatrix(Direction x, Direction y, Direction z, Point o){
		double[][]matrix=new double[4][4];
		//fila 0
		matrix[0][0]=z.getX();
		matrix[0][1]=y.getX();
		matrix[0][2]=x.getX();
		matrix[0][3]=o.getX();
		
		//fila 1
		matrix[1][0]=z.getY();
		matrix[1][1]=y.getY();
		matrix[1][2]=x.getY();
		matrix[1][3]=o.getY();
		
		//fila 2
		matrix[2][0]=z.getZ();
		matrix[2][1]=y.getZ();
		matrix[2][2]=x.getZ();
		matrix[2][3]=o.getZ();
		
		//fila 3
		matrix[3][0]=0;
		matrix[3][1]=0;
		matrix[3][2]=0;
		matrix[3][3]=1;
		
		return matrix;
	}
	
	public static Point changeBase(double[][] base, Point o){
		double x=base[0][0]*o.getX()+base[0][1]*o.getY()+base[0][2]*o.getZ()+base[0][3]*1;
		double y=base[1][0]*o.getX()+base[1][1]*o.getY()+base[1][2]*o.getZ()+base[1][3]*1;
		double z=base[2][0]*o.getX()+base[2][1]*o.getY()+base[2][2]*o.getZ()+base[2][3]*1;
		//w=base[3][0]*o.getX()+base[3][1]*o.getY()+base[3][2]*o.getZ()+base[3][3]*1;
		return new Point(x,y,z);
	}
}
