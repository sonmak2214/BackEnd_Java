package networking;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
public class SocketClientEx
{
	public static void main(String[] args) 
  { 
		try
	 {
	    Socket	s = new Socket("Localhost",8184);
		DataOutputStream sobj=new DataOutputStream(s.getOutputStream());
		sobj.writeUTF("Advanced Java");
		sobj.flush();
		sobj.close();
		s.close();
	 }	
	  catch (Exception e)
	 {
	  e.printStackTrace();
	 }
		
	}
}

