package Polymorphism;

public class PolyStudy1 {

	public static void main(String[] args) 
	{
		//step5
		PolyStudy1 ps=new PolyStudy1();
		ps.multiplication();
		ps.multiplication(2, 30);
		ps.multiplication("prasad", 10);
		multiplication(2.1f,0.1f);//method name static
		

	}
	//step1
	public void multiplication()
	{
		int a=1;
		int b=2;
		int mul=a*b;
		System.out.println("multiplication is "+mul);
	}
	//step2
	public void multiplication(int x, int y)
	{
		int mul=x*y;
		System.out.println("2nd multiplication is "+mul);
	}
	//step 3
	void multiplication(String a,int b)
	{
		System.out.println("my name is "+a);
		System.out.println("my roll no. is "+b);
		
	}
	//step4
	public static void multiplication(float a,float b)
	{
		float mul=a*b;
		System.out.println("3rd multiplication is "+mul);
	}
}
