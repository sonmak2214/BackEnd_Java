package patternProgs;
public class DiamondShapeEx 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)//2<=5
		{
			for(int k=4;k>=i;k--)//1>=2
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)//1<=2
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)//2<=5
		{
			for(int k=1;k<=i;k++)//3<=2
			{
				System.out.print(" ");
			}
			for(int j=4;j>=i;j--)//4>=2
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}/*           *
            *   *
          *   *   *
        *   *   *   *
      *  *    *   *   *
       *    *   *   *
         *    *   *
            *   *
             *    
*/
