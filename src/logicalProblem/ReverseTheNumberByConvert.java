package logicalProblem;

public class ReverseTheNumberByConvert {

	public static void main(String[] args) 
	{
		int Orgnum=12356;
		String OrgString = Integer.toString(Orgnum);
		String revString="";
		for(int i=OrgString.length()-1;i>=0;i--)
		{
			revString=revString + OrgString.charAt(i);
		}
		int revNum = Integer.parseInt(revString);
		System.out.println("Original number is " +Orgnum);
		System.out.println("Original number is " +revNum);
		
		
	}

}
