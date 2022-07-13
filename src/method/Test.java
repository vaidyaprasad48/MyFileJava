package method;

public class Test {

	public static void main(String[] args) 
	{
		//from same class
		Test t= new Test();//created object from same class//syntax classname objectname=new classname();
		t.addition();//calling non static method from same class//syntax  objectname.methodname();
		sub();//calling static method from same class//methodname();
		
		
		//from another class
		Test1 t1= new Test1();//created object of another class
		t1.mul();//calling from non static method from other class
		Test1.div();//calling static method from another class//classnme.methodname
	
		
		
		

	}
	
	public void addition()//non static regular method
	{
		int a=90;
		int b=20;
		int sum=a+b;
		System.out.println("addition is "+sum);
	}
	public static void sub()//regular static method
	{
		int a=88;
		int b=40;
		int subs=a-b;
		System.out.println("substraction is "+subs);
	}

}
