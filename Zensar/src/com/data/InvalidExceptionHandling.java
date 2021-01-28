package com.data;

public class InvalidExceptionHandling extends Exception 
{   
	
	String msg;
   public InvalidExceptionHandling(String msg)
   {
	   this.msg=msg;
   }
   
   public String toString() 
   {
	return "InvalidExceptionHandling [msg=" + msg + "]";
   }
	
  
  
   
}
