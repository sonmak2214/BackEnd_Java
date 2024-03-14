package filehandling;
import java.io.*;
public class FileOutputStreamWrite 
{
	public static void main(String[] args) throws IOException 
	{
      FileOutputStream fout=new FileOutputStream("C:\\Users\\Admin\\Desktop\\fout.txt");
      //fout.write(97);
      //System.out.println(fout);
      String s1="Technolearn Training Institute";
      byte b[]=s1.getBytes();
      fout.write(b);
      System.out.println(fout);
      System.out.println("Data Succesfully Write Inside The File:");
	}

}
//A to Z=65 to 90
//a to z=97 to 122