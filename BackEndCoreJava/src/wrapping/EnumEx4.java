package wrapping;

public class EnumEx4 
{
  enum colors {Red,Green,Blue};
  
	public static void main(String[] args) 
	{
	  for(colors c1:colors.values())
	  {
		  System.out.println(c1);
	  }
	}

}
