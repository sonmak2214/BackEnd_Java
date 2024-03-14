package guiAWT;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class WindowAnnonumusInnerFrame extends Frame //outer class here
{
   public WindowAnnonumusInnerFrame() //constructor
   {
	   super("Annonumus Frame");
	   addWindowListener(new WindowAdapter() ////inner adapter class
	   {
		   public void windowClosing(WindowEvent e) //inner method
		   {
			  System.exit(0); 
		   }
	   });
	   setBackground(Color.cyan);
	   setSize(400,400);
	   setVisible(true);
   }
	public static void main(String[] args) 
	{
		WindowAnnonumusInnerFrame w1=new WindowAnnonumusInnerFrame();

	}

}
