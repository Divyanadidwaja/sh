package com.Practice.Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SelectQueryTest2 {

	public static void main(String[] args) throws SQLException
	{
		Connection con = null;
		try
		
		{
		//Register database
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		//step 2: get connection for database
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
		
		//step 3:create statement
		Statement state=con.createStatement();
		String query="insert into rmg values(04,'Adyuth','java','3 days');";
		int result=state.executeUpdate(query);
		
		
		if(result>=1)
		{
			System.out.println("data is updated");
		}
		else
		{
		
		System.out.println("data is not updated");

	}
	String result2 ="SELECT * FROM RMG;";
	ResultSet query2 = state.executeQuery(result2);
	while(query2.next())
	{
		System.out.println(query2.getString(1)+ "  "+query2.getString(2)+"  "+query2.getString(3)+"  "+query2.getString(4));
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
