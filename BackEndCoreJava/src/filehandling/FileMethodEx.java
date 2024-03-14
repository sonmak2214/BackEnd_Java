package filehandling;
import java.io.*;
public class FileMethodEx
{

	public static void main(String[] args) 
	{
		File f1=new File("C:\\Users\\Admin\\Desktop\\FilMtd.txt");
		
		if(f1.exists())
		{
		System.out.println("File Size:="+f1.length());
		System.out.println("File Path Is:="+f1.getPath());
		System.out.println("File Absolute Path:="+f1.getAbsolutePath());
		System.out.println("File Is Readable Or Not:="+f1.canRead());
		System.out.println("File Is Writable Or Not:="+f1.canWrite());
		System.out.println("File Name Is:="+f1.getName());
		System.out.println("File Executable Or Not:="+f1.canExecute());
		}
		else
		{
			System.out.println("File Not Exist Here:=");
		}
	}
}
