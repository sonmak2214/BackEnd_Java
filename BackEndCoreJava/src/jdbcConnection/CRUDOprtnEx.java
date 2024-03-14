package jdbcConnection;
import java.sql.*;
public class CRUDOprtnEx 
{
  public void connection() throws ClassNotFoundException, SQLException
  {
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost/school","root","mysql123");
	  
	  Statement s=con.createStatement();
	  String q="select * from Student";
	  ResultSet rs=s.executeQuery(q);
	  
	  while(rs.next())
	  {
		  System.out.println();
	 	  System.out.println("Roll Number:="+rs.getInt(1));
		  System.out.println("Name:="+rs.getString(2));
		  System.out.println("Address:="+rs.getString(3));
		  System.out.println("Age:="+rs.getInt(4));
	  }
	  
  }
  public void AddData() throws SQLException, ClassNotFoundException
  {
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost/school","root","mysql123");
	  PreparedStatement ps=con.prepareStatement("insert into student value(?,?,?,?)");
	  ps.setInt(1, 105);
	  ps.setString(2,"Devyani");
	  ps.setString(3,"Nashik");
	  ps.setInt(4, 28);
	  ps.executeUpdate();
	  System.out.println("Record Added Succesfully inside table..");
	  
  }
  public void UpdateData() throws ClassNotFoundException, SQLException
  {
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost/school","root","mysql123");
	  PreparedStatement ps=con.prepareStatement("update student set name=?,address=?,age=? where rolno=?");
	  ps.setString(1,"Divya");
	  ps.setString(2,"Delhi");
	  ps.setInt(3, 25); 
	  ps.setInt(4, 103); 
	  ps.executeUpdate();
	  System.out.println("Update Record Succesfully Inside table..");
  }
  public void DeleteData() throws ClassNotFoundException, SQLException
  {
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost/school","root","mysql123");
	  PreparedStatement ps=con.prepareStatement("delete from student where age=?");
	  ps.setInt(1, 24);
	  ps.executeUpdate();
	  System.out.println("Delete the record succesfully inside the table..");
  }
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		CRUDOprtnEx  c1=new CRUDOprtnEx();
		c1.connection();
		//c1.AddData();
		//c1.UpdateData();
		c1.DeleteData();
	}
}
