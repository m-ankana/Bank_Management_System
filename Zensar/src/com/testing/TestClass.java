package com.testing;

import com.data.Shape;



public class TestClass
{
	
	
	public static void main(String args[])
	{   float side=Float.parseFloat(args[0]);
		Shape s=new Square("pink",side);
		
		double area=s.area();
		   assert(area>=0):"area cant be -ve";
		   System.out.println(s);
		
	}

}
