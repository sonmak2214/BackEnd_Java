package inheritance;
  class Student2 
{
	 	public void show()//
	{
		System.out.println("Its student class here:");
	}
}
class Teacher1 extends Student2 
{
	public void show() 
	{
	  System.out.println("Its teacher cls here");	
	}
}
public class Exfinalcls 
{ 
  	int a=100;//its final means const value
	
	public void display()
	{
		a=200;//cant reinnitializa cause its final variable not able to change the value
	}

	public static void main(String[] args) 
	{
		

	}

}
