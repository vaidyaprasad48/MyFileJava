package TheAndSuperKeyword; ///1 stage

public class ThisUse 
{
	//this keyword is used to access global variable from same/current class.
	
	int a=10;//non static global variable
	
	
	
	
	public static void main(String[] args) 
	{
		//object call
		ThisUse tu=new ThisUse();//creat object of class
		tu.test();
		

	}
	
	public void test()
	{
		int a=100;//local variable
	    System.out.println("local value of a is local variable "+a);
	    System.out.println("this is global variable "+this.a);
	    
	    int add1=1+a; //local value
	    System.out.println("the value of add1 is "+add1);
	    
	    // i want to use globle value a
	    int add2=1+this.a;
	    System.out.println("value of globle variable is "+add2);
				
	}

}
