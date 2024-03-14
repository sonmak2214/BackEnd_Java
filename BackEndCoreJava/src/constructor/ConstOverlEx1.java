package constructor;

public class ConstOverlEx1 
{
  int age;
  char gr;
  String add;
  long mob;
  
  ConstOverlEx1()
  {
	  System.out.println("This is default constructor:");
  }
  
  ConstOverlEx1(int age,char gr,String addrs,long mob1)
  {
	  this.age=age;
	  this.gr=gr;
	  add=addrs;
	  mob=mob1;
  }
  public void show()
  {
	  System.out.println("Age Of Student:="+age);
	  System.out.println("Grade Of Student:="+gr);
	  System.out.println("Address Of Student:="+add);
	  System.out.println("Mobile Number Of Student:="+mob);
  }
  
	public static void main(String[] args)
	{
		ConstOverlEx1  c=new ConstOverlEx1(); 
		ConstOverlEx1  c1=new ConstOverlEx1(23,'A',"Nashik",904567123); 
		c1.show();
	}

}
