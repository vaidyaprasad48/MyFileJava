package logicalProblem;

public class NoOfWhiteSpaceString {

	public static void main(String[] args) 
	{
		String a=" P   U  N E";
		int count=0;
		for(int i=0;i<=a.length()-1;i++)
		{
			char myChar =a.charAt(i);
			if(myChar==' ');
			{
				count++;
			}
			
		}
		System.out.println("No.of white space is "+a+" is "+count);
		
	}

}
