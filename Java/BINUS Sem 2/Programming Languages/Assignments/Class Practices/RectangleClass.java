package PracticeClasses;

class RectangleClass 
{
	public static void main(String[]args)
	{
		Rectangle rc = new Rectangle(50,20);
	
		System.out.println("The length is: "+rc.getLength());
		System.out.println("The width is: "+rc.getWidth());
		System.out.println("The area is: "+rc.getArea());
		System.out.println("The perimeter is: "+rc.getPerimeter());
	}
}

class Rectangle
{
	private float length = 1.0f;
	private float width  = 1.0f;
	
	Rectangle()
	{
		
	}
	
	Rectangle(float length, float width)
	{
		this.length = length;
		this.width = width;
	}
	
	public float getLength()
	{
		return this.length;
	}
	
	public void setLength(float length)
	{
		this.length = length;
	}
	
	public float getWidth()
	{
		return this.width;
	}
	
	public void setWidth(float width)
	{
		this.width = width;
	}
	
	public double getArea()
	{
		return length*width;
	}
	
	public double getPerimeter()
	{
		return (2*length + 2*width);
	}
}
