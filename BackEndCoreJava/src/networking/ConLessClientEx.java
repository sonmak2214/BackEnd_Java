package networking;
import java.io.*;
import java.net.*;
public class ConLessClientEx 
{	public static void main(String[] args) throws UnknownHostException, IOException 
	{
		Socket s=new Socket("localhost",3333);//constructor,parameter
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
		String str1=" ", str2=" ";//variable value read & write opertn performed
		while(!str1.equals("stop"))
		{
			str1=br.readLine();
			dout.writeUTF(str1);
			dout.flush();
			str2=din.readUTF();
			System.out.println("Server Says:"+str2);
		}
		br.close();
		dout.close();
		din.close();
		s.close();
	}

}
