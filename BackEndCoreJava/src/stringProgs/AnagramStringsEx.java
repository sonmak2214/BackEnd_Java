package stringProgs;

import java.util.Arrays;

public class AnagramStringsEx
{

	public static void main(String[] args) 
	{
		String s1="left";
		String s2="felt";
		
		char ch1[]=s1.toLowerCase().toCharArray();
		char ch2[]=s2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("Both Strings are Anagrams Strings:");
		}
		else
		{
			System.out.println("Both Strings are Not Anagrams Strings:");
		}

	}

}
