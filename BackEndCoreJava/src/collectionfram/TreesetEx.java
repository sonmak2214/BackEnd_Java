package collectionfram;
import java.util.*;
public class TreesetEx 
{
	public static void main(String[] args)
	{
		TreeSet<String>t=new TreeSet<String>();
        t.add("Sonal");
        t.add("Goldal");
        t.add("Pranjali");
        t.add("Priyanka");
        t.add("Prajakta");
        t.add("Sonal");
        
        Iterator<String>itr=t.iterator();
        
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        System.out.println("Descending Iterator:");
        Iterator<String>itr1=t.descendingIterator();
        while(itr1.hasNext())
        {
        	System.out.println(itr1.next());
        }
        System.out.println("First Element:"+t.pollFirst());
        System.out.println("Last Element:"+t.pollLast());
	}
}
