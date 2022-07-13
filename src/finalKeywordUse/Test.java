package finalKeywordUse;

public class Test 
//step1
{
	int a=100;//globle variable decleration and initilazation process
	final  int b=10;

	public static void main(String[] args)
	//step3
	{
		Test t=new Test();
		t.add();
	
	}
	//step2
	
	public void add()//final method can not be override
	{
		a=a+90;
		System.out.println(a);
		//b=b+10; we cant update of final variable
	}
	public void sum()
	{
		//b=b+10;
		System.out.println(b);
		
	}

}
