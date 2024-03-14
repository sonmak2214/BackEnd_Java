package guiAWT;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SwingDilogBoxEx1 extends JFrame implements ActionListener
{
	JButton b1,b2;
	JLabel l1;
	JTextField t1;
	JPanel p1;
	
	public  SwingDilogBoxEx1()
	{
		p1=new JPanel();
		l1=new JLabel("Enter Username");
		t1=new JTextField(30);
		b1=new JButton("Welcome");
		b2=new JButton("INPUT");
		getContentPane().add(p1);
		b1.addActionListener(this);
		b2.addActionListener(this);
		p1.add(l1);
		p1.add(t1);
		p1.add(b1);
		p1.add(b2);
		setBackground(Color.magenta);
		setSize(500,500);
		setVisible(true);		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object obj=e.getSource();
		if(obj==b1)
		{
			String s1=t1.getText();
			JOptionPane.showInputDialog(this,"Welcome"+s1);
		}
		else if(obj==b2)
		{
			String s1=JOptionPane.showInputDialog(this,"Enter Name");
			JOptionPane.showInputDialog(this,"Welcome"+s1);
		}
		
	}
	public static void main(String[] args) 
	{
		SwingDilogBoxEx1 ss=new SwingDilogBoxEx1();
	}

}
