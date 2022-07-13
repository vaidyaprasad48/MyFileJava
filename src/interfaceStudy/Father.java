package interfaceStudy;//stage5

public interface Father
{
	void nature();
	default void money()
	{
		System.out.println("fathers money");
	}
	
	
}
