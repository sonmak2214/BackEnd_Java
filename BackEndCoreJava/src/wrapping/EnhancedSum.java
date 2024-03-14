package wrapping;

public class EnhancedSum 
{

	public static void main(String[] args) 
	{
		int a1[]= {9,2,7,3,5,8,1,4,6};
		int sum=0; //garbage value aren't enter in the variable
		
		for(int x:a1)//enhanced for loop
		{
		  sum=sum+x;	
		  System.out.println("Sum Of The Elements:="+sum);
		}
		
		//System.out.println("Sum Of The Elements:="+sum);
		

	}

}
