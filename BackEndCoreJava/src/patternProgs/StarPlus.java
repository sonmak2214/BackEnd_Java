package patternProgs;
public class StarPlus 
{
 public static void main(String[] args) 
 {
   	for(int i=1;i<=5;i++)//4<=5
   	{
   		for(int j=1;j<=5;j++)//1<=5
   		{
   			if(i==3||j==3)
   			{
   				System.out.print(" * ");
   			}
   			else
   			{
   				System.out.print("   ");
   			}
   		}
   		System.out.println();
   	}
 }

}
/*      *  
        *
    * * * * *
        *
        *
*/