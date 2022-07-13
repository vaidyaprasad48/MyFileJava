package Constructor;

public class sample 
{
	int p;
	int q;
	sample()//constructor name// public sample
	{
		p=25;
		q=15;
		
	}
	public void multiplication()
	{
		int mul1=p*q;
		System.out.println("mul is "+ mul1);
	}
	public void addition()
	{
		int add=p+q;
		System.out.println("add is "+ add);
	}
}
