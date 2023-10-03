package PracticeClasses;

class DateClass 
{
	public static void main(String[]args)
	{
		Date today = new Date(24, 3, 2020);
	
		System.out.println(today.toString());
	}
}

class Date
{
	private int day;
	private int month;
	private int year;
	
	Date(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay()
	{
		return this.day;
	}
	
	public int getMonth()
	{
		return this.month;
	}
	
	public int getYear()
	{
		return this.year;
	}
	public void setDay(int day)
	{
		this.day = day;
	}
	
	public void setMonth(int month)
	{
		this.month = month;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public void setDate(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String toString()
	{
		return "The date is "+day+"/"+month+"/"+year;
	}

}
