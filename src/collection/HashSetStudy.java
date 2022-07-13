package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) 
	{
		
		HashSet hs=new HashSet();
		hs.add("Nagpur");
		hs.add("Nagpur");
		hs.add(null);
		hs.add(null);
		hs.add(1234);
		hs.add(true);
		hs.add(12.45);
		hs.add('A');
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains('A'));
		System.out.println(hs.contains('B'));
		System.out.println(hs.isEmpty());
		System.out.println(hs.clone());
		System.out.println(hs);
		System.out.println(hs.remove(12.45));
		System.out.println(hs);
		System.out.println(hs.size());
		//System.out.println(hs.iterator());
		//System.out.println(hs.spliterator());
		
		
		//for loop
		//for each loop
		//iterator loop
		System.out.println("______________________________");
		//for each loop
		for(Object x:hs)
		{
			System.out.println(x);
		}
		
		System.out.println("__________________________");
		
		//for iterator
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//forloop
		for(int i=0;i<=hs.size()-1;i++)
		{
			System.out.println(hs);
		}
		
	}
	

}
