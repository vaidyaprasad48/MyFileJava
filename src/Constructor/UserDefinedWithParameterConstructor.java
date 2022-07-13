package Constructor;

public class UserDefinedWithParameterConstructor 
{
	int a; int b;	int c;//without parameter
	
	public UserDefinedWithParameterConstructor()//without parameter Constructor
	{
		a=10;
		b=20;
		c=30;	
	}
	
	public UserDefinedWithParameterConstructor(int x)//with parameter
	{
		a=x;
	}
	public UserDefinedWithParameterConstructor(int x,int y)
	{
		a=x;
		b=y;
	}
	public UserDefinedWithParameterConstructor(int x, int y, int z)
	{
		a=x;
		b=y;
		c=z;
	}
	
	public static void main(String[] args) 
	{
		UserDefinedWithParameterConstructor UDC=new UserDefinedWithParameterConstructor();
		UDC.add();//calling method with zero parameter
		
		UserDefinedWithParameterConstructor UDC1=new UserDefinedWithParameterConstructor(100);
		UDC1.add();
		
		UserDefinedWithParameterConstructor UDC2=new UserDefinedWithParameterConstructor(80,90);
		UDC2.add();
		
		UserDefinedWithParameterConstructor UDC3=new UserDefinedWithParameterConstructor(80,90,20);//with parameter
		UDC3.add();
		
		

	}
	public void add()// method without parameter
	{
		int add= a+b+c;
		System.out.println("addition is "+ add);
	}

}
