

public class Rectangle extends Shape{
	private double width;
	private double height;
	
	public Rectangle(double width, double height,int id){
		super(id);
		this.width=width;
		this.height=height;
	}
	
	public double calculateArea(){
		
		return width*height;
	}
	
	public double calculatePerimeter(){
		return (width+width)*2;
	}
	
	public void printInfo(){
		System.out.format("Rectangle with an id of %d, width of %lf, height of %lf, area of %lf, and perimeter of %lf",getId(),getSide1(),2*calculateArea()/getSide1(),calculateArea(),calculatePerimeter());
	}
	
	public void drawRectangle(){
		for(int i=0; i<(int) height;i++){
			if(i==0||i==(int)height-1)	System.out.print("+");
			else System.out.print("|");
			for(int j=0; j<(int)width-2; j++){
				System.out.print("-");
			}
			if(i==0||i==(int)height-1)
				System.out.print("+");
			else System.out.print("|");
			System.out.println();
		}
	}
	
	
}
