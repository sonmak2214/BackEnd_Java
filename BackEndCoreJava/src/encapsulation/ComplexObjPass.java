package encapsulation;
//Complex contain two number one is real number and anothe one is imagenary number
//real num means whole num--0 to 9,img num means fractional num ---0.5,0.11 etc
public class ComplexObjPass
{
   int real,img;
   
   public ComplexObjPass()//default const
   {
	   System.out.println("This is complex number example here");
   }
   public ComplexObjPass(int real,int img)//param const
   {
	   this.real=real;
	   this.img=img;
   }
   
   
      @Override
     public String toString() 
      {
	  return "ComplexObjPass [real=" + real + ", img=" + img + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
      }
      
    public ComplexObjPass add(ComplexObjPass c2)
   {
	   ComplexObjPass c3=new ComplexObjPass();
	   c3.real=this.real+c2.real;
	   c3.img=this.img+c2.img;
	   
	   if(c3.real>=9)
	   {
		   c3.real++;
		   c3.img=-10;//0.5,0.001f;
	   }
	   return c3;
	
  }
   
	public static void main(String[] args) 
	{
		ComplexObjPass c1=new ComplexObjPass();
		ComplexObjPass c2=new ComplexObjPass(10,20);
		ComplexObjPass c3=new ComplexObjPass(20,30);
		System.out.println(c3.add(c2));
		

	}

}
