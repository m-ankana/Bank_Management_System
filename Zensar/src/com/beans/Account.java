package com.beans;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Account 
{
     private int accNo;
     private String accType;
     private float accBal;
     static int defaultValue;
     String openingDate;
     
     //formatting current date
     SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
     Date date=new Date();
     
     //static block for generating account no
     static
     {
    	defaultValue=4000;
     }
    
     //constructor 
     public Account( String accType, float accBal )
     { 
    	 openingDate=sdf.format(date);
     	 
    	 //to increment the account no
    	 this.accNo=defaultValue;
         defaultValue=defaultValue+1;
    	 
         this.accType=accType;
    	 this.accBal=accBal;
    	 
     }
     
     //setter method for account number
     public void setAccNo(int accNo)
     {
    	 this.accNo=accNo;
     }
     
     //setter method for account type
     public void setAccType(String accType)
     {
    	 this.accType=accType;
     }
     
     //setter method for account balance
     public void setAccBal(float accBal)
     {
    	 this.accBal=accBal;
     }
     
     //getter method for account no
     public int getAccNo()
     {
    	 return accNo;
     }
     
     //getter method for account type
     public String getAccType()
     {
    	 return accType;
     }
     
     
     //getter method for account balance
     public float getAccBal()
     {
    	 return accBal;
     }
     
     //toString method to display data
     public String toString()
     {
    	 return "Account no" + accNo +"\n"+"Account type"+ accType +"\n"+"Account"+ accBal+"\n"+"date of opening"+openingDate;
     }
     
	
 }


