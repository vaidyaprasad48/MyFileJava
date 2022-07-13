package loops;

public class DoWhileLoopStudy {

	public static void main(String[] args) 
	{
		//i want to print "hi good morning 10 times"
		int i=1;
		do 
		{
			System.out.println("hi good morning");
			i=i+1;//i++
			
		}
		while(i<=10);
		System.out.println("**************");
		
		//5 table in reverse order
		int a=50;
		do
		{
			System.out.println(a);
			a=a-5;
			
			
		}
		while(a>=5);
		

	}

}
