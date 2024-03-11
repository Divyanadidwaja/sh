package com.Practice.Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;


public class SeectQueryTest
{
public static void main(String [] args) throws SQLException
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
	String query="SELECT * FROM RMG;";
	ResultSet result=state.executeQuery(query);
	while(result.next())
	{
		System.out.println(result.getString(1)+"  "+result.getString(2)+"  "+result.getString(3)+" "+result.getString(4));
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

