package collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinklistFile {

	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList(); //object create
		
		ll.add("Velocity");
		ll.add(123);
		ll.add('A');
		ll.add(12.34);
		ll.add("Velocity");
		ll.add(null);
		ll.add(null);
		ll.add(true);
		
		System.out.println(ll);
		
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.getFirst());//head
		System.out.println(ll.getLast());//tail
		System.out.println(ll.peek());
		System.out.println(ll);
		System.out.println(ll.peekFirst());
		System.out.println(ll);
		System.out.println(ll.peekLast());
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.pollFirst());
		System.out.println(ll);
		System.out.println(ll.pop());
		System.out.println(ll.pop());
		System.out.println(ll);
		
		System.out.println("______________");
		
		//for loop, for each, iterator,listiterator
		
		//for each loop
		for(Object c:ll)
		{
			System.out.println(c);
		}
		//listiterator
		System.out.println("++++++++++++++++++++");
		
		ListIterator x = ll.listIterator();
		while(x.hasNext())
		{
			System.out.println(x.next());
		}
		
	}

}
