package wrapping;

public class EnumEx3 
{
    enum seasons {Winter,Summer,Rainy};
    
	public static void main(String[] args) 
	{
	  for(seasons s:seasons.values())	
	  {
		  System.out.println(s);
	  }

	}

}
