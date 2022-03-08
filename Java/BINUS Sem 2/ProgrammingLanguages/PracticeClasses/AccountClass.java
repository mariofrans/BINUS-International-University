package PracticeClasses;

class Driver 
{
	public static void main(String[]args)
	{
		Account mario = new Account("mariofrans2000", "Christensen Mario Frans", 300);
	
		System.out.println("Your ID: "+ mario.getID());
		System.out.println("Your full name is: "+ mario.getName());
		System.out.println("Your total balance is: " + mario.getBalance());
		System.out.println("Your balance after credit is: " + mario.credit(100));
		System.out.println("Your balance after debit is: " + mario.debit(200));
		System.out.println("Your balance after transfer is: " + mario.transferTo("fransmario2000", 100));
	}
}

class Account
{
	private String id;
	private String name;
	private int balance = 0;
	
	Account(String id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	Account(String id, String name, int balance)
	{
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public String getID()
	{
		return this.id;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getBalance()
	{
		return this.balance;
	}
	
	public int credit(int amount)
	{
		balance = amount+balance;
		return balance;
	}
	
	public int debit(int amount)
	{
		if(amount<=balance)
		{
			//amount is subtracted from account
			balance = balance-amount;
		}
		else
		{
			System.out.println("Amount exceeds balance!");
		}
		return balance;
	}
	
	public int transferTo(String account, int amount)
	{
		if(amount<=balance)
		{
			//amount is transferred to another account
			balance = balance-amount;
		}
		else
		{
			System.out.println("Amount exceeds balance!");
		}
		return balance;
	}
	
}
