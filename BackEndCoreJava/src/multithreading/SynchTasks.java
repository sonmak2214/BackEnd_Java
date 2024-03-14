package multithreading;

public class SynchTasks 
{
	int amount=10000;
	public synchronized void withdraw(int amount)
	{
		System.out.println("Going to Withdraw:");
		if(this.amount>1000)
		{
			System.out.println("Less Balance waiting for deposite");
			try 
			{
				wait();
			} catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
		}
		System.out.println("You can withdraw amount:");
		this.amount=this.amount-amount;
		System.out.println("Withdraw completed:");
	}

	public synchronized void deposite(int amount)
	{
		if(this.amount>1000)
		{
			System.out.println("Going to Deposite:");	
			try 
			{
				wait();
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
		}
		System.out.println("You can deposite amount:");
		this.amount=this.amount+amount;
		System.out.println("Deposite Completed:");
        notify();
	}

}
