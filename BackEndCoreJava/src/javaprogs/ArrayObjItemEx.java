package javaprogs;

public class ArrayObjItemEx 
{
   int itm_id;
   int itm_no;
   String name;
   
   public ArrayObjItemEx(int itm_id,int ino,String nm)
   {
     this.itm_id=itm_id;
      itm_no=ino;
      name=nm;
   }
   
   public void show()
   {
	   System.out.println("Item Id:"+itm_id);
	   System.out.println("Items Numbers:"+itm_no);
	   System.out.println("Item Name:"+name);
   }
   
	public static void main(String[] args) 
	{
		ArrayObjItemEx a1[]=new ArrayObjItemEx[5];//create instance of the class
		
		ArrayObjItemEx  a=new ArrayObjItemEx(1,101,"Laptop"); //then create obj of class here
		a.show();
		
		ArrayObjItemEx  a11=new ArrayObjItemEx(2,102,"Tab"); 
		a11.show();
		
		ArrayObjItemEx  a12=new ArrayObjItemEx(3,103,"Computer"); 
		a12.show();
		
		ArrayObjItemEx  a13=new ArrayObjItemEx(4,104,"LED"); 
		a13.show();
		
		ArrayObjItemEx  a14=new ArrayObjItemEx(4,105,"AC"); 
		a14.show();

	}

}
