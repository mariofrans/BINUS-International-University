package PracticeClasses;

class InvoiceItemClass 
{
	public static void main(String[]args)
	{
		InvoiceItem apple = new InvoiceItem("apple0001", "Apple iPhone 11 Pro Max", 3, 20);
	
		System.out.println("Item ID: "+ apple.getID());
		System.out.println("Item description is: "+ apple.getDesc());
		System.out.println("Item quantity is: " + apple.getQty());
		System.out.println("Item unit price is: " + apple.getUnitPrice());
		System.out.println("The total price is: " + apple.getTotal());
	}
}

class InvoiceItem
{
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;
	
	 InvoiceItem(String id, String desc, int qty, double unitPrice)
	{
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	
	public String getID()
	{
		return this.id;
	}
	
	public String getDesc()
	{
		return this.desc;
	}
	
	public int getQty()
	{
		return this.qty;
	}
	
	public void setQty(int qty)
	{
		this.qty = qty;
	}
	
	public double getUnitPrice()
	{
		return this.unitPrice;
	}
	
	public void setUnitPrice(double unitPrice)
	{
		this.unitPrice = unitPrice;
	}
	
	public double getTotal()
	{
		return unitPrice*qty;
	}
	
}