package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnetionEx 
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
			System.out.println("Roll Number:-"+rs.getInt(1));
			System.out.println("Name:="+rs.getString(2));
			System.out.println("Address:="+rs.getString(3));
			System.out.println("Age:="+rs.getInt(4));
		}
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		ConnetionEx  cc=new ConnetionEx(); 
		cc.connection();
	}

}
//1.class.forName----->Registration
//2.connection----->this class established connection between database sql & java
//3.DriverManager.getConnection-->(url,username,password,databasename)
//4.Statement-->Its used to fired the query & execute the database
//5.ResultSet-->Convert data--java--cls&object----database---row&column
//6.Exception-->handle the exception with try--catch or throw exception