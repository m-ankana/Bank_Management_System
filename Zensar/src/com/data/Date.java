package com.data;

public class Date {
	
   private int dd,mm,yy;
  
   
  public Date(int dd,int mm, int yy)
  {
	  this.dd=dd;
	  this.mm=mm;
	  this.yy=yy;
  }
  public void setDate(int dd )
  {
	  this.dd=dd;
  }
  
  public void setMonth(int mm )
  {
	  this.mm=mm;
  }
  
  public void setYear(int yy )
  {
	  this.yy=yy;
	  
  }
  
  public int getDate( )
  {
	  return dd;
  }
  
  public int getMonth( )
  {
	  return mm;
  }
  
  public int getYear( )
  {
	  return yy;
  }
  
  public String toString()
  {
	  return "dob:"+dd+"/"+mm+"/"+yy;
  }

}
