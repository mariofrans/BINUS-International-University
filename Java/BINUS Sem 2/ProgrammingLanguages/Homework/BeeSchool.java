package Homework;

import java.util.Scanner;

public class BeeSchool {
	
	String subject[] = new String[100];
	String category[] = new String[100];
	
	public static void Menu()
	{
		System.out.println("Bee School");
		System.out.println("========================");
		System.out.println("1. Insert New Subject");
		System.out.println("2. View All Subject");
		System.out.println("3. Insert New Student");
		System.out.println("4. View All Student");
		System.out.println("5. Insert Student Score");
		System.out.println("6. View Student Score");
		System.out.println("7. Exit");
		System.out.print("Choose Menu: ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		checkNumber(choice);
	}
	
	public static void checkNumber(int choice)
	{
		Scanner sc = new Scanner(System.in);
		if(choice>=1 && choice<=7)
		{
			checkMenu(choice);
		}
		else
		{
			System.out.println("Invalid Option!");
			System.out.print("Please Input A Valid Option:");
			choice = sc.nextInt();
			checkNumber(choice);
		}
		
	}

	
	public static void checkMenu(int choice, String subject[])
	{
		Scanner sc = new Scanner(System.in);
		if(choice == 1)
		{
			System.out.println("Please Enter A Subject [3-25 characters | ends with 'Subject']: ");
			String sub = sc.next();
			for(int i = 0; i<=100; i++)
			{
				if(sub == subject[i])
				{
					System.out.println("Subject Already Exist");
					checkMenu(int choice)
				}
			}
			System.out.println("Subject Category [Main | Elective]: ");
			String cat = sc.next();
			System.out.println("Success Insert Subject");
		}
		else if(choice == 2)
		{
			System.out.println("Please Enter A Subject");
		}
		else if(choice == 3)
		{
			int price = 870000;
			int totalprice = price*quantity;
			Price(totalprice);
		}
		else if(choice == 4)
		{
			int price = 3850000;
			int totalprice = price*quantity;
			Price(totalprice);
		}
		else if(choice == 5)
		{
			int price = 1050000;
			int totalprice = price*quantity;
			Price(totalprice);
		}
		else if(choice == 6)
		{
			int price = 1050000;
			int totalprice = price*quantity;
			Price(totalprice);
		}
		else if(choice == 7)
		{
			int price = 1050000;
			int totalprice = price*quantity;
			Price(totalprice);
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
		Menu();		
	}

}
