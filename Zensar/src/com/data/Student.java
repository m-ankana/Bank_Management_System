package com.data;

public class Student implements Printable 
{
	
	private	String name;
	private	int rollNo;
	Date dob;
	static int no=1;
	private	float sub1,sub2,sub3;

	public Student(String name,  Date dob, float sub1, float sub2, float sub3)
	{
		this.name=name;
		rollNo=no;
		no=no+1;
		this.dob=dob;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}

	public float calAvg() {
		float avg=(sub1+sub2+sub3)/3;
		
		System.out.println("Average is:"+avg);
		return avg;
	}
	public void grade() {
		//call method within method
		float avg=calAvg();
		if(avg>70)
			System.out.println("Your grade is A");
		else
			if(avg<70 && avg>60)
				System.out.println("Your grade is B");
			else 
				System.out.println("Your grade is C");
	}
	
	public int getRollNo()
	{
		return rollNo;
	}
	public int calAge()
	{   int y=dob.getYear();
		int age;
		age=2020-y;
		return age;
	}

		public void print()
		{   int age=calAge();
		 	System.out.println("age is"+age);
		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Student s=new Student("ankana",new Date(7,4,1999), 100, 66, 59);
			s.grade();
			int roll=s.getRollNo();
			System.out.println(roll);
			System.out.println("age is"+s.calAge());
			Student s1=new Student("ananya",new Date(7,4,1999), 100, 66, 59);
			int roll1=s1.getRollNo();
			System.out.println(roll1);
			s.print();
			
		}

	
	}


