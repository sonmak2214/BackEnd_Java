package constructor;

public class DefConstEx3 
{
	String lang1="Core Java";
	String lang2="Advanced Java";
	
	private DefConstEx3() 
	{
		//lang1="Core Java";
		//lang2="Advanced Java";
		System.out.println("This Is Default Constructor Here");
	}

	public static void main(String[] args)
	{
		DefConstEx3  d1=new DefConstEx3();
		System.out.println(d1.lang1);
		DefConstEx3  d2=new DefConstEx3();
		System.out.println(d2.lang2);

	}

}
