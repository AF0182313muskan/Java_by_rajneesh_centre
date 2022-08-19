package java_constructor;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 ,sum=0,rem=0,num2;
		System.out.println("enter a number");
		num1=sc.nextInt();
		num2=num1;
		while(num1>0) {
			rem=num1%10;
			sum=sum*10+rem;
			num1=num1/10;
					}
		if(num2==sum) {
			System.out.println("It is a palindrome number");
		}
		else {
			System.out.println("It is not apalindrome number");
		}
		

	}

}
