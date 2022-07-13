package ControlStatment;

public class SwitchCaseDays {

	public static void main(String[] args) 
	{
		//Monday----first day of week
		//tuesday---second day of week
		//wednesday---third day of week
		//thirsday---fourth day of week
		//friday---fifth day of week
		//saturday----sixth day of week
		//sunday---seventh day of week
		
		String day="vvv";
		switch (day) 
		{
		case "Monday":System.out.println("first day of week");
			break;
		case "Tuesday": System.out.println("second day of week");
			break;
		case "Wednesday": System.out.println("Third day of week");
			break;
		case "Thirsday": System.out.println("fourth day of week");
			break;
		case "Friday": System.out.println("fifth day of week");
			break;
		case "Saturday": System.out.println("Sixth day of week");
			break;
		case "sunday": System.out.println("seventh day of week");
			break;
			
			
			
		default:System.out.println("enter valid day");
			break;
		}

	}

}
