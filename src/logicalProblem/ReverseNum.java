package logicalProblem;

public class ReverseNum {

	public static void main(String[] args) 
	{
		int orgNum=123;
//		System.out.println(orgNum/10);
//		System.out.println(orgNum%10);
//		System.out.println(12%10);
//		System.out.println(1%10);
//		
		int revNum = 0;
		for(int i=orgNum;i>0;i=i/10)
		{
			int rem = i%10;
			
			revNum=revNum*10+rem;
		}
		System.out.println("original number is " +orgNum);
		System.out.println("reverse number is " +revNum);
		
	
	}
}
