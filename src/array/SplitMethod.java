package array;

public class SplitMethod {

	public static void main(String[] args) 
	{
		String s= "VELOCITY CORPORATE TRANNING CENTER";
		
		String[] output = s.split("T");
	//	System.out.println(output);
		for(int i=0;i<=output.length-1;i++)
		{
			System.out.println(output[i]);
		}
		

	}

}
