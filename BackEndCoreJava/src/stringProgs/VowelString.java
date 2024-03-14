package stringProgs;

import java.util.Scanner;

public class VowelString
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The string:");
		String s1=sc.next();
		int count=0;
		
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;//count=count+1;
			}
		}
		System.out.println("Number of vowel in given string:="+count);

	}

}
