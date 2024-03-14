package collectionfram;
import java.util.*;
public class LinkedListEx1 
{

	public static void main(String[] args)
	{
		LinkedList<String>a1=new LinkedList<String>();
		a1.add("Omkar");
		a1.add(null);
		a1.add("Sujit");
		a1.add("Tejas");
		a1.add("Tejas");
		a1.add(null);
		a1.add("Shradhha");
		a1.add("Ashwint");
		
		Iterator<String>itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		a1.add(4,"Tejaswini");
		System.out.println(a1);
		
		a1.remove(5);
		System.out.println(a1);
		
		a1.clear();
		System.out.println(a1);

	}

}
