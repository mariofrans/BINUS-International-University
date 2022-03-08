package CompositionClass;

class MyCircle
{
	private MyPoint center = (0,0);
	private int radius = 1;
	private int x = 0;
	private int y = 0;
	
	MyCircle()
	{
		
	}
	
	MyCircle(int x, int y, int radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	MyCircle(MyPoint center, int radius)
	{
		this.center = center;
		this.radius = radius;
	}
	
	public int getRadius()
	{
		return radius;
	}
	
	public void setRadius(int radius)
	{
		this.radius = radius;
	}
	
	public MyPoint getCenter()
	{
		return center;
	}
	
	public void setCenter(MyPoint center)
	{
		this.center = center;
	}
	
	public int getCenterX()
	{
		return x;
	}
	
	public void setCenterX(int x)
	{
		this.x = x;
	}
	
	public int getCenterY()
	{
		return y;
	}
	
	public void setCenterY(int y)
	{
		this.y = y;
	}

	public int[] getCenterXY()
	{
		return new int[] {x,y};
	}
	
	public void setCenterXY(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double getArea(radius)
	{
		return Math.PI*(radius.pow(2));
	}
}




class Driver
{
	public static void main(String[]args)
	{
		
	}
	
}

