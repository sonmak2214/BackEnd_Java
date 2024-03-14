package collectionfram;
import java.util.*;
public class ArrayListEx 
{
	public static void main(String[] args) 
	{
		ArrayList<String>l1=new ArrayList<String>();//object  of class is created here..
		l1.add("Apple");
		l1.add("Pinapple");
		l1.add("Graphes");  //inserion order followed here
		l1.add("custeredApple");
		l1.add("Banana");
		l1.add("Apple");
		l1.add("Orange");
		
		Iterator<String>itr=l1.iterator();
		while(itr.hasNext()) //it check more than one elem is exist or not
			                 // inside the list
		{
			System.out.println(itr.next());//current element check next ele
			                               //ment exist or not inside the list
		}
		l1.add(2,"Watermalon");
		System.out.println(l1);
		l1.remove(3);
		System.out.println(l1);
	}

}
