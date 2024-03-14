package multithreading;

public class InterThreadCommun   
{
   public synchronized void printtable(int n)
   {
	   for(int i=1;i<=10;i++)
	   {
		   System.out.println(n*i);
		   try 
		   {
			Thread.sleep(1000);
		   } 
		   catch (InterruptedException e)
		   {
			e.printStackTrace();
		}
	   }
   }
	public static void main(String[] args) 
	{
		InterThreadCommun t1=new InterThreadCommun();
		System.out.println(t1);
	}
}
class MyThread1 extends Thread
{
	InterThreadCommun t;
	MyThread1(InterThreadCommun t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printtable(10);
	}
}
