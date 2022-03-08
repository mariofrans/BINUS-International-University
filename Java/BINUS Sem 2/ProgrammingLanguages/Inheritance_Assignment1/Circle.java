package Inheritance_Assignment1;

public class Circle extends Shape {
	
	private double radius = 1.0;
	
	Circle()
	{
		this.radius = 1.0;
	}
	
	Circle(double radius)
	{
		this.radius = radius;
	}
	
	Circle(double radius, String color, boolean filled)
	{
		this.radius = radius;
		this.color = color;
		this.filled = filled;
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public double getArea()
	{
		return (Math.PI)*(Math.pow(this.radius,2));
	}
	
	public double getPerimeter()
	{
		return (this.radius)*(2)*(Math.PI);
	}
	
	public String toString()
	{
		return "A Circle with radius " +getRadius()+ ", which is a subclass of yyy";// +Shape.toString();
	}
}
