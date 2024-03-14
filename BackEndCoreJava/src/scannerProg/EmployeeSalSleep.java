package scannerProg;

import java.util.Scanner;

public class EmployeeSalSleep 
{
  int empno,bs;
  float hra,ta,da,pf,gs;
  
    Scanner sc=new Scanner(System.in);
    
    public void input()
    {
    	System.out.println("Enter Employee Number:-");
    	empno=sc.nextInt();
    	System.out.println("Enter Basic Salary:-");
    	bs=sc.nextInt();
    }
    
    public void find()
    {
    	hra=bs*0.5f;   //hra=50/100;
    	ta=bs*0.4f;    //ta=40/100;
    	da=bs*0.3f;  //da=30/100;
    	pf=bs*0.2f; //pf=20/100;
    	gs=bs+hra+ta+da-pf;
    }
    public void output()
    {
    	System.out.println("Employee Number:="+empno);
    	System.out.println("Employee Basic Salary:="+bs);
    	System.out.println("Employee HRA:="+hra);
    	System.out.println("Employee TA:="+ta);
    	System.out.println("Employee DA:="+da);
    	System.out.println("Employee PF:="+pf);
    	System.out.println("Employee Gross Salary:="+gs);
    }
  
	public static void main(String[] args) 
	{
		 EmployeeSalSleep  e1=new  EmployeeSalSleep();
		 e1.input();
		 e1.find();
		 e1.output();

	}

}
