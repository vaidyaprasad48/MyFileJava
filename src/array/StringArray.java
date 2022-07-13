package array;

public class StringArray {

	public static void main(String[] args) 
	{
		String name[]=new String[6];
		
		name[0]="ram";
		name[1]="sonu";
		name[2]="seeta";
		
		System.out.println(name[5]);
		
		for (int i=0; i<=name.length-1; i++)
		{
			System.out.println(name[i]);
		}
		
	}

}
