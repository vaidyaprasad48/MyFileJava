package inheritance;

public class SingleLevalInheritance {

	public static void main(String[] args) 
	{
		//calling mother properties using mothers object
		
		Mother m=new Mother();
		m.nature();//calling mother properties using mother object
		m.love();//calling mother properties using mother object
		
		//calling son properties using sons object
		
		son s=new son();
		s.laptop();//calling son properties using son object
		s.mobile();//calling son properties using son object
		
		s.love();//calling mother properties using son object
		s.nature();//calling mother properties using son object
		
		//for static
		//another class classname.methodname
		Mother.look();
		
		son.bike();
		son.look();
		

	}

}
