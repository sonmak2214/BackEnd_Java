package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MulCatchEx
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int no1=sc.nextInt();
		System.out.println("Enter Second Number:");
		int no2=sc.nextInt();
		
		int answer=0;
		
		try
		{
			answer=no1/no2;
			System.out.println("Answer Is:="+answer);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(InputMismatchException e)
		{
		  System.out.println(e.getMessage());	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Programm Run Succesfully.....");

	}

}
