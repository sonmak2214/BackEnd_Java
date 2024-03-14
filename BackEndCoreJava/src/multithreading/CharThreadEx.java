package multithreading;

public class CharThreadEx implements Runnable
{
    @Override
	public void run() 
	{
		char ch;
		for(ch='A';ch<='Z';ch++)
		{
			System.out.println(ch);
			try
			{
				Thread.sleep(1000);//1000ms =1second
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) 
	{
		CharThreadEx c1=new CharThreadEx();
		Thread th=new Thread(c1);
		th.start();
	}

}
