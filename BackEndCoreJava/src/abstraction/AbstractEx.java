package abstraction;

import java.util.Scanner;

abstract class Fruits //super class
{
	abstract public void show();//declaire--without body--emplty
	public void display()//non abstract mtd
	{
		System.out.println("This Is Abstract Fruit class:");
	}
}
class Apple extends Fruits
{

	@Override
	public void show()
	{
		System.out.println("This Is Apple Method of abstract cls here:");
		
	}
	
}
class Banana extends Fruits
{

	@Override
	public void show() 
	{
	 System.out.println("This Is Banana mtd of anstact class ");	
	}
	
}
class Pinapple extends Fruits
{

	@Override
	public void show() 
	{
		System.out.println("This Is Pinapple method of abstract class here:");
		
	}
	
}
public class AbstractEx 
{

	public static void main(String[] args)
	{
		
       Fruits fr;//reference variable
       System.out.println("1.Apple\n2.Banana\n.3Pinapple");
       
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the choice here:");
       int ch=sc.nextInt();
       
       switch(ch)
       {
       case 1:fr=new Apple();
              fr.show();
              fr.display();
              break;
              
       case 2:fr=new Banana();
             fr.show();
             fr.display();
             break;
             
       case 3:fr=new Pinapple();
              fr.show();
             fr.display();
             break;
             
    default:System.out.println("Wrong Choice Here:");
              
              
              
       }
	}

}
