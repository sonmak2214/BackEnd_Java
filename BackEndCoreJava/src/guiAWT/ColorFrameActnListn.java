package guiAWT;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ColorFrameActnListn extends Frame implements ActionListener
{
	Button b1,b2,b3;
	public ColorFrameActnListn()
	{
		super("ColorFrame");
		setLayout(new FlowLayout());
		b1=new Button("REd");
		b2=new Button("GREEN");
		b3=new Button("BLUE");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		add(b1);
		add(b2);
		add(b3);
		setSize(400,400);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
	 Object obj=e.getSource();
	 if(obj==b1)
	 {
		 setBackground(Color.RED);
	 }
	 else if(obj==b2)
	 {
		 setBackground(Color.GREEN);
	 }
	 else if(obj==b3)
	 {
		 setBackground(Color.BLUE);
	 }
	}
	public static void main(String[] args) 
	{
		ColorFrameActnListn cc=new ColorFrameActnListn();
	}

}
