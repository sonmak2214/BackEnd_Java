package guiAWT;
import java.awt.*;
public class FlowLayoutButnEx extends Frame
{
	Button b1,b2,b3;
	Panel p1;
	FlowLayout f;
	
	public FlowLayoutButnEx()
	{
		super("FlowLayoutFrame");
		f=new FlowLayout();
        p1.setLayout(f);
		p1=new Panel();
		b1=new Button("OK");
		b2=new Button("Canel");
		b3=new Button("Save");
		add(p1);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		setBackground(Color.GREEN);
		setSize(400,400);
		setVisible(true);		
	}
	public static void main(String[] args)
	{
		FlowLayoutButnEx ff=new FlowLayoutButnEx();
	}
}
