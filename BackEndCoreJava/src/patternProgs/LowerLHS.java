package patternProgs;
public class LowerLHS 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)//6<=5 --constant
		{
			for(int j=5;j>=i;j--)//4>=5
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
/*
    * * * * *    
    * * * *
    * * *
    * *
    *
*/