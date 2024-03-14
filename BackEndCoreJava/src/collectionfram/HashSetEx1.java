package collectionfram;
import java.util.*;
public class HashSetEx1
{
	public static void main(String[] args) 
	{
	 HashSet<String>set=new HashSet<String>();//create object of hashset class	
	 set.add("one");
	 set.add("two");
	 set.add(null);
	 set.add("three");
	 set.add("Four");
	 set.add("Five");
	 set.add("Five");
	 set.add("two");
	 set.add("Six");
	 set.add(null);
	 
	 Iterator<String>i=set.iterator();
	 while(i.hasNext()) //multiple elem exist inside set
	 {
		 System.out.println(i.next()); //current elem exist in set
	 }
	 set.remove("Five");
	 System.out.println(set);
	 
	 if(set.contains("Four"))
	 {
		 System.out.println("Exist In The Set");
	 }
	 else
	 {
		 System.out.println("Not Exist In The Set");
	 }
	}
}
