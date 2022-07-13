package ControlStatment;

public class SwitchCase {

	public static void main(String[] args) 
	{
		//A-- you are in distingation
		//B--you ate in  first class
		//C--you are in second class
		//D--you are in third class
		
		char grade='E';
		switch (grade) 
		{
		case 'A': System.out.println("you are in  distingation");
			break;
		case 'B': System.out.println("you are i n first class");
			break;
		case 'C': System.out.println("you are in second class");
			break;
		case 'D': System.out.println("you are in  third c class");
			break;
		
		default:System.out.println("you are fail");
			break;
		}
		

	}

}
