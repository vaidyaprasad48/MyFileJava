package collection;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy 
{

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		
		v.add("Nagpur");
		v.add('A');
		v.add("Nagpur");
		v.add(null);
		v.add(null);
		v.add(123);
		v.add(1.23);
		v.add(12456);
		
		System.out.println(v.elementAt(2));
		System.out.println(v.elementAt(1));
		System.out.println(v.get(5));
		System.out.println(v);
		System.out.println(v.remove(1.23));
		System.out.println(v);
		System.out.println(v.indexOf(123));
		
		System.out.println("++++++++++");
		
		//using list iterator
		ListIterator lit = v.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		
		System.out.println("++++++++++++++");
		// by using for each
		for(Object x:v)
		{
			System.out.println(x);
		}
		System.out.println("++++++++++");
		
		//by using enumeration
		Enumeration ve = v.elements();
		while(ve.hasMoreElements())
		{
			System.out.println(ve.nextElement());
		}
		
	}

}
