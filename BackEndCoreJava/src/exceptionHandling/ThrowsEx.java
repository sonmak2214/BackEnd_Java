package exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsEx 
{

	public static void main(String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter The String:");
	 String s1=br.readLine();
	 System.out.println(s1);
	}

}
