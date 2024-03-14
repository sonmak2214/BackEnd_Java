package patternProgs;
//A to Z--65 to 90
//a to z--97 to 122
public class Alphabate 
{
	 public static void main(String[] args) 
	{
		int alpbt=64;
		for(int i=1;i<=5;i++)//5<=5
		{
			for(int j=1;j<=5;j++)//2<=5
			{
				System.out.print((char)(alpbt+i));
			}
			System.out.println();
		}
	}
}
/*   A A A A A
 *   B B B B B
 *   C C C C C
 *   D D D D D
 *   E E E E E
*/
