
public abstract class Shape {

	private int id;
	
	Shape(int id){
		this.id =id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	abstract double calculateArea();
	abstract double calculatePerimeter();
	abstract void printInfo();
}
