package com.data;


class  CosonentException extends Exception
{
	 String msg;

	public CosonentException(String msg) {
	
		this.msg = msg;
	}

	public String toString() {
		return "CosonentException [msg=" + msg + "]";
	}
	 
	
	 
	 
}