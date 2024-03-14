package filehandling;
import java.io.*;
public class FileCopyUpperEx 
{
  public static void main(String[] args) throws IOException 
  {
  File f1=new File("C:\\Users\\Admin\\Desktop\\file2.txt");
  if(f1.exists())
  {
	FileInputStream fin=new FileInputStream(f1);//read operation
	FileOutputStream fout=new FileOutputStream("C:\\Users\\Admin\\Desktop\\file3.txt");
			byte b[]=new byte[fin.available()];
			fin.read(b);
			
			String s1=new String(b);
		    s1=s1.toUpperCase();
		    b=s1.getBytes();
		    fout.write(b);
		    System.out.println("File Copied Succesfully");
		    fin.close();
		    fout.close();
		}
		else
		{
			System.out.println("File Not Exist");
		}

	}

}
