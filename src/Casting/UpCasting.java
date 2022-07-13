package Casting;

public class UpCasting {

	public static void main(String[] args) 
	{
		Father f=new Father();
		f.bike();
		f.car();
		
		Son s=new Son();
		s.bike();
		s.car();
		s.education();
		
		System.out.println("*************");
		
		Father f1= new Son();//upcasting
		f1.bike();
		f1.car();
		//f1.education();
		
	}

}
