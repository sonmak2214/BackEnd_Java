package exceptionHandling;

public class DateMonthExcep 
{
  int dd,mm,yy;
  
  public DateMonthExcep()
  {
   System.out.println("This Is Date Month Year Exception Class Constructor");
  }
  
  public DateMonthExcep(int dd,int mm,int yy)
  {
	  this.dd=dd;
	  this.mm=mm;
	  this.yy=yy;
  }
  
  public void view()
  {
	  try
	  {
		  if(dd<1||dd>31||mm<1||mm>12)
		  {
			  throw new DateException();
		  }
		  else
		  {
			  System.out.println("Valid Date:");
		  }
		  System.out.println("Todays Date Is:="+dd+"/"+mm+"/"+yy);
	  }
	  catch(DateException d)
	  {
		  d.date();
	  }
  }
  
  
	public static void main(String[] args) 
	{
		DateMonthExcep d1=new DateMonthExcep();
		DateMonthExcep  dd=new DateMonthExcep(34,45,2023); 
		dd.view();

	}

}
