package stringProgs;

public class StringEqual
{

	public static void main(String[] args)
	{
	 String s1="Technolearn Training";
	 String s2="technolearn training";
	 
	 if(s1.equals(s2))
	 {
		 System.out.println("Strings are equals");
	 }
	 else
	 {
		 System.out.println("Strings are not equal");
	 }
	 
	 if(s1.equalsIgnoreCase(s2))
	 {
		 System.out.println("Strings are same");
	 }
	 else
	 {
		 System.out.println("Strings are not same");
	 }

	}

}
