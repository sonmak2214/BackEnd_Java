package patternProgs;

public class SquareDigit 
{
  public static void main(String[] args)
  {
	for(int i=1;i<=5;i++)//5<=5
	{
		for(int j=1;j<=5;j++)//5<=5
		{
			if(i==1|j==1||i==5||j==5)
			{
				System.out.print(" * ");
			}
			else
			{
				System.out.print(j-1+"  ");
			}
		}
		System.out.println();
	}
  }
}
/*  * * * * *
    * 1 2 3 *
    * 1 2 3 *
    * 1 2 3 *
    * * * * * 
*/