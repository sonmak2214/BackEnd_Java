package filehandling;
import java.io.*;
public class FileInputStreamRead 
{
 public static void main(String[] args) throws IOException
 {
	FileInputStream fin=new FileInputStream("C:\\Users\\Admin\\Desktop\\fread.txt");
	//int j=fin.read();	
	//System.out.println(j);
    int i;
    while((i=fin.read())!=-1)
    {
    	System.out.print((char)i);
    }
	}

}
