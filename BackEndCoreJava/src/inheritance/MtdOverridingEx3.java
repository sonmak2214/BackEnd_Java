package inheritance;
class Employee1
{
	int eno;
	float BS,HRA,TA,DA,PF,GS;
	
	public Employee1(int empno,float BS)
	{
		eno=empno;
		this.BS=BS;
	}
	
	public void calculation()
	{
		HRA=BS*0.4f; //HRA=BS*40/100;
		TA=BS*0.3f; //TA=BS*30/100;
		DA=BS*0.2f;//DA=BS*20/100;
		PF=BS*0.1f;//PF=BS*10/100;
		GS=BS+HRA+TA+DA-PF;
		
	}
	public void display()
	{
		System.out.println("Employee Number:="+eno);
		System.out.println("Employee Basic Salary BS:="+BS);
		System.out.println("House rent allowance HRA:="+HRA);
		System.out.println("Travel allowance TA:="+TA);
		System.out.println("Dearness allowance DA:="+DA);
		System.out.println("Providence Fund PF:="+PF);
		System.out.println("Employee Gross Salary:="+GS);
	}
	
}
class Manager1 extends Employee1
{
  int mallow;
	public Manager1(int empno, float BS,int mallow) 
	{
		super(empno, BS);
		this.mallow=mallow;
	}
	public void calculation()
	{
		super.calculation();
	}
	public void display()
	{
		super.display();
		System.out.println("Manager Allowance Is:="+mallow);
	}
	
}
public class MtdOverridingEx3
{

	public static void main(String[] args) 
	{
		Manager1 m1=new Manager1(1022,50000.00f,45000);
		m1.calculation();
		m1.display();

	}

}
