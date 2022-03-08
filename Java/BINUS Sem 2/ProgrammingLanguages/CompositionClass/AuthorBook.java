package CompositionClass;

class Author
{
	private String name;
	private String email;
	private char gender;
	
	Author(String name, String email, char gender)
	{
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public char getGender()
	{
		return gender;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
}

class Book
{
	private String name;
	private String author;
	private double price;
	private int qty = 0;
	
	Book(String name, Author author, double price)
	{
		this.name = name;
//		this.author = author;
		this.price = price;
	}
	
	Book(String name, Author author, double price, int qty)
	{
		this.name = name;
//		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAuthor()
	{		
		return author;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public double getQty()
	{
		return qty;
	}
	
	public void setQty(int qty)
	{
		this.qty = qty;
	}
	
}

class Driver
{
	public static void main(String[]args)
	{
		Author mario = new Author("Mario", "mario@gmail.com", 'm');
		System.out.println(mario);
		Book java = new Book("Java Tutorial", mario, 100.50);
		System.out.println(java);
		
		java.setPrice(29.95);
		java.setQty(28);
		System.out.println("name is: " + java.getName());
		System.out.println("price is: " + java.getPrice());
		System.out.println("qty is: " + java.getQty());
		System.out.println("Author is: " + java.getAuthor()); // Author's toString() System.out.println("Author's name is: " + dummyBook.getAuthor().getName()); System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

	
	}
}
