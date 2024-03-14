package patternProgs;
public class RighthandTrangle 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)//6<=5
		{
		 	for(int k=4;k>=i;k--)//4>=5
		 	{
		 		System.out.print("  ");
		 	}
		 	for(int j=1;j<=i;j++)//6<=5
		 	{
		 		System.out.print(" * ");
		 	}
		 	System.out.println();
		}
	}
}
/*           *
           * *
         * * *
       * * * *
     * * * * *
 */
