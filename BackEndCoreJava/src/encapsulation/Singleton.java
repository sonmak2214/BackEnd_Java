package encapsulation;
class AbcSingleton
{
	static  AbcSingleton a1=new  AbcSingleton();
	
	private  AbcSingleton()
	{
		System.out.println("This is singleton class example here:=");
	}
	
	public static  AbcSingleton getInstance()
	{
		
		return a1;
		
	}
}

public class Singleton 
{

	public static void main(String[] args) 
	{
		 AbcSingleton c= AbcSingleton.getInstance();
		 AbcSingleton c1=AbcSingleton.getInstance();
		 AbcSingleton c2=AbcSingleton.getInstance();
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);

	}

}
