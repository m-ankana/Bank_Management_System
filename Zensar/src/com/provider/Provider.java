package com.provider;

import com.serviceimpl.HDFC;

public class Provider 
{
	
	public static HDFC CreateObject()
	{
		return new HDFC();
	}

}
