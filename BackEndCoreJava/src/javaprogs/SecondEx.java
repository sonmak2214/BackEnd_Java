package javaprogs;

public class SecondEx  //compiletime block
{
	public void show()
	{
		System.out.println("Technolearn Training:");
	}

	public static void main(String[] args) //runtime block
	{
		SecondEx ss=new SecondEx();
		ss.show();
        System.out.println("TechnoWorld Software:");		

	}

}
