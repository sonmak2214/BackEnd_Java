package networking;
import java.io.*;
import java.net.*;
public class ServerDataIpEx1 
{	public static void main(String[] args) throws IOException 
	{
		ServerSocket s=new ServerSocket(5009);
		Socket ss=s.accept();
		System.out.println("Connected Succesfully....");
		DataInputStream din=new DataInputStream(ss.getInputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
        	String str=din.readUTF();
        	System.out.println("Client Says:="+str);
        	if(str.equalsIgnoreCase(str))
        	break;	        		
      }
        
        br.close();
        din.close();
        ss.close();
        s.close();       
    }
 }


