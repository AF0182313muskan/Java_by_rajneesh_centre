package java_af0182313;

import java.util.Scanner;

public class ExceptionProg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Hello world");
		//System.out.println("hello anudip");
		System.out.println("enter your age");
		int age = sc.nextInt();
		if(age<18) {
			throw new Excep2("you are not eligible to vote");
		}
		else {
			System.out.println("you are eligible ");
		}
		System.out.println("Thank you for voting");
	}
	

}
