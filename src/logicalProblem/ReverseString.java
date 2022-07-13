package logicalProblem;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the string");
			String a = sc.next();//original string
			String b="";//blank string
			
			for(int i=a.length()-1;i>=0;i--)
			{
				b=b+a.charAt(i);
				
			}
			
			System.out.println("original string "+a);
			System.out.println("reverse string "+b);
		}
		
		
		

	}

}
