

public class Rectangle extends Shape{
	private double width;
	private double height;
	private int id;
	

	
	public Rectangle( double width, double height, int id) {
		super(id);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double calculateArea(){
		
		return width*height;
	}
	
	public double calculatePerimeter(){
		return (width+width)*2;
	}
	
	public void printInfo(){
		System.out.format("Rectangle with an id of %d, width of %f, height of %f, area of %f, and perimeter of %f",getId(),getWidth(),getHeight(),calculateArea(),calculatePerimeter());
		System.out.println();
	
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
