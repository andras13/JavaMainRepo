package assignment1_2;

import java.util.Scanner;

public class Assignment1_2 {
	
	public static int fibonacciLoop()
	{
		int fibo1=1,fibo2=1, fibonacci=1;
		int sum=0;
		System.out.println(+fibonacci+" ");
		
		for(int i=3; i<=40; i++)
		{
			fibonacci=fibo1 + fibo2;
			fibo1=fibo2;
			fibo2=fibonacci;
			if(fibonacci % 2 == 0)
			{
				sum+=fibonacci;
			}
			System.out.println(+fibonacci+" ");
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		long result = fibonacciLoop();
		System.out.println("The sum is : "+result);

	}

}
