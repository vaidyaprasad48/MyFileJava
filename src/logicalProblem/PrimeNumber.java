package logicalProblem;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		//3 4 6 
		//12---1&12 2 ----11
		int num=12;
		int count=0;
		for(int i=2;i<num;i++)//12---2,3,4,6
		{
			if(num%i==0)
			{
				count++;
				break;
				
			}
		}
		if(count==1)
		{
			System.out.println("given number "+num+ " is not a prime number");
		}
		else
		{
			System.out.println("given number "+num+ " is a prime number");
		}
		
	
	}

}
