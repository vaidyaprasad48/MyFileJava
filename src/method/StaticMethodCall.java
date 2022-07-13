package method;

public class StaticMethodCall {

	public static void main(String[] args) //main method
	{
		//stage2
	
		sample();//call
		test();

		staticstudy.myMethod();// calling static regular method from anotherclass--> classname.methodname();
		
		staticstudy.display();// calling static regular method form another class
		
		MethodProject.myName();//calling
		
		MethodProject.project();
		
		
		
		

	}
	
	//stage 1
	
	public static void sample()//regular..static method
	{
		System.out.println("regular static method");
	}
	
	public static void test()//regular...static method
	{
		System.out.println("regular static test method");
		
	}
	

}
