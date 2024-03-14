package inheritance;
class Employee
{
	int empno;
	float bs,hra,da,ta,pf,gs;
	
	public Employee(int empno,float bs)
	{
		this.empno=empno;
		this.bs=bs;
	}
	public void cal()
	{
		hra=bs*0.4f;
		da=bs*0.3f;
		ta=bs*0.2f;
		pf=bs*0.1f;
		gs=bs+hra+da+ta-pf;
	}
	
	public void display()
	{
		System.out.println("Employee Number:="+empno);
		System.out.println("Basic Salary:="+bs);
		System.out.println("HRA:="+hra);
		System.out.println("DA:="+da);
		System.out.println("TA:="+ta);
		System.out.println("PF:="+pf);
		System.out.println("Gross Salary:="+gs);
	}
}
class Manager extends Employee
{
  int manallow;
	public Manager(int empno, float bs,int allow) 
	{
		super(empno, bs);
		manallow=allow;
	}
	public void cal()
	{
		super.cal();
	}
	public void display()
	{
		super.display();
		System.out.println("Manager Allowance:="+manallow);
	}
	
}
public class MrdOveerEx2
{

	public static void main(String[] args)
	{
		Manager  m1=new Manager(1024,40000.0f,35000);
		m1.cal();
		m1.display();
		

	}

}
