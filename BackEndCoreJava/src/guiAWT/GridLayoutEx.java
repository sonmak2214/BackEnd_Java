package guiAWT;
import java.awt.*;
public class GridLayoutEx extends Frame
{
    Button b1,b2,b3,b4;
    GridLayout g;
    
    public GridLayoutEx()
    {
    	super("GridLayoutFrame");
    	g=new GridLayout(2,2);
    	setLayout(g);
    	b1=new Button("Login");
    	b2=new Button("Clear");
    	b3=new Button("Set");
    	b4=new Button("Reset");
    	add(b1);
    	add(b2);
    	add(b3);
    	add(b4);
    	setBackground(Color.pink);
    	setSize(500,500);
    	setVisible(true);
    } 
	public static void main(String[] args)
	{
		GridLayoutEx gg=new GridLayoutEx();

	}

}
