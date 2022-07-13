package method;

public class NonStaticMethod {

	public static void main(String[] args) 
	{
		//stage2
		//object creation should be done in main method
		//syntax.. classname objectname= new classname();//object creat
		
		NonStaticMethod msn= new NonStaticMethod();//created object of class 
		
		//after creation object..>call  non static method
		//syntax..> objectname.methodname();
		
		msn.ismethod();//calling non static regular method
		
		msn.testmethod();//call non static regular method
		
		
		//how to call non static regular method from other class
		//we need to create object of class
		
		 StaticStudyNon ssn= new StaticStudyNon();
		//after creation object
		ssn.display();

		
	}
	
	//stage1
	public void ismethod()//regular non static method
	{
		System.out.println("non static method is");
		//to call non static regular method we need object oa a class
		//how to create object--->see in main mathod
	}
	public void testmethod()//regular non static
	{
		System.out.println(" non static test is");
		
	}

}
