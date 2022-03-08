package Inheritance_Assignment1;

public class Driver {
	
	public static void main(String[]args)
	{
		//test the shape class
		Shape shape1 = new Shape();
		Shape shape2 = new Shape("blue", false);
		
		System.out.println(shape1.toString());
		System.out.println(shape2.toString());
		
		//test the circle class
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(2.0);
		Circle circle3 = new Circle(3.0, "yellow", true);
		
		System.out.println(circle1.toString());
		System.out.println(circle2.toString());
		System.out.println(circle3.toString());
		
		//test the rectangle class
		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle(2.0, 3.0);
		Rectangle rectangle3 = new Rectangle(4.0, 5.0);
		
		System.out.println(rectangle1.toString());
		System.out.println(rectangle2.toString());
		System.out.println(rectangle3.toString());
		
		//test the rectangle class
		Square square1 = new Square();
		Square square2 = new Square(2.0);
		Square square3 = new Square(3.0, "purple", false);
				
		System.out.println(square1.toString());
		System.out.println(square2.toString());
		System.out.println(square3.toString());
	}
	
}
