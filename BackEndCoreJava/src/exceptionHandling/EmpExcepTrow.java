package exceptionHandling;
class AgeException extends Exception
{
	public void age()
	{
		System.out.println("This Is Invalid Age:");
	}
}
public class EmpExcepTrow 
{
  int empno,age;
  
  public EmpExcepTrow()
  {
	 
  }
  public EmpExcepTrow(int empno,int a)
  {
	  this.empno=empno;
	  age=a;
  }
  
  public void display()
  {
	   try
	  {
		  if(age<=18 || age>=80)
		  {
			 throw new AgeException();
		  }
		  else
		  {
			  System.out.println("Valid Age:");
		  }
		  System.out.println("Employee Number Is:="+empno+"\nEmployee Age:"+age);
	  }
	  catch(AgeException a)
	  {
		  a.age();
	  }
	   System.out.println("After Try Catch Throw Block..");
  }
  
	public static void main(String[] args) 
	{
		EmpExcepTrow  e1=new EmpExcepTrow(1025,85); 
		e1.display();

	}

}
