

public class ShapeTest {
		
	
	 public ShapeTest(){
	
	 }
	 
	 public void start(){
		 Shape shape[]=new Shape[3];
		 shape[0]=new Rectangle(3.5, 4.5, 10);
		 shape[1]=new Circle(2.5, 20);
		 shape[2]=new Triangle(3.0, 4.0, 5.0, 30);
		 for(int i = 0 ; i < shape.length;i++){
			processShape(shape[i]);
		 }
	 }
	 public static void main(String[] args){
		 ShapeTest test=new ShapeTest();
		 test.start();
	 }
	 
	 public void processShape(Shape shape){
		 shape.printInfo();
		 if(shape instanceof Rectangle){
			 ((Rectangle) shape).drawRectangle();
		 }	 
	 }
}
