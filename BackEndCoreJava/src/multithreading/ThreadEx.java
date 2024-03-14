package multithreading;

public class ThreadEx extends Thread//predefine class
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("TechnoWorld Software:");
		}
	}
 
	public static void main(String[] args) 
	{
		ThreadEx  t1=new ThreadEx();//automatically thread created--current thread
		t1.start();
		
		for(int i=1;i<=3;i++)
		{
			System.out.println("Technolearn Training:");
		}
	}

}
