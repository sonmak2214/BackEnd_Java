package networking;
import java.net.*;
import java.io.*;
public class ClientDataop1 
{
	public static void main(String[] args) throws UnknownHostException, IOException 
	{
		Socket s=new Socket("localhost",5009);
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			String s1=br.readLine();
			dout.writeUTF(s1);
			System.out.println("Connected here....");
			if(s1.equalsIgnoreCase("exit"))
				break;
		}
		br.close();
		dout.close();
		s.close();
	}

}
