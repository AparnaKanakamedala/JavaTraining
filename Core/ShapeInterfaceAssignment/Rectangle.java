public class Rectangle extends Shape implements Calculatable{
	
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		super("rectangle");
		this.length = length;
		this.width = width;
		display();
	}
	
	public void display() {
		System.out.println("area of "+getName()+" is ="+area());
		System.out.println("perimeter of "+getName()+" is ="+perimeter());
	}
	
	public double area() {
		return length*width;
	}
	
	public double perimeter() {
		return 2*(length+width);
	}

}
