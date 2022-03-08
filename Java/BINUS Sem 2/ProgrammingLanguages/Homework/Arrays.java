package Homework;
import java.util.*;

public class Arrays {

	public static void main(String[]args)
	{
		
	// number 1
//		System.out.println("Please enter 10 numbers (One at a time) to be put in an array");
//		int A[] = new int[10];
//		Scanner sc = new Scanner(System.in);
//		for( int i = 0; i < 10; i++)
//		{
//			System.out.print("Please enter a number: ");
//			A[i] = sc.nextInt();
//		}
//		for( int i = 0; i < 10; i++)
//		{
//			System.out.print(A[i]);
//		}
//		System.out.println(" ");
//		
	// number 2
//		System.out.print("Please enter a number to be searched: ");
//		int x = sc.nextInt();
//		
//		for( int i = 0; i < 10; i++)
//		{
//			if(x == A[i])
//			{
//				System.out.println("The number you search; "+x+", is found in the array");
//			}
//			else
//			{
//				System.out.println("The number you search; "+x+", is not found in the array");
//			}
//		}
//		System.out.println(" ");
	
	// number 3
//		System.out.println("Please enter 20 integers (One at a time) to be put in an array");
//		int A[] = new int[20];
//		int positiveCount = 0;
//		int negativeCount = 0;
//		int oddCount = 0;
//		int evenCount = 0;
//		int zeroCount = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		for( int i = 0; i < 20; i++)
//		{
//			System.out.print("Please enter a number: ");
//			A[i] = sc.nextInt();
//		}
//		for( int i = 0; i < 20; i++)
//		{
//			if(A[i]<0)
//			{
//				negativeCount += 1;
//			}
//			if(A[i] == 0)
//			{
//				zeroCount += 1;
//			}
//			if(A[i]>0)
//			{
//				positiveCount += 1;
//			}
//			if(A[i]%2 == 0)
//			{
//				evenCount += 1;
//			}
//			if(A[i]%2 == 1)
//			{
//				oddCount += 1;
//			}
//		}
//		System.out.println("The number of positive numbers are: " + positiveCount);
//		System.out.println("The number of negative numbers are: " + negativeCount);
//		System.out.println("The number of odd numbers are: " + oddCount);
//		System.out.println("The number of even numbers are: " + evenCount);
//		System.out.println("The number of zero/s are: " + zeroCount);
//		System.out.println(" ");
		
	// number 4
//		int A[] = {90, 2, 39, 14, 51, 30, -12, 69, -18, -7};
//		int sum = 0;
//		int product = 0;
//		
//		for(int i = 0; i<10; i++)
//		{
//			sum = sum + A[i];
//			product = product * A[i];
//		}
//		System.out.println("The sum of all values in the array are: " + sum);
//		System.out.println("The sum of all values in the array are: " + sum);
//		System.out.println(" ");
		
	// number 5
//		int A[] = {90, 2, 39, 14, 51, 30, -12, 69, -18, -7};
//		for(int x = 0; x<9; x++)
//		{
//			for(int y = x+1; y<10; y++)
//			{
//				if(A[x]>A[y])
//				{
//					int z = A[x];
//					A[x] = A[y];
//					A[y] = z;
//				}
//			}
//		}
//		System.out.println("The smallest number is: "+A[0]);
//		System.out.println("The largest number is: "+A[9]);
//		System.out.println(" ");
		
	// number 6
//		int A[] = {90, 2, 39, 14, 51, 30, -12, 69, -18, -7};
//		//int A[] = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
//		int mid = A.length/2;
//		int count = 0;
//
//		for(int i = 0; i<mid; i++)
//		{
//			if(A[9-i] == A[i])
//			{
//				count = count+=1;
//			}
//		}
//		
//		if(count == 5)
//		{
//			System.out.print("The array is a palindrome");
//		}
//		else
//		{
//			System.out.print("The array is not a palindrome");	
//		}

	// number 7
//		int A[] = {90, 2, 39, 14, 51, 30, -12, 69, -18, -7};
//		int Lower[] = new int[5];
//		int Upper[] = new int[5];
//		int mid = A.length/2;
//
//		for(int i = 0; i<mid; i++)
//		{
//			Lower[i] = A[i];
//			Upper[i] = A[9-i];
//		}
//		for(int i = 0; i<mid; i++)
//		{
//			Lower[i] = A[i];
//			Upper[i] = A[9-i];
//		}
//		System.out.println("First Array: ");
//		for(int i = 0; i<mid; i++)
//		{
//			System.out.print(Lower[i]+", ");
//			
//		}
//		System.out.println(" ");
//		System.out.println("Second Array: ");
//		for(int i = 0; i<mid; i++)
//		{
//			
//			System.out.print(Upper[i]+", ");
//		}
//		System.out.println(" ");

	// number 8
		
		
	}
	
	
	
	
}
