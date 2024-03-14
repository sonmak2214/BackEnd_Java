package exceptionHandling;
class AgeException1 extends Exception
{
	public void age()
	{
		System.out.println("Invalid Age:");
	}
}
public class EmployeeExcep 
{
   int empno,age;
   
   public  EmployeeExcep()
   {
	   
   }
   public EmployeeExcep(int empno,int age)
   {
	   this.empno=empno;
	   this.age=age;
   }
   
   public void display()
   {
	   try
	   {
		   if(age<18||age>80)
		   {
			   throw new AgeException1();
		   }
		   else
		   {
			   System.out.println("Valid Age:");
		   }
	   }
	   catch(AgeException1 a)
	   {
		   a.age();
	   }
   }
	public static void main(String[] args)
	{
		 EmployeeExcep ee=new  EmployeeExcep(1022,67); 
		 ee.display();
  }

}
