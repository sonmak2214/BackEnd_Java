package collectionfram;
import java.util.*;
public class LinkedListEx2 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer>ll=new LinkedList<Integer>();
		ll.add(88888);
		ll.add(8);
		ll.add(770000);
		ll.add(2222);
		ll.add(11553);
		ll.add(null);
		ll.add(null);
		System.out.println(ll);
		Iterator<Integer>itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ll.clear();
		System.out.println(ll);
	}

}
