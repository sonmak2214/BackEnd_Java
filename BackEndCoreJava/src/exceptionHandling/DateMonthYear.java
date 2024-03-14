 package exceptionHandling;
class DateException1 extends Exception
{
	public void date()
	{
		System.out.println("Invalid Date:");
	}
}
class MonthException1 extends Exception
{
	public void month()
	{
		System.out.println("Invalid Month:");
	}
}
public class DateMonthYear
{
   int dd,mm,yy;
   
   public DateMonthYear()
   {
	System.out.println("This Is Date Month Year Exception Class Here");   
   }
   public DateMonthYear(int dd,int mm,int yy)
   {
	   this.dd=dd;
	   this.mm=mm;
	   this.yy=yy;
   }
   
   public void display()
   {
	   try
	   {
		   if(dd<1 ||dd>31 ||mm<1 ||mm>12)
		   {
			   throw new DateException1();
		   }
		   else
		   {
			   System.out.println("Valid Date:");
		   }
		   System.out.println("Todays Date:="+dd+"/"+mm+"/"+yy);
	   }
	   catch(DateException1 d)
	   {
		   d.date();
	   }
   }
	public static void main(String[] args) 
	{
		 DateMonthYear d1=new  DateMonthYear();
		 DateMonthYear d2=new DateMonthYear(7,10,2023);
		 d2.display();

	}

}
