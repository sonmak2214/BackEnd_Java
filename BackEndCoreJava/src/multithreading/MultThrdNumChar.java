package multithreading;

public class MultThrdNumChar extends Thread
{
    public void run()
    {
    	int i;
    	for(i=1;i<=100;i+=2)
    	{
    		System.out.println(i);
    		try
    		{
				this.sleep(200);
			} catch (InterruptedException e) 
    		{
				e.printStackTrace();
			}
    	}  	
    }
	public static void main(String[] args) throws InterruptedException
	{
		  for(char ch='a';ch<='z';ch++)
	    	{
	    		System.out.println(ch);
	    	      Thread.sleep(700);
	    	}
		  
		  MultThrdNumChar m1=new  MultThrdNumChar();
			 m1.start();		 
	}

}
