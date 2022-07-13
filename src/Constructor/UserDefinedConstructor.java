package Constructor;

public class UserDefinedConstructor 
{
	int a;// variable declaration without parameter
	int b;// variable declaration
	
	public UserDefinedConstructor()
	{
		//user defined constructor
		//the constructor is called when an object of class is created
		System.out.println("hi user defined constructor");
		//initialized data member/ variable
		a=500;
		b=11;
		
	}
	
	
	public static void main(String[] args) 
	{
		UserDefinedConstructor UDC= new UserDefinedConstructor();
		UDC.Addition();
		
		
		sample s=new sample();//object creation from another class
		s.addition();//method calling
		s.multiplication();
	
				

	}
	public void Addition()
	{
		int sum=a+b;
		System.out.println("sum is " +sum);
	}

}
