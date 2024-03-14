package stringProgs;

import java.util.Scanner;

public class StringAsusual 
{

	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);	
     System.out.println("Enter The String");
     String s1=sc.next();
     
     for(int i=0;i<s1.length();i++)
     {
    	 char ch=s1.charAt(0);
    	 s1=s1.substring(1);
    	 s1=s1+ch;
    	 //System.out.println(s1);
     }
     System.out.println(s1);
 }

}
