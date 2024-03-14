package patternProgs;
public class RHSTrang 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++) //5<=5
		{
			for(int k=4;k>=i;k--) //4>=5
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)//5<=5
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
/*
          *
       *  *
    *  *  *
  * *  *  *
* * *  *  *

*/