package Homework;
import java.util.*;


// Number 1

//public class ImplementMethods 
//{		
//	
//	public static void getLargestIndex(int length, int[] A)
//	{
//		int largest = 0;
//		int largestIndex = 0;
//		
//		for(int i=0; i<length; i++)
//		{
//			if(A[i]>largest)
//			{
//				largest = A[i];
//				largestIndex = i;
//			}
//		}
//		getSecondLargestIndex(length, A, largestIndex);
//	}
//	
//	public static void getSecondLargestIndex(int length, int[] A, int largestIndex)
//	{
//		int secondLargest = 0;
//		int secondLargestIndex = 0;
//		
//		for(int i=0; i<length; i++)
//		{
//			if(A[i]>secondLargest && A[i]<A[largestIndex])
//			{
//				secondLargest = A[i];
//				secondLargestIndex = i;
//			}
//		}
//		getNewArray(length, A, largestIndex, secondLargestIndex, secondLargest);
//	}
//	
//	public static void getNewArray(int length, int A[], int largestIndex, int secondLargestIndex, int secondLargest)
//	{
//		int B[] = new int[length+1];
//		int difference = A[largestIndex] - A[secondLargestIndex];
//		
//		for(int i=0; i<largestIndex; i++)
//		{
//			B[i] = A[i];
//		}
//		B[largestIndex] = secondLargest;
//		B[largestIndex+1] = difference;
//		for(int i=largestIndex+2; i<length+1; i++)
//		{
//			B[i] = A[i-1];
//		}
//		
//		System.out.print(" ");
//		System.out.print("Output: ");
//		for(int i=0; i<length+1; i++)
//		{
//			System.out.print(B[i]+" ");
//		}
//	}
//
//	public static void main(String[]args)
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Please enter the length of array: ");
//		int length = sc.nextInt();
//		int A[] = new int[length];
//		
//		System.out.println("Please enter the integer value for each index in the array [one at a time, values must be unique and positive]: ");
//		for(int i=0; i<length; i++)
//		{
//			int x;
//			System.out.print("Please enter value: ");
//			x = sc.nextInt();
//			if(x < 0)
//			{ 
//				System.out.println("Value is less than '0'");
//				System.out.print("Please enter another value: ");
//				x = sc.nextInt();
//			}
//			else
//			{
//						A[i] = x;
//			}	
//		}	
//		
//		System.out.print("Input: ");
//		for(int i=0; i<length; i++)
//		{
//			System.out.print(A[i]+" ");
//		}
//		getLargestIndex(length, A);
//	}
//}


//Number 2

//public class ImplementMethods 
//{
//
//	public static void rotate(int[] A, int length, int rot)
//	{
//		int B[] = new int[length+rot];
//	
//		for(int i=0; i<length; i++)
//		{
//			B[i+rot] = A[i];
//		}
//		for(int i=0; i<rot; i++)
//		{
//			B[i] = B[length+i];
//		}
//		for(int i=0; i<length; i++)
//		{
//			A[i] = B[i];
//		}
//		
//		System.out.print("Output: ");
//		for(int i=0; i<length; i++)
//		{
//			System.out.print(A[i]+" ");
//		}
//	}
//	
//	public static void main(String[]args)
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Please enter the length of array: ");
//		int length = sc.nextInt();
//		int A[] = new int[length];
//		
//		System.out.println("Please enter the integer value for each index in the array [one at a time]: ");
//		for(int i=0; i<length; i++)
//		{
//			System.out.print("Please enter value: ");
//			A[i] = sc.nextInt(); 
//		}	
//		
//		System.out.println("How many times do you want to rotate the array?");
//		int rot = sc.nextInt();
//		
//		System.out.print("Input: ");
//		for(int i=0; i<length; i++)
//		{
//			System.out.print(A[i]+" ");
//		}
//		System.out.println(" ");
//		System.out.print("ROT: ");
//		System.out.print(rot);
//		System.out.println(" ");
//		
//		rotate(A, length, rot);
//	}
//}


// Number 3

//public class ImplementMethods 
//{
//	public static void main(String[]args)
//	{
//		int Transpose[][] = 
//		{
//				{0,0,0}, 
//				{0,0,0},
//				{0,0,0}
//		};
//		int Matrix[][]=
//		{
//			{1,2,3}, 
//			{4,5,6},
//			{7,8,9}
//		};
//		
//		System.out.println("The Matrix is: ");
//		for (int j = 0; j<3; j++)
//		{
//			for(int i=0; i<3; i++)
//			{
//				System.out.print(Matrix[j][i]+" ");
//				Transpose[i][j] = Matrix[j][i];
//			}
//			System.out.println(" ");
//		}
//		System.out.println(" ");
//		
//		System.out.println("The Transpose of Matrix is: ");
//		for (int j = 0; j<3; j++)
//		{
//			for(int i=0; i<3; i++)
//			{
//				System.out.print(Transpose[j][i]+" ");
//			}
//			System.out.println(" ");
//		}
//		System.out.println(" ");
//		
//		if(Transpose!=Matrix)
//		{
//			System.out.println("This is not a symetric matrix");
//		}
//		else
//		{
//			System.out.println("This is a symetric matrix");
//		}
//		
//	}
//}


// Number 4

//public class ImplementMethods 
//{
//	public static void main(String[]args)
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please input the size of the magic square");
//		System.out.println("Number of rows and collumns: ");
//		int size = sc.nextInt();
//		int magicSquare[size][size];
//		
//		for (int j = 0; j<3; j++)
//		{
//			for(int i=0; i<3; i++)
//			{
//				System.out.print(magicSquare[j][i]+" ");
//			}
//			System.out.println(" ");
//		}
//	}
//}










