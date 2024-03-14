package javaprogs;
class Student
{
  int rlno=11;
  String snm="Sonal";
  char sgr='A';
  float per=77.99f;
  
  public void show()
  {
	  System.out.println("Student Roll Number Is:="+rlno);
	  System.out.println("Student Name Is:="+snm);
	  System.out.println("Student Grade Is:="+sgr);
	  System.out.println("Student Percentage Is:="+per);
  }
  
}
public class ExampleMultProg 
{

	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.show();

	}

}
