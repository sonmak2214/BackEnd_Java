package inheritance;
class ElecDevice //super class--parent clss
{
	public void display()
	{
		System.out.println("This Is Electronic Devic Class Here:");
	}
}
class Computer extends ElecDevice //child cls
{
	public void show()
	{
		System.out.println("This Is Comp Elect Device:");
	}
}
class Laptop extends ElecDevice  //child class
{
	public void output()
	{
		System.out.println("This Is Laptop Elec Device:");
	}
}
class Tab extends ElecDevice
{
	public void view()
	{
		System.out.println("This Is Tab Elec Device:");
	}
}
public class HierachInhe 
{

	public static void main(String[] args) 
	{
		Computer c1=new Computer();
		c1.display();
		c1.show();
		Laptop l1=new Laptop();
		l1.display();
		l1.output();
		Tab t1=new Tab();
		t1.display();
		t1.view();

	}

}
