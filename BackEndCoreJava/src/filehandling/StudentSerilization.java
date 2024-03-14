package filehandling;
import java.io.*;

public class StudentSerilization implements Serializable
{
	 String name;
	 String add;
	 int rlno;
	 
	 public void display()
	 {
		 System.out.println("Roll Number:="+rlno);
			System.out.println("Name Of Student:="+name);
			System.out.println("Address Of Student:="+add);
	 }
	 
	public static void main(String[] args) throws IOException
	{
		StudentSerilization s1=new StudentSerilization();
		s1.name="Shradhha";
		s1.add="Pune";
		s1.rlno=10;	
		
	//Serialization--stored variable data in to object--stored
		FileOutputStream fout=new FileOutputStream("C:\\Users\\Admin\\Desktop\\serStud.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.close();
		System.out.println("Object Is Serialized And Saved In File..");
		
		//Desirialization--Restored--again object data deserializa--origenal form--data type
		
		FileInputStream fin=new FileInputStream("C:\\Users\\Admin\\Desktop\\serStud.txt");
		ObjectInputStream oin=new ObjectInputStream(fin);
		try 
		{
			s1=(StudentSerilization)oin.readObject();
		}
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}	
		System.out.println("Desirialization Of Object Stored in file");
		s1.display();
	}
	}


