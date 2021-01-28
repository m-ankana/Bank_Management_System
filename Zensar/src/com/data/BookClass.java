package com.data;



public class BookClass extends CompareBookPrice
{

	private int bookId;
	private String bookName;
	private float bookPrice;
	
	public BookClass(int bookId,String bookName,float bookPrice)
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookPrice=bookPrice;
	}
	
	public void setBookId(int bookId)
	{
		this.bookId=bookId;
	}
	public void setBookName(String bookName)
	{
		this.bookName=bookName;
		
	}
	public void setBookPrice(float bookPrice)
	{
		this.bookPrice=bookPrice;
	}
	

	public int getBookId()
	{
		return bookId;
	}
	public String getBookName()
	{
		return bookName;
	}
	public float getBookPrice()
	{
		return bookPrice;
	}
	
	public void swap(int id,String name,float price)
	{
		
	}
	public String toString()
	{
		return "BOOK ID  "+bookId+"\n"+"BOOK NAME  "+bookName+"\n"+"BOOK PRICE  "+bookPrice ;
	}
	public static void main(String[] args) {
		
	}

	



}
