package java_constructor;
//Write a program to find area of triangle and area of circle and area of cylinder
//A=2πrh+2πr2
import java.util.Scanner;

public class Contructoreg {
	public void square(int side) {
		System.out.println("the area of square : "+side*side);
		
	}
	public void add(int a,int b) {
		System.out.println("The addition of two numbers is : "+(a+b));
		
	}

	Contructoreg(int l, int b){
		System.out.println("The area of triangle is : "+0.5*(l*b));
		}
	Contructoreg(int s){
		System.out.println("the area of circle is : "+(3.14*s*s));		
	}
	 Contructoreg(float  r, float h){
		 System.out.println("The area of cylinder is : "+(2*3.14*r*h+2*3.14*r*r));
		
	}
	public static void main(String[] args) {
	Contructoreg obj = new Contructoreg(12,14);
	Contructoreg obj1 = new Contructoreg(5);
	Contructoreg obj2 = new Contructoreg(12f,4f);
    obj.add(20, 54);
	obj.square(5);
	
	
	}
}
                                                                  
