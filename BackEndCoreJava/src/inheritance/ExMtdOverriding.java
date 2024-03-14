package inheritance;
class StudentEx //superclass---old class
{
	public void show()
	{
		System.out.println("This Is Student Class Here:= ");
	}
}
class TeacherEx extends StudentEx //subclass--new class
{
	public void show()
	{
		super.show();//overriding perform with help of super keyword
		System.out.println("This Is Teacher Class Here:=");
	}
}
public class ExMtdOverriding 
{

	public static void main(String[] args) 
	{
		 TeacherEx t1=new  TeacherEx();
		 t1.show();

	}

}
