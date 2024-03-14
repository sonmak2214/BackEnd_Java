package exceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.*;
public class MultTryCatchEx 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Numer:");
		int number1=sc.nextInt();
		System.out.println("Ente Second Number:");
		int number2=sc.nextInt();
		
		int answer=0;
		
		try
		{
			answer=number1/number2;
			System.out.println("Division Of Number Is:="+answer);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(InputMismatchException e)
		{
		 System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("After Try Catch Block Here:");
	}

}
