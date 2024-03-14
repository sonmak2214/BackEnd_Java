package patternProgs;
public class CrossStar 
{
 public static void main(String[] args) 
{
	for(int i=1;i<=5;i++)//5<=5
	{
		for(int j=1;j<=5;j++)//5<=5
		{
			if(i==j||j==6-i)
			{
				System.out.print(" * ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
/*  *          * 
      *     *
         * 
     *     *
   *          *
*/