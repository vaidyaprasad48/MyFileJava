package VariableTypes;

public class GlobleAndLocalVaraible 
{

	
		//2 Type of globle variable Static and Non Static
		int a=35;   //globle non static variable
		static int b=75; //globle static variable
		static int c=10;//
		int sum=a+b;
		public static void main(String[] args) 
		{
			GlobleAndLocalVaraible GLV =new GlobleAndLocalVaraible();//object creration
			System.out.println("the value of a is "+GLV.a); //callong non static variable
			System.out.println("the value of b is "+b);  //calling static variable
			
			
			
			
			Test T=new Test();
		//	T.X();
			System.out.println("value of X is "+T.X);  //calling non static for other class
			                                           //object name. method name
			
			System.out.println("value of Y is "+Test.Y);//class name. method name for other class//static variable
			
			GLV.multiplication();//object creat
			GLV.addition();
			
			
			int div=b/GLV.a;
			System.out.println("div is "+div);
			
			
			int mul=b*(T.X);
			System.out.println("mul is "+mul);
			
			int sub=b-GLV.a;
			System.out.println("sub is "+sub);
			
			int add=Test.Y+GLV.a;
			System.out.println("add is "+add);
			
			int addition=c+GLV.a;
			System.out.println("add1 is " +addition);
			
			
		}
		//step2
		public void multiplication()
		{
			int mul=a*b;
			System.out.println("the multiplication is "+mul);
			
		}
		public void addition()
		{
			int add=a+b;
			System.out.println("the addition is "+add);
		}
		
}
		
	
		
		

	

