package loops;

public class WhileLoopStudy {

	public static void main(String[] args) 
	{
		//i want to print 10 table i.e 10-100
		
		int i=10;
		while (i<=100) 
		{
			System.out.println(i);
			i=i+10;
			
		}
		
		System.out.println("******************");
		
		//i want to print 11 table i.e 11-110
		
		int a=11;
		while (a<=110)
		{
			System.out.println(a);
			
			a=a+11;
			
		}
		System.out.println("****************************");
		
		//i want to print 10-20 in decrement order by 1
		
		int b=20;
		while (b>=10) 
		{
			System.out.println(b);
			
			b=b-1;
			
			System.out.println("*********************");
			//i want to print prasad 3 times
			int c=1;
			while(c<=3)
			{
				System.out.println("prasad");
				c=c+1;
			}
			
		}
		

	}

}
