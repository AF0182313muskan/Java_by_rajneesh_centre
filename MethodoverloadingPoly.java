package polymorphism;

import java.util.Scanner;

public class MethodoverloadingPoly {
	
	
	public void area(int base,int height)
	{
		
		System.out.println("The area of triangle:"+0.5*base*height);
	}
	public void area(float radius)
	{
		System.out.println("The radius of circle is:"+3.14*radius*radius);
	}
	public void area(double radius,double height)
	{
		System.out.println("Circumference of circle is:"+2*3.14*radius*height);
	}
	public void area(int side)
	{
		System.out.println("Area of square:"+side*side);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int base, height;
		System.out.println("Enter numbers accordingly");
		System.out.println("enter two number for area of triangle ");
		base = sc.nextInt();
		height = sc.nextInt();
		System.out.println("Enter a number for radius");
		float radius;
		radius=sc.nextFloat();
		System.out.println("Enter two number for Circumference of circle");
		double radius1,height1;
		radius1 = sc.nextDouble();
		height1=sc.nextDouble();
		System.out.println("enter a number for area of square ");
		int side;
		side=sc.nextInt();
		 MethodoverloadingPoly obj = new  MethodoverloadingPoly();
		 obj.area(base, height);
		 obj.area(radius);
		 obj.area(radius1, height1);
		obj.area(side);

	}

}
