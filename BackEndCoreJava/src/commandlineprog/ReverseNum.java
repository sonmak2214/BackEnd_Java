package commandlineprog;

public class ReverseNum 
{

	public static void main(String[] args) 
	{
	   int no=Integer.parseInt(args[0]);
	   int rem,rev;
	   rev=0;//garbage value arent enter in the variable.
	   
	   while(no!=0) //  125!=0,12!=0,1!=0,0!=0
	   {
		  rem=no%10;  //125%10= 5,12%10=2,1%1=1,
		  rev=rev*10+rem;//0*10+5=5,50+2=52,520+1=521
		  no=no/10;//125/10=12,12/10=1,1/1=0
		  
	   }
	   System.out.println("Revere Number:"+rev);

	}

}
