package com.data;

public class BookServices {
     BookClass b1=new BookClass(1,"pride and predudice",500.0f);
     BookClass b2=new BookClass(2,"David copperfield",1000.0f);
     
   
   /*  public void swapBookId()
     {
       int id1=b1.getBookId();
       int id2=b2.getBookId();
       int flag=id1;
       id1=id2;
       id2=flag;
       
       
       b1.setBookId(id1);
       b2.setBookId(id2);
       
     }
     
     public void swapBookName()
     {
       String name1=b1.getBookName();
       String name2=b2.getBookName();
       
       b1.setBookName(name2);
       b2.setBookName(name1);
       
       
     }
     
     public void swapBookPrice()
     {
       float price1=b1.getBookPrice();
       float price2=b2.getBookPrice();
      
       b1.setBookPrice(price2);
       b2.setBookPrice(price1);
     } */
     
     public  void swap()
     {
    	 int id1=b1.getBookId();
         int id2=b2.getBookId();
    	 String name1=b1.getBookName();
         String name2=b2.getBookName();
         float price1=b1.getBookPrice();
         float price2=b2.getBookPrice();
         
         
         b1.setBookId(id2);
         b2.setBookId(id1);
         b1.setBookName(name2);
         b2.setBookName(name1);
         b1.setBookPrice(price2);
         b2.setBookPrice(price1);
         
    	 
     }
     public String print1()
     {
    	 return b1.toString();
     }
    
     
     public String print2()
     {
    	 return b2.toString();
     }
    
	public static void main(String[] args) {
		
    BookServices bs=new BookServices();
  
    
    System.out.println(" values of first object"+"\n"+bs.print1());
    System.out.println(" values of second object"+"\n"+bs.print2());
    
  
   /* bs.swapBookId();
    bs.swapBookName();
    bs.swapBookPrice();
    */
    bs.swap();
    System.out.println(" swaped values of first object"+"\n"+bs.print1());
    System.out.println(" swaped values of second object"+"\n"+bs.print2());
	}

}
