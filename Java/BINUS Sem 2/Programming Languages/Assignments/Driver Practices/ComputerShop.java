package Java_Sem2;
import java.util.*;

public class ComputerShop 
{
	
	public static void Products()
	{
		System.out.println("Computer Shop");
		System.out.println("========================");
		System.out.println("1. Processor - Rp. 2.500.000");
		System.out.println("2. RAM - Rp. 1.250.000");
		System.out.println("3. Power Supply - Rp. 870.000");
		System.out.println("4. Graphic Card - Rp. 3.850.000");
		System.out.println("5. SSD - Rp. 1.050.000");
		System.out.print("Choose Product: ");
		Scanner sc = new Scanner(System.in);
		int product = sc.nextInt();
		checkProduct(product);
	}
	
	public static void checkProduct(int product)
	{
		Scanner sc = new Scanner(System.in);
		if(product>=1 && product<=5)
		{
			System.out.print("Input quantity [1-20]: ");
			int quantity = sc.nextInt();
			checkQuantity(product, quantity);
		}
		else
		{
			System.out.println("Invalid Product!");
			System.out.print("Please input a valid Product:");
			product = sc.nextInt();
			checkProduct(product);
		}
		
	}
	
	public static void checkQuantity(int product, int quantity)
	{
		if(quantity>=1 && quantity<=20)
		{
			if(product == 1)
			{
				int price = 2500000;
				int totalprice = price*quantity;
				Price(totalprice);
			}
			else if(product == 2)
			{
				int price = 1250000;
				int totalprice = price*quantity;
				Price(totalprice);
			}
			else if(product == 3)
			{
				int price = 870000;
				int totalprice = price*quantity;
				Price(totalprice);
			}
			else if(product == 4)
			{
				int price = 3850000;
				int totalprice = price*quantity;
				Price(totalprice);
			}
			else if(product == 5)
			{
				int price = 1050000;
				int totalprice = price*quantity;
				Price(totalprice);
			}
		}
		else
		{
			System.out.println("Invalid Quantity!");
			System.out.print("Please input a Valid Quantity:");
			Scanner sc = new Scanner(System.in);
			quantity = sc.nextInt();
			checkQuantity(product, quantity);
		}
	}
	
	public static void Price(int totalprice)
	{
		System.out.println("Price: " + totalprice);
		System.out.println("Input money [bigger than or equals to the price]");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		checkPayment(payment, totalprice);
	}
	
	public static void checkPayment(int payment, int totalprice)
	{
		if(payment<totalprice)
		{
			System.out.println("You dont have enough money!");
		}
		if (payment==totalprice)
		{
			System.out.println("You pay with the exact amount of money!");
		}
		if(payment>totalprice)
		{
			int change = payment - totalprice;
			System.out.println("You get Rp." + change +" for the change");
		}
	}
	
	
	public static void main(String[]args) 
	{
		Products();		
	}
}
