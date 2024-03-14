package exceptionHandling;

import java.util.Scanner;

public class TryCatchEx 
{
    public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:=");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number:=");
		int num2=sc.nextInt();
		
		int result=0;//garbage value arent enter in the variable
		
		try
		{
			result=num1/num2;
			System.out.println("Division Is:="+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		System.out.println("After Try Catch Block Programm Will End Here: ");
	}

}
