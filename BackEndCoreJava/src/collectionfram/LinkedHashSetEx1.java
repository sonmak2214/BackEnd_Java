package collectionfram;
import java.util.*;
public class LinkedHashSetEx1 
{
	public static void main(String[] args) 
	{
	 Set<Integer>data=new LinkedHashSet<Integer>();//create refVariables of set interface 
	 data.add(22);
	 data.add(78);
	 data.add(31);
	 data.add(null);
	 data.add(44);
	 data.add(79);
	 data.add(44);
	 data.add(null);
	 data.add(null);
	 
	 System.out.println(data);
	 ArrayList<Integer>newdata=new  ArrayList<Integer>();//create class obj here and 
	 newdata.add(99);//and allocate memory
	 newdata.add(78);
	 newdata.add(80);
	 newdata.add(78);
	 data.addAll(newdata);
	 System.out.println("Set Is:="+data);
    }

}
