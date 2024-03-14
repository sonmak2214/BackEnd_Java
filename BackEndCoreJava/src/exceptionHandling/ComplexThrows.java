package exceptionHandling;

import java.util.Scanner;

public class ComplexThrows 
{
  int num1,num2,result;
  
  Scanner sc=new Scanner(System.in);
  public void accept()
  {
  System.out.println("Enter Two Numbers:=");
  num1=sc.nextInt();
  num2=sc.nextInt();
  
  try
  {
	  if(num2==0)
		  throw new ArithmeticException("Division By Zero");
	  result=num1/num2;
	  System.out.println(num1+"/"+num2+"="+result);
  }
  catch(ArithmeticException e)
  {
	  System.out.println(e);
  }
  }
	public static void main(String[] args)
	{
		ComplexThrows  c1=new ComplexThrows();
		c1.accept();
	}

}
