package constructor;

public class ParaConstEx3 //compile time block
{
  int rlno;
  String name;
  float per;
  
  public ParaConstEx3(int rlno,String nm,float pr)
  { 
	  this.rlno=rlno;
	  name=nm;
	  per=pr;
 }
  
	public static void main(String[] args) //run time block
	{
	ParaConstEx3 p1=new ParaConstEx3(10,"Ashwini",89.22f); 
	System.out.println("Roll Number:"+p1.rlno+"\nName:"+p1.name+"\nPercentage:"+p1.per);
	}

}
