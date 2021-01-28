package com.provider;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnectionProvider 
{

	
public static Connection getConnection()
{
	Connection con=null;
	try
	{
		FileInputStream fis=new FileInputStream(".//resources//DbConfig.properties");
		Properties p=new Properties();
		p.load(fis);
		
		String driverClass=p.getProperty("driver");
		String urlname=p.getProperty("url");
		String username=p.getProperty("username");
		String password=p.getProperty("password");
		
		System.out.println(urlname+"/"+username+"/"+password);
		
		Class.forName(driverClass);
		con=DriverManager.getConnection(urlname,username,password);
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
   
	return con;
}

}
