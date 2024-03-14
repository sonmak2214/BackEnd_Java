package multithreading;

public class EvenThreadEx extends Thread
{
	public void run()
	{
		for(int i=2;i<=100;i+=2)
		{
			System.out.println(i);
			try 
			{
				this.sleep(500);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args)
	{
		EvenThreadEx e1=new EvenThreadEx();
        e1.start();
	}

}
