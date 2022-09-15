package java_af0182313;

import java.util.Scanner;

public class Exceptionprog1 {
	public static void main(String[] args) 
	{
		System.out.println("hello world");
		try {
		int a=8/0;
		System.out.println(a);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	
		finally {
			System.out.println("This is finally block");
		}
		System.out.println("hello muskan shaikh");
	}



}
