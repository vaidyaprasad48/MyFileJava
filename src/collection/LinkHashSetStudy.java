package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHashSetStudy {

	public static void main(String[] args) 
	{
		LinkedHashSet lh=new LinkedHashSet();
		lh.add("Pune");
		lh.add("Pune");
		lh.add(123);
		lh.add(28.99);
		lh.add(null);
		lh.add('B');
		lh.add(null);
		
		System.out.println(lh);
		System.out.println("________________");
		//for loop
		for(int i=0;i<=lh.size()-1;i++)
		{
			System.out.println(lh);
		}
		System.out.println("________________");
		
		System.out.println(lh);
		
		System.out.println("_______________________");
		
		
		System.out.println("____________________");
		
		//for each loop
		for(Object p:lh)
		{
			System.out.println(p);
		}
		
		//for iterator
		
		Iterator k = lh.iterator();
	    while(k.hasNext())
	    {
	    	System.out.println(k.next());
	    }
	    
	    LinkedHashSet<Integer> lh1=new LinkedHashSet<>();
	    lh1.add(2);
	    lh1.add(23);
	    lh1.add(33);
	    lh1.add(20);
	    lh1.add(30);
	    System.out.println(lh1);
		
	

	}

}
