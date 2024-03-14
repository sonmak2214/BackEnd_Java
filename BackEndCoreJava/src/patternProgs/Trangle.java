package patternProgs;
public class Trangle 
{
	public static void main(String[] args) 
	{
		int i,j,k;
		for(i=1;i<=5;i++)//6<=5--flse
		{
			for(k=4;k>=i;k--)//4>=5--false
			{
				System.out.print("  ");
			}
			for(j=1;j<=i;j++)//6<=5--false
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
   }

}
   /*       *
          *   *
       *   *    *
      *   *   *    *
    *   *   *   *    *                      
   
   */   
