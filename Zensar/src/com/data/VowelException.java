package com.data;

public class VowelException extends Exception
{

	String msg;

	public VowelException(String msg) {
		
		this.msg = msg;
	}

	public String toString() {
		return "VowelException [msg=" + msg + "]";
	}
	
	
}

