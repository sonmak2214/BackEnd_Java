package commandlineprog;

public class GreterNum 
{

	public static void main(String[] args) 
	{
		int no1=Integer.parseInt(args[0]);
		int no2=Integer.parseInt(args[1]);
		
		if(no1>no2)
		{
			System.out.println("No1 Is Greater Number:");
		}
		else
		{
			System.out.println("No2 Is Not Greter Number");
		}

	}

}
