

public class Rectangle {
	private double width;
	private double height;
	
	public Rectangle(double width, double height){
		this.width=width;
		this.height=height;
	}
	
	public double calculateArea(){
		return 0;
	}
	
	public double calculatePerimeter(){
		return 0;
	}
	
	public void printInfo(){
		
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
