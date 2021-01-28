package com.data;

public class Validate {

	int dd,mm,yy;
    //setter function
 void setVal(int d, int m, int y)
 {
         dd=d;
         mm=m;
         yy=y;
         valid();

 }

 void valid()
 {   if(mm<=12 && yy<=2020)
    {
             if(yy%400==0 || yy%4==0)
            {
                 if(mm==2 && dd<=29 )
                	 System.out.println(dd+"/"+mm+"/"+yy);
                 else if(mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12 && dd<=31)
                   
                	 System.out.println("valid entry");
                 else if( mm==4 || mm==6 || mm==9 ||  mm==11 && dd<=30)
                
                        System.out.println(dd+"/"+mm+"/"+yy);
                
            }


             else
         {        if(mm==2 && dd<=28)
                        System.out.println("valid entry");
                  else if(mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12 && dd<=31)
                	  System.out.println(dd+"/"+mm+"/"+yy);
                  else if( mm==4 || mm==6 || mm==9 ||  mm==11 && dd<=30)
                	  System.out.println(dd+"/"+mm+"/"+yy);
         }
         }
         else
           System.out.println("invalid entry");
 
                      
 }

 public static void main(String[] args) {
                Validate d=new Validate();
                d.setVal(31,1,2018);

        }

}
