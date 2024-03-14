package scannerProg;

import java.util.Scanner;

public class ScannerClsObj 
{
   int rlno;
   String name;
   char gr;
   
   Scanner sc=new Scanner(System.in);
   
   public void input()
   {
	   System.out.println("Enter Student Roll Number:=");
	   rlno=sc.nextInt();
	   System.out.println("Enter name of the student:=");
	   name=sc.next();
	   System.out.println("Enter Student Grade:=");
	   gr=sc.next().charAt(0);
   }
   
   public void display()
   {
	   System.out.println("Student Rollno:="+rlno);
	   System.out.println("Student Name:="+name);
	   System.out.println("Student Grade:="+gr);
   }
   
	public static void main(String[] args) 
	{
		ScannerClsObj  s1=new ScannerClsObj(); 	
         s1.input();
         s1.display();
	}

}
