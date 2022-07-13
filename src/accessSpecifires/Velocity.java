package accessSpecifires;///1 stage

public class Velocity {

	public static void main(String[] args) 
	{
		Velocity v= new Velocity();                                          //3rd stage
		v.test1();  //calling private method in main method in same class
		v.test2();  //calling default method in main method in same class
		v.test3();  //calling protected method in main method in same class
		v.test4();  //calling public method in main method in same class

	}
	
	private void test1()                                              //2nd stage
	{
		System.out.println("i am private test1");
		
	}
	void test2()
	{
		System.out.println("i am default method test2");
		
	}
	protected void test3()
	{
		System.out.println("i am protected method test3");
	}
	public void test4()
	{
		System.out.println("i am public method test4");
	}

}
