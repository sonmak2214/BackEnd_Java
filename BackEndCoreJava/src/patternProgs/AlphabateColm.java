package patternProgs;

public class AlphabateColm 
{

	public static void main(String[] args) 
	{
		//ASCII-A 65,64+1=A, ---so on
	   int let=64;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print((char)(j+let)+" ");
			}
			System.out.println();
		}

	}

}
/*     A B C D E
       A B C D E
       A B C D E
       A B C D E
       A B C D E
 */
