package com.data;

public abstract class Employee {
	
	protected String eName;
	protected int eId;
	protected float eSalary;
	
	
	public Employee(String eName, int eId, float eSalary)
	{
		this.eName=eName;
		this.eId=eId;
		this.eSalary=eSalary;
	}
    
	public abstract String designation();
	
	public float calSal()
	{   System.out.println("basic salary");
		return 12*eSalary ;
	}
	
	public String toString()
	{
		return "employee name"+ eName +"\n"+"employee id"+ eId+ "\n"+"employee salary"+eSalary;
	}
}

 class Manager extends Employee
{
	protected int inc;
	
	public Manager(String eName ,int eId , float eSalary ,int inc)
	{
		super(eName,eId,eSalary);
		this.inc=inc;
	}
	//overriding
	public float calsal()
	{  System.out.println("INCENTIVE salary");
		super.calSal();
	   return 12*(eSalary+inc);	
	}
	 public String designation()
	 {
		return "manager";
	 }
	public String toString()
	{
		return super.toString()+"incentives"+inc;
	}
	
	
}

 class AreaSalesManager  extends Manager
 {
	 protected float petrol;
	 protected float food;
	 
	 public AreaSalesManager(String eName ,int eId , float eSalary ,int inc, float petrol, float food)
	 {
		 super( eName , eId ,  eSalary , inc);
		 this.petrol=petrol;
		 this.food=food;
	 }
	  
	 public float allowance()
	 {
		 return petrol+food;
	 }
	 
	 public String designation()
	 {
		 return "sales manager";
	 }
	 public float calsal()
		{ System.out.println("allowance");
		  super.calsal(); 
		  float allow=allowance();
		   return 12*(eSalary+inc+allow);	
		}
	 public String toString()
		{
			return super.toString()+"\n"+"petrol and food"+petrol+food;
		}
	 public static void main(String[] args)
		{
		 AreaSalesManager a=new AreaSalesManager("ankana",17,2000,500,2000.0f,300.0f);
			a.calsal();
			System.out.println(a);
		}
 }