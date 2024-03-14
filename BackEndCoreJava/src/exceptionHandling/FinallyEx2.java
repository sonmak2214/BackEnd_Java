package exceptionHandling;
public class FinallyEx2 
{
  public static void main(String[] args)
  {
    System.out.println("1");
    System.out.println("2");
    try
    {
    	System.out.println(9/0);//logic build here
    }
    catch(ArithmeticException e)
    {
    	System.out.println(e);
    }
    finally
    {
    	System.out.println("4");
    	System.out.println("5");
    }
    System.out.println("End Of The Programm Here:");
  }

}
