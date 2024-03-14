package guiAWT;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;
import java.io.*;
public class SwingDilogBoxEx extends JFrame implements ActionListener
{
   JPanel p1;
   JMenuBar mb;
   JMenu m1;
   JMenuItem o1,s1;
   JTextArea ta;
   
   public SwingDilogBoxEx()
   {
	  super("SwingDilogBoxFrame");
	  p1=new JPanel();
	  ta=new JTextArea(25,30);
	  mb=new JMenuBar();
	  setJMenuBar(mb);
	  m1=new JMenu();
	  o1=new JMenuItem("Open");
	  s1=new JMenuItem("Save");
	  getContentPane().add(p1);
	  mb.add(m1);
	  p1.add(mb);
	  ta.add(o1);
	  ta.add(s1);
	  p1.add(o1);
	  p1.add(s1);
	  o1.addActionListener(this);
	  s1.addActionListener(this);
	  setSize(500,500);
	  setBackground(Color.GREEN);
	  setVisible(true);
	  	  
   }
   
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object obj=e.getSource();
		if(obj==o1)
		{
			JFileChooser fc=new JFileChooser();
			fc.showOpenDialog(this);
			File f=fc.getSelectedFile();
			try
			{
				FileInputStream fin=new FileInputStream(f);
				byte[]b=new byte[fin.available()];
				String s1=new String(b);
				ta.setText(s1);
			}
			catch(Exception ee)
			{
				System.out.println(ee);
			}
		}
		else if(obj==s1)
		{
			JFileChooser fc=new JFileChooser();
			fc.showSaveDialog(this);
			File f=fc.getSelectedFile();
			String s1=ta.getText();
			byte b[]=s1.getBytes();
			try
			{
				FileOutputStream fout=new FileOutputStream(f);
				fout.write(b);
			}
			catch(Exception ee)
			{
				System.out.println(ee);
			}
		}
	}

	public static void main(String[] args) 
	{
		SwingDilogBoxEx ss=new SwingDilogBoxEx();
	}

}
