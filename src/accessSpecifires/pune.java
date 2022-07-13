package accessSpecifires;                               //4th stage

public class pune {

	public static void main(String[] args) 
	{
		Velocity v= new Velocity();
		//v.test1(); we cant call private no. in another class
		v.test2();//calling default method------->(visible within Package)
		v.test3();
		v.test4();
		

	}

}
