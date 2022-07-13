package array;

public class CharArray {

	public static void main(String[] args) 
	{
		char name[]=new char[4];
		
		name[0]='A';
		name[1]='B';
		name[2]='C';
		name[3]='D';
		
		for(int i=0; i<=name.length-1; i++)
		{
			System.out.println(name[i]);
		}
		
		System.out.println("****************************");
		char names[]= {'A','B','C','D'};
		for(int a=0;a<=names.length-1;a++)
		{
			System.out.println(names[a]);
		}
	

	}

}
