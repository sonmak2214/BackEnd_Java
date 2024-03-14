package javaprogs;

import java.util.Scanner;

public class ScannerEx 
{

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter First Number:=");
	  int num1=sc.nextInt();
	  System.out.println("Enter Second Number:");
	  int num2=sc.nextInt();
	  
	  int res=0; //Garbage value arent enter in the variable.
	  
	  res=num1+num2;
	  System.out.println("Result Of Addition Is:="+res);

	}

}
