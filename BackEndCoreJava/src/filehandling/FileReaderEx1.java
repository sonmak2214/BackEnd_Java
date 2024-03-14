package filehandling;
import java.io.*;
public class FileReaderEx1 
{

	public static void main(String[] args) throws IOException
	{
		FileReader fr=new FileReader("C:\\Users\\Admin\\Desktop\\flrd1.txt");
		int i=fr.read();
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println("File Reading Succesfully....");
		fr.close();

	}

}
