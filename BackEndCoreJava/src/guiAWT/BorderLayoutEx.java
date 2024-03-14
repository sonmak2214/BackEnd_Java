package guiAWT;
import java.awt.*;
public class BorderLayoutEx extends Frame
{
	Button b1,b2,b3,b4;
	TextArea ta;
	Panel p1;
	BorderLayout b;
	
	public BorderLayoutEx()
	{
		super("Border Layout");
		p1=new Panel();
		b=new BorderLayout();
		p1.setLayout(b);
		b1=new Button("North");
		b2=new Button("South");
		b3=new Button("East");
		b4=new Button("West");
		ta=new TextArea(5,6);
		add(p1);
		p1.add("North", b1);
		p1.add("South",b2);
		p1.add("East", b3);
		p1.add("West", b4);
		p1.add("Center",ta);
		setBackground(Color.RED);
		setSize(500,400);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		BorderLayoutEx bb=new BorderLayoutEx();
	}
}
