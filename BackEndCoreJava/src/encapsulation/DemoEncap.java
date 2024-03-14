package encapsulation;

public class DemoEncap 
{
	private int rlno=10;
	private String name="Sonal Patil";
	private char gr='A';
	
	
	@Override
	public String toString() 
	{
		return "DemoEncap [rlno=" + rlno + ", name=" + name + ", gr=" + gr + "]";
	}
	
   /* public void show()
	{
		System.out.println("Name:-"+name+"\nRoll Number:"+rlno+"\nGrade:-"+gr);
	}*/
	/*public static void main(String[] args) 
	{
		DemoEncap d1=new DemoEncap();
	    d1.show();
	 //System.out.println(d1.toString());

	}*/
}
