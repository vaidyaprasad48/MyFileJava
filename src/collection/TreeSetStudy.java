package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet();
		t.add(90);
		//t.add("pune");
		t.add(10);
		t.add(80);
		t.add(20);
		t.add(1);
		//t.add(null);
		System.out.println(t);//ascending
		
		//for each loop
		for(Object X:t)
		{
			System.out.println(X);
		}
		System.out.println("____________________");
		//for iterator
		Iterator it = t.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("______________________");
		
		//for loop
		for(int i=0;i<=t.size()-1;i++)
		{
			System.out.println(t);
		}

	}

}
