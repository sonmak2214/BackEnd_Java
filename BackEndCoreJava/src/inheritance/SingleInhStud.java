package inheritance;
class Student //its super class--base class
{
	public void show()
	{
		System.out.println("Its Briliant Student Here");
	}
}
class Teacher extends Student//its sub class--derived cls
{
	public void display()
	{
		System.out.println("Teacher Teach very nicely..");
	}
}
public class SingleInhStud 
{
	public static void main(String[] args) 
	{
		Teacher t1=new Teacher();
		t1.show();
		t1.display();

	}

}
