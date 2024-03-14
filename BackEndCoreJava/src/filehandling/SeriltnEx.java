package filehandling;
import java.io.*;

class Student implements Serializable
{
	int rlno=1;
	String name="Omkar";
	double sal=50000.00;
	
	@Override
	public String toString() 
	{
	return "Student [rlno=" + rlno + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
}
public class SeriltnEx 
{
	public static void main(String[] args) throws IOException 
	{
	Student ss=new Student();
	System.out.println(ss);
	FileOutputStream fout=new FileOutputStream("C:\\Users\\Admin\\Desktop\\FilSerDes.txt");
    ObjectOutputStream out=new ObjectOutputStream(fout);
    out.writeObject(ss);
    
    out.close();
    fout.close(); 
	}

}
