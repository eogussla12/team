
import java.lang.*;

public class Circle extends Shape{
	
	double radius;

	public Circle(double radius, int id) {
		super(id);
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
	
	double calculatePerimeter(){
		return 2*Math.PI*getRadius();
	}
	
	void printInfo(){
		System.out.format("Circle with an id of %d, radius of %f, area of %f, and perimeter of %f",getId(),getRadius(),calculateArea(),calculatePerimeter());
		System.out.println();
		
	}
	
}
