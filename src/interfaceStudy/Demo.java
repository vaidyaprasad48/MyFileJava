package interfaceStudy;//stage2

public class Demo implements MyInterface2
{

	public static void main(String[] args) 
	{
		Demo d=new Demo();
	
		d.test1();
		d.test2();
		
	}

	
	

	@Override
	public void test1() 
	{
		System.out.println("my interface2 class");
		
	}

	@Override
	public void test2() {
		System.out.println("my interface2 class");
		
	}




	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

}
