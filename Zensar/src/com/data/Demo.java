package com.data;

public class Demo<T,M,N> {
	
	private T o;
	private M o1;
	private N o2;
	
	public Demo(T o,M o1,N o2)
	{
		this.o=o;
		this.o1=o1;
		this.o2=o2;
	}
    
	public T getData()
	{
		return o;
	}
	public M getData1()
	{
		return o1;
	}
	public N getData2()
	{
		return o2;
	}
	
	public static void main(String[] args) {
		
/*	Demo d=new Demo(new Integer(100));
	d.getData();
	Integer val=(Integer)d.getdata();
	Demo d1=new Demo("Hello");
	d1.getData();
	d1=d;*/

	Demo<Integer,String,Float> d=new Demo<>(500,"hello",5800.0f);	
	
	Integer a=d.getData();
	String b=d.getData1();
	Float c=d.getData2();
	
		System.out.println(a+" "+b+" "+c);
	}

}
