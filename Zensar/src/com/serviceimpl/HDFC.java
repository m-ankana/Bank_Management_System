package com.serviceimpl;

import com.beans.Account;
import com.exception.InvalidAccountException;
import com.services.BankServices;

public class HDFC implements BankServices 
{   //containment of class Account
    Account a;
    
    
     //function for opening account 
	public int openAccount(String type, float amount)
	{  
	   
	 a= new Account(type,amount); 
	   
	 return a.getAccNo();
	}

	//function to deposit money
	public float deposit(int accNo, float amount)throws InvalidAccountException
	{   
			
		int accNum=a.getAccNo();
		float bal=a.getAccBal();
		
		if(accNo==accNum)
		{   
		   a.setAccBal(bal+amount);
			
		}
		else
			{
			
			throw new InvalidAccountException("this account no is invalid");
			
			}
		
		return a.getAccBal();
		
	}
	
	//function to withdraw amount
	public float withdrawCash(int accNo, float amount)
	{   
	   
	      int accNum=a.getAccNo();
	      float bal=a.getAccBal();
	
		  if(accNo==accNum )
		  {	  
		         if(bal>amount)
			     {
		        	 a.setAccBal(bal-amount);
		         }
		         else
		         System.out.println("amount not enough!");
		  } 
		  
		  else
		  {
				System.out.println("this account no is invalid");
				
		  }
	   
		return a.getAccBal();
	}
	
	//function to get balance details
	public float balanceEnq(int acc) throws InvalidAccountException
	{   
	     
	      int accNum=a.getAccNo();
	     
	      if(acc==accNum)
	      {
	    	  System.out.println("Current account balance is"+a.getAccBal());
	      }
	      else
	      {
				
			  throw new InvalidAccountException("this account no is invalid");
				
		  }
	   
	    return a.getAccBal(); 
	}
	
	//function to display account details
    public String printDetail(int accNo) throws InvalidAccountException
	{   
	     int accNum=a.getAccNo();
	     
	     if(accNo==accNum)
	     {
	    	 System.out.println(a);
	     }
	     else
	     {
				
			 throw new InvalidAccountException("this account no is invalid");
				
		 }
        
		return a.toString();
	}

	
 
	
	 
	 
}