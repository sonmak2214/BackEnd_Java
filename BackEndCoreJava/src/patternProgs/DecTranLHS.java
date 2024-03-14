package patternProgs;
public class DecTranLHS 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)//6<=5
		{
			for(int j=5;j>=i;j--)//4>=5
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
/*   * * * * *
     * * * *
     * * *
     * *
     * 
 */ 
