package multithreading;

public class Syntask1 extends SynchTasks
{
	SynchTasks s1=new SynchTasks();
	{
		new Thread()
		{
			public void run()
			{
				s1.withdraw(1500);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				s1.deposite(1000);
			}
		}.start();
	}
	
}
