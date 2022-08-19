package java_constructor;

import java.util.Scanner;

public class Cons_Palindrome {
	Cons_Palindrome(int num1,int sum,int rem,int num2){
		while(num1>0) {
			rem=num1%10;
			sum=sum*10+rem;
			num1=num1/10;
		}
	if(num2==sum) {
		System.out.println("it is a palindrome");
	}
	else {
		System.out.println("It is not a palindrome");
	}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num2,num1,sum=0,rem=0;
		System.out.println("Enter a number");
		num1=sc.nextInt();
		num2=num1;
		Cons_Palindrome obj = new Cons_Palindrome( num1, sum, rem, num2);

	}

}
