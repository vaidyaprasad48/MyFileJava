package logicalProblem;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) 
	{
		//num/2 reme=0.......even no.
//		
//		System.out.println(10%2);%modular
//		System.out.println(10/2);
//	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("given number is even number");
		}
		else
		{
			System.out.println("given no. is odd number");
		}
		
		
	}

}
