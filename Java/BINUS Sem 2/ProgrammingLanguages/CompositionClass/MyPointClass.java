package CompositionClass;

class MyPoint
{
	private int x = 0;
	private int y = 0;
	
	MyPoint()
	{
		
	}
	
	MyPoint(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int getX()
	{
		return x;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public int[] getXY()
	{
		return new int[] {x,y};
	}
	
	public void setXY(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double distance(int x, int y)
	{
		if(x<y)
		{
			return y-x;
		}
		else
		{
			return x-y;
		}
	}
}


public class MyPointClass 
{
	public static void main(String[]args)
	{
		MyPoint p1 = new MyPoint(3, 4);
		MyPoint p2 = new MyPoint(5, 6);
		System.out.println(p1.distance(5, 6));
		
	}
}
