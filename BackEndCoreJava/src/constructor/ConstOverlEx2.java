package constructor;

public class ConstOverlEx2 
{
	int rlno;
	String name;
	float per;
	
	public ConstOverlEx2()
	{
		System.out.println("Core java constructor");
	}
	
	public ConstOverlEx2(int rlno,String nm1,float per)
	{
	  	this.rlno=rlno;
	  	name=nm1;
	  	this.per=per;
	}
	
	public ConstOverlEx2(float per,String nm1)
	{
		this.per=per;
		name=nm1;
	}
	
	public void display()
	{
		System.out.println("Student rolno:="+rlno);
		System.out.println("Student Name:="+name);
		System.out.println("Student Percentage:="+per);
	}
    public static void main(String[] args) 
	{
    	ConstOverlEx2  c1=new ConstOverlEx2();
    	ConstOverlEx2 c2=new ConstOverlEx2(111,"Sayali",77.88f);
    	c2.display();
    	ConstOverlEx2 c3=new ConstOverlEx2(85.33f,"Shradhha");
    	c3.display();

	}

}
