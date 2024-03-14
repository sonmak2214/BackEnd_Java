package filehandling;
import java.io.*;
public class LinesCountFile
{

	public static void main(String[] args) throws IOException
	{
		File f1=new File("C:\\Users\\Admin\\Desktop\\FileCount.txt");
		if(f1.exists())
		{
		 FileReader fr=new FileReader(f1);	
		 BufferedReader br=new BufferedReader(fr);
		 int count=0;//garbage value arent enter in the variable here..
		 String s1;
		 while((s1=br.readLine())!=null)
		 {
			 count++;//count=count+1;
			 System.out.println(count+"::"+s1);
		 }
		 fr.close();
		 br.close();
		}
		else
		{
			System.out.println("File Is Not Exist Here....");
		}

	}

}
