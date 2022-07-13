package ControlStatment;

public class NestedIfElse {

	public static void main(String[] args) 
	{
		//if user Id is correct then-- enter password
		//if password is correct---login successfull
		//if password is wrong--- incorrect password
		//if user id is incorrect---invalid user
		
		String UID="Pass123";
		int password=1234;
		if(UID=="Pass123")//outer loop
		{
			System.out.println("enter password");
			if (password==1234)//inner loop
			{
				System.out.println("log in sucessful");
			}
			else
			{
				System.out.println("incorrect password");
			}
		}
		else
		{
			System.out.println("invalid id");
		}
		

	}

}
