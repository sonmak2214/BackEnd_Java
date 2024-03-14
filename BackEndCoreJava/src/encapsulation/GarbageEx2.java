package encapsulation;

public class GarbageEx2 
{
	String name="Sonal Patil";
	
	private GarbageEx2()
	{
		System.out.println("Object is created here:");
	}
	
	protected void finalize()
	{
		System.out.println("Object Is Deleted Here:");
	}

	public static void main(String[] args)
	{
		GarbageEx2  g=new GarbageEx2();
		g=null;
		GarbageEx2 g1=new GarbageEx2();
		System.out.println(g1.name);
		GarbageEx2 g3=new GarbageEx2();
		g3=null;
		System.gc();//garbage collector here
		
	}

}
