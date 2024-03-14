package collectionfram;
import java.util.Iterator;
import java.util.Vector;
public class VectorEx2 
{
	public static void main(String[] args)
	{
		Vector<Integer>v=new Vector<Integer>();
		v.add(100);
		v.add(2000);
		v.add(500000);
		v.add(55220011);
		System.out.println(v);
		v.addElement(1);
		v.addElement(20);
		v.addElement(5);
		v.addElement(0);
		Iterator<Integer>itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		v.addElement(4);
		System.out.println(v);
		v.removeElementAt(5);
		System.out.println(v);
		v.clear();
	}
}
