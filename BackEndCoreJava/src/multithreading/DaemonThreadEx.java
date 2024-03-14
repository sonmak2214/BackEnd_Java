package multithreading;

public class DaemonThreadEx extends Thread
{
     public void run()
     {
    	 if(Thread.currentThread().isDaemon())
    	 {
    		 System.out.println("Current Thread Is Daemon Thread:");
    	 }
    	 else
    	 {
    		 System.out.println("Currunt Thread Is User Thread:");
    	 }
     }
	public static void main(String[] args) 
	{
		 DaemonThreadEx d1=new  DaemonThreadEx();
		 DaemonThreadEx d2=new  DaemonThreadEx();
		 DaemonThreadEx d3=new  DaemonThreadEx();
		 d1.setDaemon(true);
		 d2.setName("Thread2");
		 d3.setName("Thread3");
		 d1.start();
		 d2.start();
		 d3.start();
	}

}
