package exceptionHandling;

public class ThrowsEx2 
{
	int num1,num2,ans=0;
	
	public ThrowsEx2(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	public void display() throws ArithmeticException
	{
		ans=num1/num2;
		System.out.println("Answer Is:="+ans);
	}
    public static void main(String[] args) 
	{
    	ThrowsEx2  t1=new ThrowsEx2(10,20);
    	try
    	{
    	t1.display();
    	}
    	catch(ArithmeticException e)
    	{
    		e.printStackTrace();
    	}
}
}
