package constructor;

public class DefConstEx2 
{
	int age;
	float mrks;
	char gr;
	
     DefConstEx2()
	{
		age=22;
		mrks=88;
		gr='A';
		
		System.out.println("Age Is:="+age);
		System.out.println("Marks Is:="+mrks+"\nGrade Is:="+gr);
		
	}
	

	public static void main(String[] args) 
	{
		DefConstEx2 d=new DefConstEx2();//automatically call when object is created here 

	}

}
