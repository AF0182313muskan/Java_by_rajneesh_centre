package java_constructor;

import java.util.Scanner;

public class ConsEquilateral_Run {
	public void run() {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("enter a number for int no");
		a=sc.nextInt();
		Constructor_equilateral obj = new Constructor_equilateral(a);
		float a1;
		System.out.println("Enter a number for flaot no");
		a1=sc.nextFloat();
		Constructor_equilateral obj1 = new Constructor_equilateral(a1);
		 double base,heigth;
		 System.out.println("enter a number for base");
		 base=sc.nextDouble();
		System.out.println("enter a number for height");
		heigth=sc.nextDouble();
		Constructor_equilateral obj2 = new Constructor_equilateral(base,heigth);
		double r1; 
		float r2;
		System.out.println("enter a number for r1");
		r1=sc.nextDouble();
		System.out.println("Enter a number for r2");
		r2=sc.nextFloat();
		Constructor_equilateral obj3 = new Constructor_equilateral(r1,r2);
		long a2;
		float b,h;
		System.out.println("Enter a number for a2");
		a2=sc.nextLong();
		System.out.println("Enter a number for b");
		b=sc.nextFloat();
		System.out.println("Enter a number for h");
		h=sc.nextFloat();
		Constructor_equilateral obj4 = new Constructor_equilateral(a2,b,h);
		
	}

	public static void main(String[] args) {
		
		 ConsEquilateral_Run obj = new  ConsEquilateral_Run();
		 obj.run();
		
	}

}
