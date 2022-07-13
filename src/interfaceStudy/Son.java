package interfaceStudy;//stage6

public class Son implements Father,Mother
{

	public static void main(String[] args) 
	{
		Son s= new Son();
		s.love();
		s.nature();
		s.money();
		

	}

	@Override
	public void love() 
	{
		System.out.println("Mother method completed in son class");
		
	}

	@Override
	public void nature()
	{
		System.out.println("Father method completed in son class");
		
	}

	@Override
	public void money() 
	{
		Father.super.money();
		Mother.super.money();
		
	}

}
