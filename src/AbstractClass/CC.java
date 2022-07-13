package AbstractClass;

public class CC extends Sample {

	public static void main(String[] args) 
	{
		CC c=new CC();
		c.test();
		c.test1();
		c.test2();
		

	}
	public void test1()
	{
		System.out.println("this method is completed in concerte class");
	}
	//step 4
	public void test2()
	{
		System.out.println("method from CC");
	}
	

}
