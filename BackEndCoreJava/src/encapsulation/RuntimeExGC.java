package encapsulation;

import java.util.Date;

public class RuntimeExGC 
{

	public static void main(String[] args) //runtime block
	{
		Runtime r=Runtime.getRuntime();
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		
		for(int i=1;i<=100;i++)
		{
			Date d=new Date();
			d=null;
		}
		System.out.println(r.totalMemory());
		r.gc();
		System.out.println(r.freeMemory());

	}

}
