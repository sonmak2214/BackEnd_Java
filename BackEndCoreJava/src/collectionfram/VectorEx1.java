package collectionfram;
import java.util.Iterator;
import java.util.Vector;
public class VectorEx1 
{
	public static void main(String[] args) 
	{
		Vector<String>v1=new Vector<String>();
		v1.add("Tiger");
		v1.add("Lion");
		v1.add("Dog");
		v1.add("Elephant");
		System.out.println(v1);
		v1.addElement("Mouse");
		v1.addElement("cat");
		v1.addElement("Deer");
		v1.addElement("Ox");
		
		System.out.println("Elements Are:="+v1);
		
		Iterator<String>itr=v1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
