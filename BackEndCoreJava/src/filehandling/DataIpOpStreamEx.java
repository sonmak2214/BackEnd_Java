package filehandling;
import java.io.*;
public class DataIpOpStreamEx
{
	public static void main(String[] args) throws IOException
	{
		FileOutputStream fout=new FileOutputStream("C:\\Users\\Admin\\Desktop\\Dataio.txt");
		DataOutputStream dout=new DataOutputStream(fout);
		dout.writeInt(002211);
		dout.writeFloat(10220.0f);
		dout.writeUTF("Hello World");
		
		dout.close();
		fout.close();
		
		FileInputStream fin=new FileInputStream("C:\\Users\\Admin\\Desktop\\Dataio.txt");
		DataInputStream din=new DataInputStream(fin);
		int n1=din.readInt();
		float p1=din.readFloat();
		String s1=din.readUTF();
		
		System.out.println(n1+"\n"+p1+"\n"+s1);
         din.close();
         fin.close();	
	}
}
