package Scene;

import java.util.Random;

import Figures.Figure;

public class RussianRoulette {
	
	static int calculate (Figure f) {
		//0->difuso
		//1->especular
		//2->muere
		Random r = new Random();
		double t = r.nextDouble();
		
		if (0<=t && t<f.getKd()) { //Difusa
			return 1; 
		}
		else if ((f.getKd()+f.getKs())<t) { //Muerte
			return 0;
		}
		else { //kd < t < kd + ks  //especular
			return 2;
		}
	}

}
