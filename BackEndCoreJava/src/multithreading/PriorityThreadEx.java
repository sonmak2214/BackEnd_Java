package multithreading;

public class PriorityThreadEx extends Thread
{
    public void run()
    {
    	for(int i=1;i<=1;i++)
    	{
   System.out.println(Thread.currentThread().getPriority()+"\n"+Thread.currentThread().getId());
    	}
    }
	public static void main(String[] args) 
	{
		PriorityThreadEx pp=new PriorityThreadEx();
		pp.setPriority(MAX_PRIORITY);//10
		pp.start();
		PriorityThreadEx pp1=new PriorityThreadEx();
		pp1.setPriority(NORM_PRIORITY);//5
		pp1.start();
		PriorityThreadEx pp2=new PriorityThreadEx();
		pp2.setPriority(MIN_PRIORITY);//1
		pp2.start();	
	}
}
