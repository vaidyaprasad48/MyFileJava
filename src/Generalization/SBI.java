package Generalization;

public class SBI implements RBI
{

	@Override
	public void loan() 
	{
		System.out.println("SBI loan rate 9.5%");
		
		
	}

	@Override
	public void withDraw() 
	{
		System.out.println("SBI withdraw limited 50k");
		
	}

	@Override
	public void Deposite() 
	{
		System.out.println("SBI deposite 1L");
		
	}

}
