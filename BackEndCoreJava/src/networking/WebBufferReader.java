package networking;
import java.io.*;
import java.net.InetAddress;
public class WebBufferReader 
{
	public static void main(String[] args) 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Website Name Here:");
        
        try 
        {
			String s1=br.readLine();
			InetAddress i1=InetAddress.getByName("www.google.com");
			System.out.println("The Inet Address Is:"+i1);
		} 
        catch (IOException e)
        {
			e.printStackTrace();
		}
	}

}
