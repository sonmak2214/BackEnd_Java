package encapsulation;

public class StaticDataEx 
{
  static int rlno=101;
  static String name="Sonal";
  static char gr='A';
  
  public static void show()
  {
	  System.out.println("Roll Number:-"+rlno);
	  System.out.println("Name:-"+name);
	  System.out.println("Grade:="+gr);
  }
  
  
	public static void main(String[] args) 
	{
		StaticDataEx  ss=new StaticDataEx(); 
		StaticDataEx.show(); 
	}

}
