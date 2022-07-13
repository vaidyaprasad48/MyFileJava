package array;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) 
	{
		
		int rollno[]= {1,2,3,4,5,6};// decler and initi
		
		//usage
		for(int i=0; i<=rollno.length-1;i++)
		{
			System.out.println(rollno[i]);
		}
		System.out.println("+++++++++++++++++++++");
		
		//how to sort given array
		//we have to used sort method
		
		int rollno1[]= {1,2,5,3,4,7,6};
		Arrays.sort(rollno1);
		
		for(int i=0; i<=rollno1.length-1;i++)
		{
			System.out.println(rollno1[i]);
		}
		System.out.println("************************");
		
		for(int i=rollno1.length-1; i>=0; i--)
		{
			System.out.println(rollno1[i]);
		}
		
	}

}
