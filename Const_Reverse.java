package java_constructor;

import java.util.Scanner;

public class Const_Reverse {
	 Const_Reverse(int num1,int sum,int rem){
		 
			 while(num1>0) {
					rem=num1%10;
					sum=sum*10+rem;
					num1=num1/10;
							}
			 System.out.println("the reverse number : "+sum);
		 }
		 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1,sum=0,rem=0;
		System.out.println("Enter a number");
		num1=sc.nextInt();
		Const_Reverse obj = new Const_Reverse(num1,sum,rem);
		

	}

}
