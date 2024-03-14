package wrapping;

public class EnumEx1 
{
  enum collections {NORTH,SOUTH,EAST,WEST,CENTER};
  
	public static void main(String[] args)
	{
	   for(collections c:collections.values()) //for each loop
	   {
		   System.out.println(c);
	   }
    }

}
