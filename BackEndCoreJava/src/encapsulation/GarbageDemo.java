package encapsulation;

public class GarbageDemo //compile time block
{
	GarbageDemo()
	{
		System.out.println("Object is created here:");
	}
	
	protected void finalize()
	{
		System.out.println("Finalized method called here:");
	}
	

	public static void main(String[] args) //runtime block
	{
		GarbageDemo g1=new GarbageDemo();
		g1=null;
		GarbageDemo g2=new GarbageDemo();
		g2=null;
		System.gc();
		System.out.println("End Of The Programm..");
	}

}
