package com.data;

 abstract class Account1
{
	protected int accNo;
	protected float accBal;
	
	public Account1(int accNo, float accBal)
	{
		this.accNo=accNo;
		this.accBal=accBal;
		
	}
	
	 abstract public float intcal();
	
	 public String toString()
	 {
		return "account no"+accNo+"account balance"+accBal; 
	 }
}

public class Savings extends Account1
 {
	
	protected float intRate;
	
	public Savings(int accNo, float accBal)
	{
		super(accNo,accBal);
		// this.intRate=intRate;
		
	}
	
	public float intcal()
	{
		float rate=(0.08f)*accBal;
		return accBal+rate;
	}

	 public String toString()
	 {
		return super.toString(); 
	 }
	public static void main(String[] args) {
		Savings s=new Savings(17,5000.0f);
		float amount=s.intcal();
		System.out.println(amount);
        System.out.println(s);
	}

}

 class Current extends Account1
 {
	
	protected float intRate;
	
	public Current(int accNo, float accBal)
	{
		super(accNo,accBal);
		//this.intRate=intRate;
		
	}
	
	public float intcal()
	{
		float rate=accBal*(0.12f);
		return accBal+rate;
	}

	public String toString()
	 {
		return super.toString(); 
	 }
	public static void main(String[] args) {
		Current c=new Current(18,38000.0f);
		float amount=c.intcal();
		System.out.println(amount);
		 System.out.println(c);

	}

}