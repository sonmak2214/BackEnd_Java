package networking;
import java.net.*;
public class URLEx 
{
	public static void main(String[] args)
	{
		try 
		{
			URL url=new URL("https://www.facebook.com/technolearntraining/signup");
			System.out.println("Protocol:="+url.getProtocol());
			System.out.println("Host Name:="+url.getHost());
			System.out.println("Port Number:="+url.getPort());
			System.out.println("File Name:="+url.getFile());
			System.out.println("User Information:="+url.getUserInfo());
		}
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		}

	}

}
