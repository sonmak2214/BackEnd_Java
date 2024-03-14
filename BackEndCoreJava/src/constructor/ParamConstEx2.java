package constructor;

public class ParamConstEx2
{
   int rlno;
   String add;
   char gr;
   
   public ParamConstEx2(int rlno,String addrs,char gr)
   {
	   this.rlno=rlno;
	   add=addrs;
	   this.gr=gr;
	   
	   System.out.println("Roll Number:="+rlno+"\nAddress:="+add+"\nGrade:="+gr);
   }
   
	public static void main(String[] args) 
	{
		ParamConstEx2 p1=new ParamConstEx2(111,"pune",'A');
		ParamConstEx2 p2=new ParamConstEx2(115,"mumbai",'B');
		

	}

}
