package interfaceStudy;//stage6

public interface Mother 
{
	void love();
	default void money()
	{
		System.out.println("mother money");
	}
	

}
