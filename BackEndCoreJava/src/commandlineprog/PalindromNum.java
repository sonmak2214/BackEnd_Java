package commandlineprog;
//The number we read from any direction after we got same result as number that 
//number we can say its palindrom number..
//121,232,141,515 etc..
public class PalindromNum 
{

	public static void main(String[] args) 
	{
		int no1=Integer.parseInt(args[0]);
		int rem,temp,rev;
		temp=no1;
		rev=0;
		
		while(temp!=0)   //121!=0,12!=0,1!=0,0!=0
		{
			rem=temp%10;// 121%10=1, 12%10=2,1%1=1,
			rev=rev*10+rem; //0*10+1,1*10+2,12+1,
			temp=temp/10; //121/10=12,12/10=1,1/10=0
		}
		if(no1==rev) //0==0
		{
			System.out.println("Number Is Palindrom number:");
		}
		else
		{
			System.out.println("Number Is Not Palindrom Number:");
		}

	}

}
