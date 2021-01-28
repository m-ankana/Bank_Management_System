package com.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class BookServices1 {

	public static void main(String[] args) {
		
		ArrayList<BookClass> a1=new ArrayList<>();
		a1.add(new BookClass(1,"pride and predudice",500.0f));
		a1.add(new BookClass(2,"david coppperfield",1500.0f));
		a1.add(new BookClass(3,"wonder",1250.0f));
		
		Collections.sort(a1, new CompareBookPrice());
		System.out.println("\n"+a1);
		
		
		System.out.println("\n"+a1);
		Collections.sort(a1, new CompareBookId());
		System.out.println("\n"+a1);
		
		Iterator<BookClass> i1=a1.iterator();
		while(i1.hasNext())
		{  
			BookClass b=i1.next();
			float price=b.getBookPrice();
			
			if(price>1000)
			{
				b.setBookPrice(b.getBookPrice()-500);
			}
			
		}
		System.out.println("\n"+a1);
		
		Collections.sort(a1, new CompareBookName());
	}

}
