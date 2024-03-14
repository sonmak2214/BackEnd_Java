package multithreading;
class NumberThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i+=2)
		{
		System.out.println(i);
		try 
		{
			this.sleep(100);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	    }
	}
}
class CharThread extends Thread
{
	public void run()
	{
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println(ch);
			try
			{
				this.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
public class NumCharMultThrdEx1 
{

	public static void main(String[] args)
	{
		NumberThread n1=new NumberThread();
		n1.start();
		CharThread c1=new CharThread();
		c1.start();
	}


}


