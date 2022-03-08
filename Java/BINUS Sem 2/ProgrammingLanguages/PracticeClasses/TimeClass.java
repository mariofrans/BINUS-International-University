package PracticeClasses;

public class TimeClass {

	public static void main(String[]args)
	{
		Time now = new Time(24, 0, 0);
	
		System.out.println(now.toString());
		System.out.println(now.previousSecond());
		System.out.println(now.nextSecond());
	}
}

class Time
{
	private int hour;
	private int minute;
	private int second;
	
	Time(int hour, int minute, int second)
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour()
	{
		return this.hour;
	}
	
	public int getMinute()
	{
		return this.minute;
	}
	
	public int getSecond()
	{
		return this.second;
	}
	public void setHour(int hour)
	{
		this.hour = hour;
	}
	
	public void setMinute(int minute)
	{
		this.minute = minute;
	}
	
	public void setSecond(int second)
	{
		this.second = second;
	}
	
	public void setTime(int hour, int minute, int second)
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public String toString()
	{
		return "The time is "+hour+":"+minute+":"+second;
	}
	
	public String nextSecond()
	{
		if(second==59)
		{
			second = 0;
			
			if(minute==59)
			{
				minute = 0;
				hour = hour +1;
			}
			else
			{
				minute = minute+1;
			}
		}
		else if(second!=59)
		{
			second = second+1;
		}
		return "The next second is "+hour+":"+minute+":"+second;
	}
	
	public String previousSecond()
	{
		if(second==0)
		{
			second = 59;
			
			if(minute==0)
			{
				minute = 59;
				hour = hour -1;
			}
			else
			{
				minute = minute-1;
			}
		}
		else
		{
			second = second-1;
		}
		return "The previous second is "+hour+":"+minute+":"+second;
	}
	
}

