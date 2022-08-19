package java_constructor;
//A=3 (1.732)
//4a2 //equilateral formula
//trapezoid A=a+b/2 *h
public class Constructor_equilateral {
	Constructor_equilateral(int a){
		System.out.println("The area of equilateral : "+ (1.732/4*a*a));
		
	}
	Constructor_equilateral(float a1){
		System.out.println("The area of equilateral : "+ (1.732/4*a1*a1));
		
	}
	Constructor_equilateral(double base, double height){
		System.out.println("The area of traingle is : "+(0.5*base*height));
		
	}
	Constructor_equilateral(double r1, float r2){
		System.out.println("The area of traingle is : "+(3.14*r1*r2));
		
	}
	Constructor_equilateral(long a2, float b,float h){
		System.out.println("The area of trapezoid is : "+(a2+b/2*h));
		
	}
	
	
	
}
