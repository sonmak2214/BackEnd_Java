package inheritance;
class Person
{
	int pno;
	String pname;
	
	public Person(int pno,String pname)
	{
		this.pno=pno;
		this.pname=pname;
	}
	public void output()
	{
		System.out.println("Person Number:="+pno);
		System.out.println("Person Name:="+pname);
	}
	
}
class Student1 extends Person
{
  float per;
	public Student1(int pno, String pname,float per)
	{
		super(pno, pname);
	     this.per=per;	
	
	}
	public void output()
	{
		super.output();
		System.out.println("Student Percentage:="+per);
	}
	
}

public class EmployeeMtdOverld extends Student1
{
  int esal;
	public EmployeeMtdOverld(int pno, String pname,float per,int esal) 
	{
		super(pno, pname,per);
		this.esal=esal;
	}
	public void output()
	{
		super.output();
		System.out.println("Employee Salary:="+esal);
	}
    public static void main(String[] args) 
	{
    	EmployeeMtdOverld e1=new EmployeeMtdOverld(2200,"Omkar",82.33f,80000);
         e1.output();
	}

}
