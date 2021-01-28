package com.services;

import com.exception.InvalidAccountException;

public interface BankServices 
{
	
	 public int openAccount(String type, float amount);
	 public float deposit(int accNo, float amount)throws InvalidAccountException;
	 public float withdrawCash(int accNo, float amount);
	 public float balanceEnq(int acc) throws InvalidAccountException;
	 public String printDetail(int accNo) throws InvalidAccountException;
	
	

}
