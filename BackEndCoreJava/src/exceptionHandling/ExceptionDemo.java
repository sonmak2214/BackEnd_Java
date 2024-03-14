package exceptionHandling;

import java.util.Scanner;

public class ExceptionDemo
{

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter The Value Of 1:=");
	  int no1=sc.nextInt();
	  System.out.println("Enter The Value Of 2:=");
	  int no2=sc.nextInt();
	  
	  int result=0;
	  
	  try
	  {
		  result=no1/no2;
		  System.out.println("Result Of Number Is:="+result);
	  }
	  catch(ArithmeticException e)
	  {
		 // System.out.println(e);
		  e.printStackTrace();
	  }
	  System.out.println("After Try Catch Block Programm end Here:"+result);
	  
    }

}
