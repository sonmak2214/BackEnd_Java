package constructor;
//This Keyword is used in parameterized constructor it return/reffer currunt object 
//in currunt memory
public class ParamConstEx1 
{
   int rlno;
   String name;
   
   public ParamConstEx1(int rlno,String nm)//parameter or argument
   {
	   this.rlno=rlno;
	   name=nm;
   }
   public void display()
   {
	   System.out.println("Roll Number:="+rlno);
	   System.out.println("Name:="+name);
   }
	public static void main(String[] args) 
	{
		ParamConstEx1  p1=new ParamConstEx1(111,"Sonal"); 
		 p1.display();
		 ParamConstEx1  p2=new ParamConstEx1(112,"Komal"); 
		 p2.display();
		 ParamConstEx1  p3=new ParamConstEx1(113,"Goldal"); 
		 p3.display();

	}

}
