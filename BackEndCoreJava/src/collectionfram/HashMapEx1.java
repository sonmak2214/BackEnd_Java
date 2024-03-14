package collectionfram;
import java.util.*;
public class HashMapEx1
{

	public static void main(String[] args)
	{
	 	HashMap<Integer,String>map=new HashMap<Integer,String>();
	 	map.put(45,"Shradhha");
	 	map.put(200,"Omkar");
	 	map.put(10,"Ashwini");
	 	map.put(null, null);
	 	map.put(54,"Sujit");
	 	
	 	System.out.println("Initial List Of Element:"+map);
	 	map.remove(200);
	 	System.out.println("Updated Lis Of Elements:"+map);
	 	map.remove(10,"Ashwini");
	 	System.out.println("Updated List Of Elements:"+map);
	 	
    }

}
