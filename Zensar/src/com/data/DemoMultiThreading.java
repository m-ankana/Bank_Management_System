package com.data;

public class DemoMultiThreading extends Thread
{    Thread t1;
     Thread t2;
     Thread t3;
     int number;

     public DemoMultiThreading(int number)
     {   this.number=number;
    	 t1=new Thread(this);
    	 t1.start();
    	 t2=new Thread(this);
    	 t2.start();
    	 t3=new Thread(this);
    	 t3.start();
     }
     public void run()
     {
    	 if(Thread.currentThread()==t1)
    	 {
    		  printTable55();
    	 }
    	 else
    	 if(Thread.currentThread()==t2)
    	 {
    		 printOddEven(number);
    	 }
         else
         {
        	 printTable155();
         }
    			 
     }

     public void printTable55()
     {
    	 for(int i=1;i<=10;i++)
    	 {
    		 int mul;
    		 mul=15*i;
    		 System.out.println("15 *"+i+"="+mul);
    	 }
    	 try
    	 {
    	 Thread.sleep(100);
    	 }
    	 catch(InterruptedException e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     
     public void printOddEven(int number)
     {
    	 if(number%2==0)
    	 {
    		 System.out.println("number is even");
    	 }
    	 else
    		 System.out.println("number is odd");
    	 try
     	{
     	 Thread.sleep(100);
 	    }
 	    catch(InterruptedException e)
 	    {
 		      e.printStackTrace();
 	    }
     }
     
     public void  printTable155()
     {
    	 for(int i=1;i<=10;i++)
    	 {
    		 int mul;
    		 mul=155*i;
    		 System.out.println("15 *"+i+"="+mul);
    	 }
    	try
    	{
    	 Thread.sleep(100);
	    }
	    catch(InterruptedException e)
	    {
		      e.printStackTrace();
	    }
     }
	public static void main(String[] args) {
		int no=Integer.parseInt(args[0]);
		DemoMultiThreading d =new  DemoMultiThreading(no);
		
		d.run();
		
		

	}

}
