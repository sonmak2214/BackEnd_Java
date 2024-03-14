package javaprogs;

public class ArrayCmndlineEx 
{

	public static void main(String[] args)//string array args
	{
		int a[]=new int[args.length];
		int sum=0;//garbage value arent enter in the variable.
		
		for(int i=0;i<a.length;i++)// 8 9 6 4 3 2--put by user on console
		{
			a[i]=Integer.parseInt(args[i]);//because we convert the string arr args in to integer
			sum=sum+a[i];//0+8=8
			            //8+9=17
			           //17+6=23
			          //23+4=27
			         //27+3=30
			        //30+2=32
		}
		System.out.println("Array Elements sum:="+sum);

	}

}
