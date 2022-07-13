package sampleTest;                          //5th stage from other package

import accessSpecifires.Velocity;

public class AccessTest extends Velocity {

	public static void main(String[] args) 
	{
		Velocity v=new Velocity();
		//v.test1();//calling private in another package
		//v.test2();//calling default
		//v.test3(); //calling protected
		v.test4();//call public method----->(visible througout project)
		
		//object should be created of subclass
		
		AccessTest at= new AccessTest();
		at.test3();
		

	}

}
