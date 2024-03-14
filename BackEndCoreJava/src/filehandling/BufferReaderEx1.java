package filehandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderEx1
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter The Roll Number Here:");
	int rlno=Integer.parseInt(br.readLine());
	System.out.println("Enter The Name Here:");
	String name=br.readLine();
	System.out.println("Roll Number:="+rlno);
	System.out.println("Name:="+name);
	}
} 
