
import java.lang.*;

public class Triangle extends Shape{
	
	double side1;
	double side2;
	double side3;
	
	public Triangle(double side1, double side2, double side3,int id) {
		super(id);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		if(side1>0)
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		if(side2>0)
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		if(side3>0)
		this.side3 = side3;
	}
	
	double calculateArea(){
		double sideSum = (getSide1()+getSide2()+getSide3())/2;
		double sumM1 = sideSum-getSide1();
		double sumM2 = sideSum-getSide2();
		double sumM3 = sideSum-getSide3();
		
		double areaTriangle = Math.sqrt(sideSum*sumM1*sumM2*sumM3);
		
		return areaTriangle;
	}
	
	double calculatePerimeter(){ 
		return getSide1()+getSide2()+getSide3();
	}
	
	void printInfo(){
		System.out.format("Triangle with an id of %d, sides of %lf, %lf and %lf, area of %lf, and perimeter of %lf.",getId(),getSide1(),getSide2(),getSide3(),calculateArea(),calculatePerimeter());
	}
	
	
}
