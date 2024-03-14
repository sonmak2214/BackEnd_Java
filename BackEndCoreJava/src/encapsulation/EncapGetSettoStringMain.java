package encapsulation;

public class EncapGetSettoStringMain 
{

	public static void main(String[] args)
	{
		EncapGetSetTostringMtd  e=new EncapGetSetTostringMtd();
		
		//System.out.println(e.toString());
		
		e.setEmpno(1027);
		System.out.println(e.getEmpno());
		e.setEname("Sonal");
		System.out.println(e.getEname());
		e.setEsal(400000);
		System.out.println(e.getEsal());
		
		System.out.println(e.toString());
		

	}

}
