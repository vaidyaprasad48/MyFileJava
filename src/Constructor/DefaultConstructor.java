package Constructor;

public class DefaultConstructor 
{
	//define variable
	int a;
	int b;
	
	
	public  DefaultConstructor()//without parameter
	{
		//initialize data member/variable
		a=400;
		b=900;
		
		//user define constructor
		//the constructor is call when an object of class is created.
		System.out.println("hi user define is running");
		
		
	}

	public static void main(String[] args) 
	{
		DefaultConstructor UD = new DefaultConstructor();//object creation
		UD.addition();//method calling
		UD.division();
		
		

	}
	public void addition()
	{
		int add=a+b;
		System.out.println("addition is "+add);
	}
	public void division()
	{
		int div=a/b;
		System.out.println("division is "+div);
	}
	

}
