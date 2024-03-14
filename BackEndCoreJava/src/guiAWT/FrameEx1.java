package guiAWT;

import java.awt.Color;
import java.awt.Frame;

public class FrameEx1 
{
	Frame fr;
	
	public FrameEx1()
	{
		fr=new Frame("First Frame");
		fr.setBackground(Color.magenta);
		fr.setSize(400,400);
		fr.setVisible(true);
		fr.setName("First Frame");
	}
	
	public static void main(String[] args) 
	{
		FrameEx1  f1=new FrameEx1(); 
    }

}
