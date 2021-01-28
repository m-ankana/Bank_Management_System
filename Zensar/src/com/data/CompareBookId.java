package com.data;

import java.util.Comparator;

public class CompareBookId implements Comparator<BookClass>
{

	@Override
	public int compare(BookClass a1, BookClass a2) {
		if(a1.getBookId()==a2.getBookId())
		 return 1;
		if(a1.getBookId()>a2.getBookId())
		 return -1;
		else
		return 0;
	}



}
