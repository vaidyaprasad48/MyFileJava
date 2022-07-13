package method;

public class MumbaiIndians 
{

	public static void main(String[] args) 
	{
		MumbaiIndians MI = new MumbaiIndians();
		PlayerInformation();
		MI.PlayerInformation("virat kohli", "April 29 1989", "Mumbai", "Batsman", "Left hand bat", 8,22.58f);
		MI.PlayerInformation("prasad", "june 9 1994","nagpur", "bolling", "right hand bat", 6, 55.86f);
		
		
		
		

		
		
		
		
	}
	public static void PlayerInformation()//regular non static method----without parimeter
	{
		//name, born, birthplace, role, batingstyle, winIPL;
		
		String Name="Virat Kohli";
		String Born="April 29 1989";
		String Birthplace="Mumbai";
		String Role="Batsman";
		String BatingStyle="Left hand bat";
		int WinIPL=8;
		float distance= 22.58f;
		
		System.out.println("***********************");
		System.out.println("name is "+Name);
		System.out.println("when born "+Born);
		System.out.println("birth place is "+Birthplace);
		System.out.println("role is "+ Role);
		System.out.println("bating style is "+BatingStyle);
		System.out.println(" player win IPL "+WinIPL);
		System.out.println("distance is "+ distance);
		System.out.println("***************************");
		
	}
	public void PlayerInformation(String Name, String Born, String BirthPlace, String Role, String BatingStyle, int WinIPL,float distance)//with parimeter
	{
		System.out.println("**************************");
		System.out.println("name is "+Name);
		System.out.println("When born "+Born);
		System.out.println("birth place is "+BirthPlace);
		System.out.println("role is "+Role);
		System.out.println("player bating style is "+BatingStyle);
		System.out.println("player win IPl "+WinIPL);
		System.out.println("distance of player "+ distance);
		System.out.println("---------------------------------------");
		
		
	}
	

}
