package patternProgs;

public class PrintAlphabate 
{
	public static void main(String[] args) 
	{
		int i,j,let=64;
		int count=0;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
			 count=count+1;	
			System.out.print((char)(count+let)+" ");
			}
			System.out.println();
		}
	}

}
/*  A B C D E
 *  F G H I J
 *  K L M N O
 *  P Q R S T 
 *  U V W X Y
 */
