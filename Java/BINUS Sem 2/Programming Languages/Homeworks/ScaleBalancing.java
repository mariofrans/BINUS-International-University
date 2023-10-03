package Homework;
import java.util.*;

public class ScaleBalancing
{
	public static void Scalebalancing(int[] A, int[] B, int weights)
	{	
		if(A[0]==A[1])
		{
			System.out.println("The scale is already balanced");
		}
		if(A[0]<A[1])
		{
			for(int i = 0; i<weights; i++)
			{
				if(A[0]+B[i]==A[1])
				{
					// scale is balanced by adding B[i] on the left
					System.out.println("'"+B[i]+"'");
				}
				if(A[0]+B[i]>A[1])
				{
					for(int j = 0;j <weights; j++)
					{
						if(A[1]+B[j]==A[0] && j != i)
						{
							// scale is balanced by adding B[i] on the left and B[j] on the right
							System.out.println("'"+B[i]+"'"+"'"+B[j]+"'");
						}
					}
	
				}
				if(A[0]+B[i]<A[1])
				{
					for(int j = 0;j <weights; j++)
					{
						if(A[0]+B[j]==A[1] && j != i)
						{
							// scale is balanced by adding B[i] and B[j] on the left
							System.out.println("'"+B[i]+"'"+"'"+B[j]+"'");
						}
					}
				}
			}
			
		}
		if(A[0]>A[1])
		{
			for(int i = 0; i<weights; i++)
			{
				if(A[1]+B[i]==A[0])
				{
					// scale is balanced by adding B[i] on the right
					System.out.println("'"+B[i]+"'");
				}
				if(A[1]+B[i]>A[0])
				{
					for(int j = 0;j <weights; j++)
					{
						if(A[0]+B[j]==A[1] && j != i)
						{
							// scale is balanced by adding B[i] on the right and B[j] on the left
							System.out.println("'"+B[i]+"'"+"'"+B[j]+"'");
						}
					}
				}
				if(A[1]+B[i]<A[0])
				{
					for(int j = 0;j <weights; j++)
					{
						if(A[1]+B[j]==A[0] && j != i)
						{
							// scale is balanced by adding B[i] and B[j] on the right
							System.out.println("'"+B[i]+"'"+"'"+B[j]+"'");
						}
					}
				}
			}
		}
	}
	
	public static void main(String[]args)
	{ 
		Scanner sc = new Scanner(System.in);
		int A[] = new int[2];
		
		System.out.println("Please input two positive integer weights [left and right] on a balance scale");
		System.out.print("First integer [left]: ");
		A[0] = sc.nextInt();
		System.out.print("Second integer [right]: ");
		A[1] = sc.nextInt();
		
		System.out.print("Please input the number of available weight/s: ");
		int weights = sc.nextInt();
		int B[] = new int[weights];
		System.out.println("Please input each weight/s [one at a time]");
		for(int i = 0; i<weights; i++)
		{
			System.out.print("Input weight: ");
			B[i] = sc.nextInt();
		}
		
		Scalebalancing(A, B, weights);	
	}
	
}
