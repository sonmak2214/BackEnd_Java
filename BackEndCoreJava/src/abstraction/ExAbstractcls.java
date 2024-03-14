package abstraction;

import java.util.Scanner;

abstract class Device
{
	    abstract public void show();//abstract method;--empty methd //declair only
	    public void display()//normal methodnon abstract method--define
	    {
	    	System.out.println("This Is Device class here:");
	    }
}
class PC extends Device
{

	@Override
	public void show()
	{
		System.out.println("This is Electronic Device PC Here:-");
		
	}
	
}
class Laptop extends Device
{

	@Override
	public void show() 
	{
	  System.out.println("This is Electronic Device Laptop here:");	
	}
	
}
class Tab extends Device
{

	@Override
	public void show()
	{
		System.out.println("This is Tab Electronic Device:");
		
	}
	
}
public class ExAbstractcls 
{

	public static void main(String[] args)
	{ 
		Device d;//reference variable cause it contain empty data   		
        
		System.out.println("1.Pc \n2.Laptop \n3.Tab  \n4.Default:");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Choice Here:-");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		
		case 1:d=new PC();
		       d.display();
		       d.show();
		       break;
		       
		case 2:d=new Laptop();
		       d.display();
		       d.show();
		       break;
		       
		case 3:d=new Tab(); 
		       d.display();
		       d.show();
		       break;
		       
		default:System.out.println("Invalid Choice Here:");       
		
		}
		
	}

}
