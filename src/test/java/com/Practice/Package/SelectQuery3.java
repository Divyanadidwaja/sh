package com.Practice.Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SelectQuery3 {

	public static void main(String[] args) throws SQLException
	{
		Connection con=null;
		try
		{
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root","root");
		Statement state = con.createStatement();
		ResultSet query=state.executeQuery("SELECT * FROM RMG;");
		while(query.next())
		{
			System.out.println(query.getString(1)+" "+query.getString(2)+""+query.getString(3)+""+query.getString(4));
		}
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			con.close();
		}
		
		

	}

}
