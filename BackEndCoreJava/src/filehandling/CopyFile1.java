package filehandling;
import java.io.*;
public class CopyFile1 
{
 public static void main(String[] args) throws IOException 
 {
	FileInputStream fin=new FileInputStream("C:\\Users\\Admin\\Desktop\\cpy1.txt");
	FileOutputStream fout=new FileOutputStream("C:\\Users\\Admin\\Desktop\\cpy2.txt");
		int n;
		
		while((n=fin.read())!=-1)
		{
			fout.write(n);
		}
		System.out.println("File Copied Succesfully....");
		fin.close();
		fout.close();
	}

}
