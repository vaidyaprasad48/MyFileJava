package TheAndSuperKeyword; ///3rd stage

public class SuperUse extends A
{
	int p=120;//global variable from super use class

	public static void main(String[] args) 
	{
		SuperUse su=new SuperUse();
		su.test();
		
		 

	}
	
	public void test()//method use
	{
	
		int p=1;//local variable
	
		System.out.println("value of local variable p is "+p);
		System.out.println("value of global variable  same class  p is "+this.p);
		System.out.println("globle value of super class is "+super.p);
	}

}
