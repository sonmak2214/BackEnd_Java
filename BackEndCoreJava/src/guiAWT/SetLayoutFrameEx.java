package guiAWT;
import java.awt.*;
public class SetLayoutFrameEx extends Frame
{
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;
	
	public SetLayoutFrameEx()
	{
		super("SelBounds Frame");
		setLayout(null);
		l1=new Label("Enter Username");
		l2=new Label("Enter Password");
		t1=new TextField(25);
		t2=new TextField(25);
		b1=new Button("Login");
		b2=new Button("Cancel");
		l1.setBounds(10,500,40,40);
		t1.setBounds(10,40,120,40);
		l2.setBounds(90,150,120,130);
		t2.setBounds(170,150,130,30);
		b1.setBounds(110,204,40,30);
		b2.setBounds(190,20,190,130);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		setBackground(Color.CYAN);
		setSize(400,400);
		setVisible(true);			
	}

	public static void main(String[] args) 
	{
		SetLayoutFrameEx ss=new SetLayoutFrameEx();
	}
}
