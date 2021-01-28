package com.data;

public class DemoException {
	public static void main(String[] args) {
		
		
		
		
			int no=Integer.parseInt(args[0]);
			System.out.print(no);
			
		    int val=0;
		    
			
		
			try
			{
				
			if(no<=0)
			{	
			    throw new InvalidExceptionHandling("0 or -ve value not allowed");
			}
			
			val=val/no;
			
			}
			
		catch(InvalidExceptionHandling e)
		{
			e.printStackTrace();
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
