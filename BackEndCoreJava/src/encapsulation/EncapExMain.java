package encapsulation;

public class EncapExMain 
{

	public static void main(String[] args) 
	{
		EncapEx2 e1=new EncapEx2();
		e1.setMrks(70);
		System.out.println(e1.getMrks());
		e1.setAge(20);
		System.out.print(e1.getAge());
		e1.setAdd("Pune");
		System.out.println(e1.getAdd());
	}

}
