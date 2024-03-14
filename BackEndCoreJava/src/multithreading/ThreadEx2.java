package multithreading;

public class ThreadEx2 implements Runnable
{
	@Override
	public void run() 
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println(Thread.currentThread().getId());
		}
	}

	public static void main(String[] args) 
	{
		ThreadEx2 tt=new ThreadEx2();
		Thread t1=new Thread(tt);//Thread class created here 
		t1.start();
		Thread t2=new Thread(tt);
		t2.start();
		Thread t3=new Thread(tt);
		t3.start();
	}

}
