package Inheritance_Assignment1;

public class Square extends Rectangle {
	
	double side = 1.0;

	Square()
	{
		this.side = 1.0;
	}
	
	Square(double side)
	{
		this.side = side;
	}
	
	Square(double side, String color, boolean filled)
	{
		this.side = side;
		this.color = color;
		this.filled = filled;
	}
	
	public double getSide()
	{
		return this.side;
	}
	
	public void getSide(double side)
	{
		this.side = side;
	}
	
	public void setWidth(double side)
	{
		this.width = side;
	}
	
	public void setLength(double side)
	{
		this.length = side;
	}
	
	public String toString()
	{
		return "A Square with side "+getSide()+", which is a subclass of yyy";
	}
}
