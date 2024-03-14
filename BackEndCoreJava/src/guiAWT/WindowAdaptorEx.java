package guiAWT;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class WindowAdaptorEx extends Frame
{
	public WindowAdaptorEx()
	{
		super("Adaptor Frame");
		addWindowListener(new CloserFrame());
		setBackground(Color.WHITE);
		setSize(500,500);
		setVisible(true);
	}
	class CloserFrame extends WindowAdapter
	{
	   	public void windowClosing(WindowEvent e)
	   	{
	   		System.exit(0);
	   	}
	}
	public static void main(String[] args) 
	{
		WindowAdaptorEx  w1=new WindowAdaptorEx(); 
	}
}
