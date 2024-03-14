package javaprogs;

import java.util.Scanner;

public class ArrayObjEx
{
   int emp_id;
   String name;
   
   Scanner sc=new Scanner(System.in);
   
   public void accept()
   {
	   System.out.println("Enter the employee Id:=");
	   emp_id=sc.nextInt();
	   System.out.println("Enter the employee Name:=");
	   name=sc.next();
  }
   public void display()
   {
	   System.out.println("Employee Id:="+emp_id);
	   System.out.println("Employee Name:="+name);
   }
	public static void main(String[] args) 
	{
		ArrayObjEx arr[]=new ArrayObjEx[5];//create array of instance
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new ArrayObjEx();
			arr[i].accept();
		}
		for(int i=0;i<arr.length;i++)
		{
			arr[i].display();
		}

	}

}
