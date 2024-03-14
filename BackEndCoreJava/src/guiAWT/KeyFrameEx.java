package guiAWT;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class KeyFrameEx extends Frame implements KeyListener
{
	String s1;
	public  KeyFrameEx()
	{
		super("KeyFrame");
		s1=" ";
		requestFocus();
		addKeyListener(this);
		setBackground(Color.BLUE);
		setSize(500,500);
		setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) 
	{
		s1=s1+e.getKeyChar();
		System.out.println(s1);
		repaint(); //calling the paint method
	}
	public void paint(Graphics g)
	{
		g.drawString(s1,5,5);
	}
	
	@Override
	public void keyPressed(KeyEvent e) 
	{
		
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		
		
	}

	public static void main(String[] args)
	{
		 KeyFrameEx kk=new  KeyFrameEx();

	}

}
