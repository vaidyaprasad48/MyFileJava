package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayListStudty {

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();//generic array list
		
		a.add("Velocity");
		a.add('B');
		a.add(123);
		a.add(123.234);
		a.add("Velocity");
		a.add(123);
		a.add(null);
		a.add(true);
		
		
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains(123));
		System.out.println(a.get(2));
		System.out.println(a.get(0));
		System.out.println(a.indexOf(123));
		System.out.println(a.indexOf("Velocity"));
		System.out.println(a.lastIndexOf("Velocity"));
		System.out.println(a.remove(1));
		System.out.println(a);
		
		System.out.println("++++++for loop++++++++");
		
		for(int i=0;i<=a.size()-1;i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("++++++by using iterator++++++");
		
		//by using iterator
		Iterator it = a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		System.out.println("}}}}}}}}}listiterator}}}}}}}}}}}}");
		
		//listiterator
		
		ListIterator list = a.listIterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		System.out.println("+++++++++for each loop++++++++++++++");
		//for each loop
		
		for(Object s:a)
		{
			System.out.println(s);
			
		}
		
		System.out.println("++++specific arraylist++++++");
		
		ArrayList<Integer> ai=new ArrayList<>();//specific arraylist
		ai.add(1);
		ai.add(12);
		ai.add(14);
		ai.add(11);
		ai.add(55);
		
		System.out.println(ai);
		for(Integer x:ai)
		{
			System.out.println(x);
		}
		
		
		
		ArrayList<Character> ch=new ArrayList<>();
		ch.add('A');
		ch.add('B');
		ch.add('C');
		ch.add('C');
		ch.add('D');
		System.out.println(ch);
		
		for(Character y:ch)
		{
			System.out.println(y);
		}
		
		System.out.println("++++USING LIKLIST++++++++");
		
		//using linklist
		
		LinkedList<String> li=new LinkedList<>();
		li.add("prasad");
		li.add("dinesh");
		li.add("Abhinav");
		li.add("Shekhar");
		
		System.out.println(li);
		
		for(String z:li)
		{
			System.out.println(z);
		}
		System.out.println("_____________________");
		
		Iterator<String> it1 = li.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		
	}

}
