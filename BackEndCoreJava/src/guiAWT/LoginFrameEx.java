package guiAWT;
import java.awt.*;
public class LoginFrameEx 
{
   Label l1,l2;
   TextField t1,t2;
   Button b1,b2;
   Panel p1;
   Frame fr;
   
   public LoginFrameEx()
   {
	   fr=new Frame("Login Frame");
	   p1=new Panel();
	   l1=new Label("Enter Username");
	   t1=new TextField(15);
	   l2=new Label("Enter Password");
	   t2=new TextField(15);
	   b1=new Button("Login");
	   b2=new Button("Cancel");
	   fr.add(p1);
	   p1.add(l1);
	   p1.add(t1);
	   p1.add(l2);
	   p1.add(t2);
	   t2.setEchoChar('*');
	   p1.add(b1);
	   p1.add(b2);
	   fr.setBackground(Color.orange);
	   fr.setSize(400,400);
	   fr.setVisible(true);
	   
   }
	public static void main(String[] args) 
	{
		LoginFrameEx ll=new LoginFrameEx();

	}

}
