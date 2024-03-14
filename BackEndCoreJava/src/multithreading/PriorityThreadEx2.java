package multithreading;

public class PriorityThreadEx2 extends Thread
{
      public void run()
      {
    	  for(int i=1;i<=2;i++)
    	  {
    		  System.out.println(Thread.currentThread().getName()+"\n"+
    	           Thread.currentThread().getPriority());
    	  }
      }
	public static void main(String[] args) 
	{
		PriorityThreadEx2 pp=new PriorityThreadEx2();
		pp.setName("Thread1");
		pp.setPriority(10);
		pp.start();
		PriorityThreadEx2 pp1=new PriorityThreadEx2();
		pp1.setName("Thread2");
		pp1.setPriority(5);
		pp1.start();
		PriorityThreadEx2 pp2=new PriorityThreadEx2();
		pp2.setName("Thread3");
		pp2.setPriority(1);
		pp2.start();	
  }

}
