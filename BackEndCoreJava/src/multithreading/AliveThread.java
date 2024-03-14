package multithreading;

public class AliveThread extends Thread
{
  public void run()
  {
	  if(Thread.currentThread().isAlive())
	  {
		  System.out.println("Thread Is Alive:");
	  }
	  else
	  {
		  System.out.println("Thread Is Dead:");
	  }
  }
	public static void main(String[] args) 
	{
		AliveThread a1=new AliveThread();//main thread 
		a1.start();
	}
}
