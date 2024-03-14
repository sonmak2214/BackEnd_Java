package abstraction;

import java.util.Scanner;

abstract class Shape
{
	float area;
	abstract public void display();//empty method--withot implementation--body not exist//Declaire
	
}
class Circle extends Shape
{
    float redius;
    
   public Circle(float r)
    {
      redius=r;	
    }
    
	@Override
	public void display()
	{
		
		area=3.14f*redius*redius;
		System.out.println("Area Of Circle is:="+area);
	}
	
}
class Rectangle extends Shape
{
  float length,bredth;
  
  public Rectangle(float length,float bredth)
  {
	  this.length=length;
	  this.bredth=bredth;
  }
	@Override
	public void display()
	{
		area=length*bredth;
		System.out.println("Area Of Rectangle is:"+area);
	}
	
}
public class ShapeAbstractEx 
{

	public static void main(String[] args) 
	{
		Shape s;//reference variable is created here
		
		System.out.println("1.Area Of Circle:-\n2.Area Of Rectangle ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice:-");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		
		case 1:s=new Circle(8.6f);
		         s.display();
		         break;
		         
		case 2:s=new Rectangle(5.4f,7.2f);
		          s.display();
		          break;
		          
	   default:System.out.println("Wrong Choice please Enter Right choice here");	          
		       
		}

	}

}
