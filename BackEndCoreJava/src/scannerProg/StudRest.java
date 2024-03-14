package scannerProg;

import java.util.Scanner;

public class StudRest 
{
	int rlno,phy,chem,math,tot;
	float per;

	Scanner sc=new Scanner(System.in);
	
	public void input()
	{
		System.out.println("Enter Student Rlno:");
		rlno=sc.nextInt();
		System.out.println("Enter Student Three Subject Marks:=");
		phy=sc.nextInt();
		chem=sc.nextInt();
		math=sc.nextInt();
	}
	public void calc()
	{
		tot=phy+chem+math;
		per=tot/3;
	}
	public void output()
	{
		System.out.println("Student Roll Number:="+rlno);
		System.out.println("Student Physics Marks:="+phy);
		System.out.println("Student Chemistry Marks:="+chem);
		System.out.println("Student Math Marks:="+math);
		System.out.println("Student Total Marks:="+tot);
		System.out.println("Student Percentage Marks:="+per);
	}
	public static void main(String[] args) 
	{
		StudRest  s1=new StudRest();
		s1.input();
		s1.calc();
		s1.output();

	}

}
