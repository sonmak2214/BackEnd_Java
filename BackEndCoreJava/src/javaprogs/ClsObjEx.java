package javaprogs;

public class ClsObjEx //Compile-Time block
{
	int rlno=1; //Instance variable
	String name="Ashwini";
	float per=88.66f;
	char gr='A';
	
	
	public void output()
	{
		System.out.println("Roll number:"+rlno);
		System.out.println("Name:"+name);
		System.out.println("Percentage:"+per);
		System.out.println("Grade:"+gr);
	}

	public static void main(String[] args) //Runtime block
	{
		ClsObjEx c1=new ClsObjEx();//create memory for class data will stored here 
        c1.output();//data stored inside temporary memory--HEAP Memory
	}

}
