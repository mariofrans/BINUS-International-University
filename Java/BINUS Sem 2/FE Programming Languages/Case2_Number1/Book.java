package Case2_Number1;

// book class
class Book {
	
	private String title;
	private double price;
	private int year;
	private String author;
		
	Book(String author, String title, double price, int year)
	{
		this.title = title;
		this.price = price;
		this.year = year;
		this.author = author;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public int getYear()
	{
		return this.year;
	}
	
	public String getAuthor()
	{
		return this.author;
	}
	
	public String toString()
	{
		return getAuthor() +", "+ getTitle() +", "+ getPrice() +", "+ getYear();
	}
	
}

// driver class to run the codes
class Driver
{
	public static void main(String args[]) 
	{
		Book raymond = new Book("Raymond Bahana", "Superheroes are Real", 15.50, 1719);
		Book nunung = new Book("Nunung Nurul", "Falling in Love with Polymorphism", 12.80, 1902);
		Book jude = new Book("Jude Martinez", "Bleh Bleh Bleh Bleh", 9.50, 1996);
		
		System.out.print(raymond.toString());
	}
	
}




























