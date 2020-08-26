public class Square extends Shape implements Calculatable{
	
	private double side;
	
	public Square(double side) {
		super("square");
		this.side = side;
		display();
		
	}
	
	
	public void display() {
		System.out.println("area of "+getName()+" is ="+area());
		System.out.println("perimeter of "+getName()+" is ="+perimeter());
	}
	
	public double area() {
		return side*side;
	}
	
	public double perimeter() {
		return 4*side;
	}

}
