package logicalProblem;

public class ArmStrongNumber {

	public static void main(String[] args) 
	{
		//123-----1^3+2^3+3^3=1+8+27=36
		//153-----1^3+5^3+3^3=1+125+27=153
		int num=153;
		int num1=0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			num1=num1+(rem*rem*rem);
		}
		if(num==num1)
		{
		System.out.println("given number "+num+" is ArmString number");
		}
		else
		{
			System.out.println("given number "+num+"is not ArmString number");
		}
		
		
	}

}
