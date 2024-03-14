package guiAWT;
import java.awt.*;
public class CalculatorFrame extends Frame
{
	TextField t1;
	Button b1[];
	Panel p;
	GridLayout g1;
	
	public CalculatorFrame()
	{
	 super("CalculatorFrame");
	 t1=new TextField(35);
	 p=new Panel();
	 add("North",t1);
	 add("Center",p);
	 g1=new GridLayout(4,4);
	 p.setLayout(g1);
	 b1=new Button[16];
	 
	 for(int i=0;i<10;i++)
	{
		 b1[i]=new Button(String.valueOf(i)) ;
   	}
	 b1[10]=new Button(".");
	 b1[11]=new Button("=");
	 b1[12]=new Button("+");
	 b1[13]=new Button("-");
	 b1[14]=new Button("*");
	 b1[15]=new Button("/");
	 
	 for(int i=0;i<16;i++)
	 {
		 p.add(b1[i]);
	 }
	 setSize(500,500);
	 setBackground(Color.GRAY);
	 setVisible(true);
	} 
	public static void main(String[] args) 
	{
		CalculatorFrame  c1=new CalculatorFrame(); 
		
	}

}
