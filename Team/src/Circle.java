
import java.lang.*;

public class Circle {
	
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if(radius>0)
		this.radius = radius;
	}
	
	double calculateArea(){
		return Math.PI*getRadius()*getRadius();
	}
	
	double calculatePrimeter(){
		return 2*Math.PI*getRadius();
	}
	
	void printinfo(){
		
	}
	
}
