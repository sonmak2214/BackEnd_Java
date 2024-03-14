package guiAWT;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class MouseFrameEx extends Frame implements MouseListener
{
   int x,y;
	 public MouseFrameEx()
	 {
		 super("MouseFrame");
		 addMouseListener(this);
		 setBackground(Color.ORANGE);
		 setSize(500,400);
		 setVisible(true);
	 }
	@Override
	public void mouseClicked(MouseEvent e) 
	{
		x=e.getX();
		y=e.getY();
		repaint(); //call the paint method
	}
	
	public void paint(Graphics g)
	{
		String s1="x:="+x+ "y:=" +y;
		g.drawString(s1, x, y);
		
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		
		
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		
		
	}
	public static void main(String[] args) 
	{
		MouseFrameEx mm=new MouseFrameEx();

	}

}
