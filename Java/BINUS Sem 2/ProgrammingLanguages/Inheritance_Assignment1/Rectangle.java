package Inheritance_Assignment1;

public class Rectangle extends Shape{
	
	protected double width = 1.0;
	protected double length = 1.0;
	
	Rectangle()
	{
		this.width = 1.0;
		this.length = 1.0;
	}
	
	Rectangle(double width, double length)
	{
		this.width = width;
		this.length = length;
	}
	
	Rectangle(double width, double length, String color, boolean filled)
	{
		this.width = width;
		this.length = length;
		this.color = color;
		this.filled = filled;
	}
	
	public double getWidth()
	{
		return this.width;
	}
	
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public double getLength()
	{
		return this.length;
	}
	
	public void setLength(double length)
	{
		this.length = length;
	}
	public double getArea()
	{
		return (this.length)*(this.width);
	}
	
	public double getPerimeter()
	{
		return (this.length + this.width)*(2);
	}
	
	public String toString()
	{
		return "A Rectangle with width "+getWidth()+ ", and length " +getLength()+ ", which is a subclass of yyy";
	}

}
