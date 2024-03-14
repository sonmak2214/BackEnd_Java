package filehandling;
import java.io.*;
public class DeserializationEx implements Serializable
{

	public static void main(String[] args) throws IOException
	{
		Student s1=new Student();
		FileInputStream fin=new FileInputStream("C:\\Users\\Admin\\Desktop\\FilSerDes.txt");
		ObjectInputStream oin=new ObjectInputStream(fin);
		System.out.println(s1.rlno);
		System.out.println(s1.name);
		System.out.println(s1.sal);
		
		oin.close();
		fin.close();

	}

}
