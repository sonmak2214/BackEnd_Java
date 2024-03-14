package scannerProg;

import java.util.Scanner;

public class ConvertAttribute 
{
	int m;
	float cm,feet,inch;
	Scanner sc=new Scanner(System.in);
	
	public void show()
	{
		System.out.println("Enter Meter:");
		m=sc.nextInt();
	}
	public void calcltn()
	{
		cm=m*100;//100cm=1m
		feet=m*3.28f;//12 inch=1 feet
		inch=m*39.37f;
	}
	public void display()
	{
		System.out.println("Meter:="+m);
		System.out.println("Centimeter:="+cm);
		System.out.println("Feet:="+feet);
		System.out.println("Inch:="+inch);
	}

	public static void main(String[] args) 
	{
		ConvertAttribute  c1=new ConvertAttribute();
		c1.show();
		c1.calcltn();
		c1.display();

	}

}
