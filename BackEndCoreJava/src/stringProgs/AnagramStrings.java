package stringProgs;
import java.util.Arrays;

public class AnagramStrings 
{

	public static void main(String[] args) 
	{
      String s1="god";
      String s2="dog";
      
      char ch1[]=s1.toLowerCase().toCharArray();
      char ch2[]=s2.toLowerCase().toCharArray();
      
      Arrays.sort(ch1);
      Arrays.sort(ch2);
      
      if(Arrays.equals(ch1, ch2))
      {
    	  System.out.println("Strings are anagrams Strings");
      }
      else
      {
    	  System.out.println("Strings are not anagrams strings");
      }
      
	}

}
