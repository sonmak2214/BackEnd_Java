package wrapping;

public class EnumEx2 
{
 enum collections {A,E,I,O,U};//fix set of constant
 
	public static void main(String[] args) 
	{
      for(collections c1:collections.values())
      {
    	  System.out.println(c1);
      }

	}

}
