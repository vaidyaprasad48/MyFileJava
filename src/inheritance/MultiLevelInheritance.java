package inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) 
	{
		//creating object of supermost class
		Grandfather gf=new Grandfather();
		gf.experience();
		
		//creating objecty of 2nd class(father)
		
		Father f=new Father();
		f.money();
		f.experience();
		//creating object of sub class
		
		Daughter d=new Daughter();
		d.scooty();
		d.money();
		d.experience();
		

	}

}
