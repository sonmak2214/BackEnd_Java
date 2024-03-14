package networking;
import java.net.*;
import java.io.*;
public class SocketServerEx 
{  public static void main(String[] args) 
	{
		ServerSocket s1;
		try 
		{
			s1 = new ServerSocket(8184);
			Socket s=s1.accept();
			DataInputStream dobj=new DataInputStream(s.getInputStream());
			String str=dobj.readUTF();
			System.out.println(str);
			dobj.close();
			s.close();
			s1.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
