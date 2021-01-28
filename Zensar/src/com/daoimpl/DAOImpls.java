package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.beans.Account;
import com.exception.InvalidAccountException;
import com.provider.DBConnectionProvider;

public class DAOImpls 
{
  Connection con;
  PreparedStatement ps1,ps2,ps3,ps4;
  ResultSet rs;
  
  public DAOImpls()
  {
	  con=DBConnectionProvider.getConnection();
  }
  //to create record in the table
  public int insertData(Account acc)
  {   int UpdateCount=0;
    try
    {
    	
	  ps1=con.prepareStatement("insert into AccountTable values(?,?,?)");
	  ps1.setInt(1, acc.getAccNo());
	  ps1.setString(2, acc.getAccType());
	  ps1.setFloat(3, acc.getAccBal());
	  UpdateCount=ps1.executeUpdate();
	  
    }
    catch(Exception e)
    {
    	e.printStackTrace();
    }
    
	  return UpdateCount;
  }
  
  //to read record from table
  public Account readData(int accNo)
  {   Account acc=null;
      
	  try
	  {
		  ps2=con.prepareStatement("select * from AccountTable where accno=?");
		  ps2.setInt(1,accNo);
		  rs=ps2.executeQuery();
		  while(rs.next())
		  {
			 /*  accNo1=rs.getInt(1);*/
			  String type=rs.getString(2);
			  float bal=rs.getFloat(3);
			  acc=new Account(type,bal);
			  
		  }
	  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
		  return acc;
	  }
  
  //to update record from table
  public int updateData(String type, int accNo)
  {
	  try
	  {   Account acc = null;
		  ps3=con.prepareStatement("update AccountTable SET acctype=? where accno=?");
		  ps3.setString(1,type);
		  ps3.setInt(2,accNo);
		  rs=ps3.executeQuery();
		  while(rs.next())
		  {
			  String accType=rs.getString(1);
			  int accNum=rs.getInt(2);
			  if(accNum==acc.getAccNo())
			  {
				  acc.setAccType(accType);
			  }
			  else
			  {
				  throw new InvalidAccountException("account doesnt exist!");
			  }
		   }
	    }
		  catch(InvalidAccountException e)
		  {
			  e.printStackTrace();
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
		 
	  return 1;
  }

  public static void main(String args[])
  {  
	  DAOImpls d=new DAOImpls();
	  //records are created 
	  d.insertData(new Account("CURRENT",15000));
	  d.insertData(new Account("SAVINGS",2420));
	  d.insertData(new Account("SAVINGS",5400));
	  d.insertData(new Account("CURRENT",67000));
	  
	  //readData function is called
	  Account a=d.readData(4001);
	  System.out.print(a);
	  
	  //update function is called
	  d.updateData("current", 4000);
	 
	  
	  
  }

}
