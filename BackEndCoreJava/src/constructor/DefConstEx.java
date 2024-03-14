package constructor;

public class DefConstEx 
{
	int rlno;  //declairation part
	String name;
	
	public DefConstEx()
	{
		rlno=1;//initialization part
		name="Technolearn Training";
	}
	
	public void display()
	{
		System.out.println("Roll Number:="+rlno);
		System.out.println("Name:="+name);
	}

	public static void main(String[] args) 
	{
		DefConstEx  d1=new DefConstEx();//constructor call now automatically 
         d1.display();
	}

}
