package Inheritance_Assignment1;

public class Shape {

	protected String color = "red";
	protected boolean filled = true;
	
	Shape()
	{
		this.color = "green";
		this.filled = true;
	}
	
	Shape(String color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public boolean isFilled()
	{
		return this.filled;
	}
	
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	
	public String toString()
	{
		if(filled == true)
		{
			return "A Shape with color of " + getColor() + " and filled";
		}
		else
		{
			return "A Shape with color of " + getColor() + " and is not filled";
		}
	}
}
