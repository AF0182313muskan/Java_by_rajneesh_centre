package java_constructor;

import java.util.Scanner;

public class Constructor_scanner {
	
	Constructor_scanner(int side,int side1){
		System.out.println("The area of square : "+(side*side1));
		
	}
	Constructor_scanner(int r1,float r2){
		System.out.println("The area of circle is : "+(3.14*r1*r2));
	}
	Constructor_scanner(double base,float height){
		System.out.println("The area of triangle is : "+ (0.5)*(base*height));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int s1,s2;
		System.out.println("Enter a number for s1");
		s1=sc.nextInt();
		System.out.println("Enter a number for s2");
		s2=sc.nextInt();
		Constructor_scanner obj = new Constructor_scanner(s1,s2);
		int r1;
		float r2;
		System.out.println("Enter a number for r1");
		r1=sc.nextInt();
		System.out.println("Enter a number for r2");
		r2 = sc.nextFloat();
		Constructor_scanner obj1 = new Constructor_scanner(r1,r2);
		double base;
		float height;
		System.out.println("Enter a number for base");
		base=sc.nextInt();
		System.out.println("Enter a number for height");
		height = sc.nextInt();
		Constructor_scanner obj2 = new Constructor_scanner(base,height);
		
		

	}

}
