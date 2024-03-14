package commandlineprog;
//After finding the Number sum of digit of cube got the same number that num we
//can say armstrong num..
//153--Armstrong num..
//1*1*1+5*5*5+3*3*3
//1+125+27
//28+125=153---->Armstrong number

public class ArmstrongNum 
{

	public static void main(String[] args) 
	{
		int num1=Integer.parseInt(args[0]);
		int cube,rem,temp,sum;
		temp=num1;sum=0;
		
		while(temp!=0)  //153!0,15!=0,1,0!=0
		{
			rem=temp%10;   //153%10=3, 15%10=5,1%1=1,
			cube=rem*rem*rem;//3*3*3=27,5*5*5=125,1*1*1=1
			sum=sum+cube;//0+27,125+27,1,=125+27+1=153  
			temp=temp/10;//153/10=15,15/10=1,1/10=0
		}
		if(num1==sum)
		{
			System.out.println("Number Is Armstrong Number:");
		}
		else
		{
			System.out.println("Number Is Not Armstrong Number:");
		}

	}

}
