package method;

public class NagpurUniversity {

	public static void main(String[] args)
	{
		NagpurUniversity NU= new NagpurUniversity();
		NU.StudentInfo();//without parameter
		NU.StudentInfo();
		NU.StudentInfo();
		NU.StudentInfo("Sai Baba", "EN12568", "Engg", 4, 'B');//calling method with parameter
		NU.StudentInfo("OM", "px1234","MBA", 3, 'A');
		NU.StudentInfo("Nana Bhau", "pc1223", "bsc", 2, 'C');
		NU.StudentInfo();//without par
		NU.StudentInfo("prasad", "123445", "BSC", 5, 'c');
		
		
		
		
		

	}
	//stage1
	public void StudentInfo()//regular non static method---->without parameter
	{
		//Name;PRN; course; Year;Grade
		
		String name="Sai Baba";
		String PRN="EN12568";
		String Course="Engg";
		int Year=4;
		char Grade='B';
		
		
		System.out.println("=========================");
		System.out.println("student name is "+name);
		System.out.println("student PRN no. is "+PRN);
		System.out.println("student course is "+Course);
		System.out.println("student year is "+Year);
		System.out.println("student grade is "+Grade);
		System.out.println("********************************");
	}
	
	public void StudentInfo(String name, String PRN, String Course,int Year,char Grade)//non static--->withparimater
	{
		System.out.println("*************************");
		System.out.println("student name is "+name);
		System.out.println("student prn no. is "+PRN);
		System.out.println("student course is "+Course);
		System.out.println("student year is "+Year);
		System.out.println("student grade is "+Grade);
		System.out.println("***************************");
	}
	
	

}
