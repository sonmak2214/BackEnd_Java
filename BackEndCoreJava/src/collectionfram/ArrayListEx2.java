package collectionfram;
import java.util.*;
public class ArrayListEx2 
{
	public static void main(String[] args) 
	{
	ArrayList<Integer>a1=new ArrayList<Integer>();//array of object is created
	a1.add(800);
	a1.add(60);
	a1.add(88);
	a1.add(0);
	a1.add(null);
	a1.add(null);
	a1.add(100000000);
	a1.add(88);
	
	Iterator<Integer>i1=a1.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	a1.add(4);
	System.out.println(a1);
	a1.remove(2);
	System.out.println(a1);
	a1.clear();
	System.out.println(a1);
	}

}
