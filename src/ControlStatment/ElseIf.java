package ControlStatment;

public class ElseIf {

	public static void main(String[] args) 
	{
		//if marks >=80 then print you are in distingtion
		//if marks >=60 then print you are in first class
		//if marks >=35 then print you are pass
		//if marks <35 then print you are fail
		
		int marks=65;
		if(marks>=80)
		{
			System.out.println("you are in distingation");
		}
		else if(marks>=60)
		{
			System.out.println("you are in firts class");
		}
		else if (marks>=35)
		{
			System.out.println("than you are pass");
			
		}
		else if(marks<=35)
		{
			System.out.println("you are fail");
			
		}
	}

}
