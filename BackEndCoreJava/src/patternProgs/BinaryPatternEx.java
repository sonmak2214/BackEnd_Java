package patternProgs;
public class BinaryPatternEx
{
    public static void main(String[] args)
	{ 
	  for(int i=1;i<=5;i++)//1<=5
	  {
		  for(int k=4;k>=i;k--)//4>=1
		  {
			  System.out.print("  ");
		  }
		  for(int j=1;j<=i;j++)//1<=1
		  {
			 if(i%2==0)//(i>0.5)=1 otherwise =0
			 {
				 System.out.print(" 0 ");
			 }
			 else
			 {
				 System.out.print(" 1 ");
			 }
		  }
		  System.out.println();
	  }
	}
}
/*         1
 *       0   0
 *     1   1   1
 *   0  0    0    0
 * 1  1   1    1    1     
 */
