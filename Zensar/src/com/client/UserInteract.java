package com.client;


import com.exception.InvalidAccountException;
import com.provider.Provider;
import com.services.BankServices;

public class UserInteract 
{

	public static void main(String args[]) 
	{
        BankServices bank=Provider.CreateObject();
        
        
        System.out.println("WELCOME TO HDFC BANK");
        System.out.println(" PRESS 1 TO OPEN ACCOUNT");
        System.out.println(" PRESS 2 TO DEPOSIT CASH");
        System.out.println(" PRESS 3 TO WITHDRAW CASH");
        System.out.println(" PRESS 4 FOR BALANCE ENQUIRY");
        System.out.println(" PRESS 5 TO PRINT ACCOUNT DETAILS");
     
        Integer choice=Integer.parseInt(args[0]);
               
       /* Integer accNo=Integer.parseInt(args[1]);
        String type=String(args[2]);
        Float amount=Float.parseFloat(args[3]);*/
       
        switch(choice)
        {
        	case 1:
        	{   try
        	   {
        		System.out.println("Enter the account type and amount");
        		bank.openAccount(type, amount);
        	   }
        	   catch(Exception e)
        	   {
        		   e.printStackTrace();
        	   }
        	}
        	
        	case 2:
        	{   
        		try
        		{
        		System.out.println("Enter the account no and amount");
        		bank.deposit(accNo, amount);
        		}
        		
        		catch(InvalidAccountException e)
        		{
        			e.printStackTrace();
        		}
        		
        		catch(Exception e)
        		{
        			e.printStackTrace();
        		}
        	}
        	case 3:
        	{
        		try
        		{
        		System.out.println("Enter the account no and amount ");
        		bank.withdraw(accNo, amount);
        		}
        		
        		catch(Exception e)
        		{
        			e.printStackTrace();
        		}
        	}
        	
        	case 4:
        	{   
        		try
        		{
        		System.out.println("Enter the account no ");
        		bank.balEnq(accNo);
        		}
        		catch(InvalidAccountException e)
        		{
        			e.printStackTrace();
        		}
        		
        		catch(Exception e)
        		{
        			e.printStackTrace();
        		}
        		
        	}
        	
        	case 5:
        	{   
        		try
        		{
        		System.out.println("Enter the account no ");
        		bank.printAccountDetail(accNo);
        		}
        		catch(InvalidAccountException e)
        		{
        			e.printStackTrace();
        		}
        		
        		catch(Exception e)
        		{
        			e.printStackTrace();
        		}
        	}
        	
        	
        }
	}



}
