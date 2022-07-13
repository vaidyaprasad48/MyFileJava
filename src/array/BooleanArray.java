package array;

public class BooleanArray {

	public static void main(String[] args) 
	{
		//with using new keyword
		//method decleration
		boolean result[]=new boolean[4];
		//method initilazation
		
		result[0]=true;
		result[1]=false;
		result[2]=true;
		result[3]=false;
		//uses
		for(int i=0;i<=result.length-1;i++)
		{
			System.out.println(result[i]);
		}
		
		System.out.println("***********************");
		
		//without using new keyword
		boolean marks[]= {true,false,true,true};
		for(int x=0;x<=marks.length-1;x++)
		{
			System.out.println(marks[x]);
		}
	}

}
