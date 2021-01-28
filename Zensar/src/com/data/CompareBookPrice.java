package com.data;

import java.util.Comparator;

public class CompareBookPrice implements Comparator<BookClass> 
{

	@Override
	public int compare(BookClass a1, BookClass a2) {
		 
		if(a1.getBookPrice()==a2.getBookPrice())
			return 1;
		
		if(a1.getBookPrice()>a2.getBookPrice())
			return -1;
		
		else
			
		return 0;
	}


}
