package collectionfram;
import java.util.*;
public class HashTableEx 
{
    public static void main(String[] args) 
	{
    	Hashtable<Integer,String>table=new Hashtable<Integer,String>();	
        table.put(2,"Orange");
        table.put(3,"White");
        table.put(33333,"Red");
        table.put(2200,"Yellow");
        table.put(4,"Blue");
        table.put(60,"Purple");
        table.put(2,"Orange");
        
        System.out.println(table);
        
        for(Map.Entry m1:table.entrySet())
        {
        	System.out.println(m1.getKey()+" "+m1.getValue());
        }
        table.remove(33333);
        System.out.println(table);
        
        table.put(5,"Violet");
        System.out.println(table);
        
        table.clear();
        System.out.println(table);
	}

}
