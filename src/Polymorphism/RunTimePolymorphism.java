package Polymorphism;//runtime poly stage 3

public class RunTimePolymorphism {

	public static void main(String[] args) 
	{
		A a=new A();
		B b=new B();
		a.test();
		b.test();
		A.test1();//static call i.e methodname()
		B.test1();
		
		
	}

}
