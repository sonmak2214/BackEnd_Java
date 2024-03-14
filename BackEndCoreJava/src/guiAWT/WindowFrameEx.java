package guiAWT;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class WindowFrameEx extends Frame implements WindowListener
{
    public WindowFrameEx()
    {
    	super("WindowFrame");
    	addWindowListener(this);
    	setBackground(Color.CYAN);
    	setSize(400,400);
    	setVisible(true);
    }
	@Override
	public void windowOpened(WindowEvent e)
	{
		
		
	}

	@Override
	public void windowClosing(WindowEvent e) 
	{
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) 
	{
		
		
	}

	@Override
	public void windowIconified(WindowEvent e) 
	{
		
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) 
	{
		
		
	}

	@Override
	public void windowActivated(WindowEvent e) 
	{
		
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) 
	{
		
		
	}

	public static void main(String[] args)
	{
		WindowFrameEx w1=new WindowFrameEx();

	}

}
