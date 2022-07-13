package array;

public class FloatArray 
{

	public static void main(String[] args) 
	{
		//with using new keyword
		//method decleration
		float percentage[]= new float[5];
		//method initalisation
		
		percentage[0]=36.56f;
		percentage[0]=56.65f;
		percentage[0]=46.56f;
		percentage[0]=39.86f;
		percentage[0]=30.50f;
		
		//usages
		for(int i=0;i<=percentage.length-1;i++)
		{
			System.out.println(percentage[i]);
		}
		
		System.out.println("+++++++++++++++++++++++++++=");
		//without using new keyword
		float[] per= {45.69f,65.87f,98.34f,20.76f,67.98f};
		for(int b=0;b<=per.length-1; b++)
		{
			System.out.println(per[b]);
		}
		
	}

}
