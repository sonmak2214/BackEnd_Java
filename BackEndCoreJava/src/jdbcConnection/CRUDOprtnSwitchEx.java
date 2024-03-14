package jdbcConnection;
import java.sql.*;
import java.util.Scanner;
public class CRUDOprtnSwitchEx 
{
	int rolno;
	String sname;
	int marks;
	String address;
	Scanner sc=new Scanner(System.in);
	
	public void AddData() throws ClassNotFoundException, SQLException
	{
		System.out.println("Enter Student Rolno:=");
		 rolno=sc.nextInt();
		System.out.println("Enter Student Name:=");
		 sname=sc.next();
		System.out.println("Enter Student Marks:=");
		 marks=sc.nextInt();
		System.out.println("Enter Address Here:=");
		 address=sc.next();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/batch","root","mysql123");
		PreparedStatement ps=con.prepareStatement("insert into student value(?,?,?,?)");
		ps.setInt(1,106);
		ps.setString(2,"Makarand");
		ps.setInt(3,89);
		ps.setString(4,"Vadodara");
		ps.executeUpdate();
	}
	public void UpdateData() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/batch","root","mysql123");
		PreparedStatement ps=con.prepareStatement("update student set name=?,smarks=?,address=? where rolno=?");
		ps.setString(1,"Prisha");
		ps.setInt(2, 23);
		ps.setString(3,"Shimala");
		ps.setInt(4,104);
		ps.executeUpdate();
  }
	public void DeleteData() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/batch","root","mysql123");
		PreparedStatement ps=con.prepareStatement("delete from student where sname=?");
		ps.setString(1,"Tejas");
		ps.executeUpdate();		
	}
	public void ViewData() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");//driver class
		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost/batch","root","mysql123");
		   PreparedStatement ps=con.prepareStatement("insert into Student value(?,?,?,?)");
		   String q="Select * from student";
		   ResultSet rs=ps.executeQuery(q);
		   while(rs.next())
		   {
			   System.out.println();
			   System.out.println("RolNumber:"+rs.getInt(1));
			   System.out.println("Name:"+rs.getString(2));
			   System.out.println("Marks::"+rs.getInt(3));	
			   System.out.println("Address:"+rs.getString(4));
		}		
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		CRUDOprtnSwitchEx  cc=new CRUDOprtnSwitchEx();
		System.out.println("1.AddData\n2.UpdateData\n3.DeleteData\n4.ViewData");
		System.out.println("Enter Your Choice Here..");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:cc.AddData();
		       cc.ViewData();
		       break;
		       
		case 2:cc.UpdateData();
		       cc.ViewData();
		       break;
		       
		case 3:cc.DeleteData();
		       cc.ViewData();
		       break;
		       
		case 4:cc.ViewData();
		        break;
		        
		default:System.out.println("Invalid Choice Here....");        
		       
		}
	}

}
