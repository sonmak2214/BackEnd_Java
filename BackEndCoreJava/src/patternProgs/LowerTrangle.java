package patternProgs;
public class LowerTrangle 
{
	public static void main(String[] args) 
	{
	  for(int i=1;i<=5;i++) //5<=5
	  {
		  for(int k=1;k<=i;k++)//0<=5
		  {
			  System.out.print(" ");
		  }
		  for(int j=5;j>=i;j--)//5>=5
		  {
			  System.out.print(" * ");
		  }
		  System.out.println();
	  }
    
	}

}
/*   
   * * * * *   
    * * * *
     * * *
      * * 
       *
*/