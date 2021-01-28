package com.data;

public abstract class Shape {
     protected String colour;
     static double pie;
     
     static 
     {
    	 pie=3.14;
     }
     
     public Shape(String colour)
     {
    	 this.colour=colour;
     }
     
     public abstract double area();
     
     
     public String toString()
	 {
		 return "colour is"+colour+"\n"+"area"+ area();
	 }

}

 class Circle extends Shape
{   protected float radius;
	 
	 public Circle(String colour,float radius)
 {     super(colour);
	   this.radius=radius;
 }
	 public  double area()
	 {
		 return pie*radius*radius ;
	 }

	   public String toString()
		 {
			 return super.toString();
		 }
	
	   public static void main(String[] args)
	   {
		  Shape c=new Circle("yellow",2.0f);
		   System.out.println(c);
	   }

}

 class Square extends Shape
 {
	 protected float side;
	 
	 public Square(String colour, float side)
	 {
		 super(colour);
		 this.side=side;
	 }
     

	 public  double area()
	 {
		 return side*side ;
	 }
	 
	 public String toString()
	 {
		 return super.toString();
	 }
	 public static void main(String[] args)
	   {   float side=Float.parseFloat(args[0]);
		   Shape s=new Square("red",side);
		  
		   double area=s.area();
		   assert(area>=0):"area cant be -ve";
		   System.out.println(s);
	   }
 }