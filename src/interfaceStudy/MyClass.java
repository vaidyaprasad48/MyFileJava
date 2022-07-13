package interfaceStudy;//stage4

public class MyClass implements MyInterface
{

	public static void main(String[] args) 
	{
		MyClass m=new MyClass();//creat object of implementation class
		m.test();
		m.test1();
		//a=a+10;---a is final we cant update value of a

	}

	@Override
	public void test() 
	{
		System.out.println("Test method complete in implementation class");
		
		
	}

	@Override
	public void test1() 
	{
		System.out.println("Test1 method complete in implementation class");
		
		
	}

}
