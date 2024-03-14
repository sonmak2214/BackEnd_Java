package exceptionHandling;

import java.util.Scanner;

public class FinallyEx 
{
	   public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter First Number:");
    	int num1=sc.nextInt();
    	System.out.println("Enter Second Number:=");
    	int num2=sc.nextInt();
       int ans=0;
    	try
    	{
    		ans=num1/num2;
    		System.out.println("Answer Is:="+ans);
    	}
    	catch(ArithmeticException e)
    	{
    		e.printStackTrace();
    	}
    	finally
    	{
    		System.out.println("After Try Catch Block Finally block must exicuted");
    	}
         System.out.println("End Of The Programm Here:");
	}

}
