package multithreading;

public class InteruptedThread extends Thread
{
      public void run()
      {
    	  if(Thread.currentThread().isInterrupted())
    	  {
    		 
			
    		  System.out.println("Thread Is Interrupted:");
    	  }
    	  else
    	  {
    		  System.out.println("Thread Is Not Interupted:");
    	  }
      }
	public static void main(String[] args)
	{
		InteruptedThread i1=new InteruptedThread();
		i1.start();

	}

}
