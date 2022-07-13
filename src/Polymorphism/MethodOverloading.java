package Polymorphism;

public class MethodOverloading {

	public static void main(String[] args) 
	{
		MethodOverloading m=new MethodOverloading();
		m.add();
		m.add(22,12);

	}
	
	public void add()
	{
		int a=20;
		int b=10;
		int sum=a+b;
		System.out.println("addition is "+sum);
		
		
	}
	
	public void add (int a, int b)
	{
		int sum=a+b;
		System.out.println("addition is "+sum);
		
	}

}
