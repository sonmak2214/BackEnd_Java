package filehandling;
import java.io.*;
public class FilewriterEx1 
{
   public void writeMtd()
   {
	   try 
	   {
		FileWriter fw=new FileWriter("C:\\Users\\Admin\\Desktop\\filewr1.txt");
		fw.write("Advanced");
		fw.write("Java");
		fw.write("@#$%#@");
		fw.append("Programming");
		System.out.println("Writting Succesfully ....");
		fw.close();
	   } 
	   catch (IOException e)
	   {
		 e.printStackTrace();
	   }
   }
	public static void main(String[] args) 
	{
		FilewriterEx1  ff=new FilewriterEx1();
		ff.writeMtd();
	}

}
