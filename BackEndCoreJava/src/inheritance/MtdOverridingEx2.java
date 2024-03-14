package inheritance;
class EmployeeEx
{
	int eid;
	float hra,da,ta,pf,bs,gs;
	
	public EmployeeEx(int eid,float bs)
	{
		this.eid=eid;
		this.bs=bs;
	}
	
	public void calc()
	{
		hra=bs*0.4f;
		da=bs*0.3f;
		ta=bs*0.2f;
		pf=bs*0.1f;
		gs=bs+hra+da+ta-pf;
	}
	
	public void display()
	{
		System.out.println("Employee Id:="+eid);
		System.out.println("Employee Basic Salary:="+bs);
		System.out.println("HRA:"+hra);
		System.out.println("DA:"+da);
		System.out.println("TA:"+ta);
		System.out.println("PF:"+pf);
		System.out.println("Gross Salary:"+gs);
	}
	
	
}
class ManagerEx extends EmployeeEx
{
  int mallow;
	public ManagerEx(int eid, float bs,int mallow)
	{
		super(eid, bs);
		this.mallow=mallow;
		
	}
	public void calc()
	{
		super.calc();
	}
	
	public void display()
	{
		super.display();
		System.out.println("Manager Allowance:="+mallow);
	}
	
}
public class MtdOverridingEx2 
{

	public static void main(String[] args)
	{
		ManagerEx m1=new ManagerEx(1011,45000.44f,50000);	
		m1.calc();
		m1.display();
	}

}
