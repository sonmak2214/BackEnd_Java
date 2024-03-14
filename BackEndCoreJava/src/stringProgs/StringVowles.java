package stringProgs;

import java.util.Scanner;

public class StringVowles 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String:");
		String s1=sc.next();
		int count=0;
		
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count=count+1; //count++;
			}
		}
		System.out.println("Number Of Vowels are exist in String:="+count);
		
	}

}
