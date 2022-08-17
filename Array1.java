package com.muskan;
//smaller number in array
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[5];
		System.out.println("Enter a number");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		int temp =a[0];
		for(int i=0;i<a.length;i++) {
			if(temp>a[i]) {
				temp = a[i];
			}
		}
		System.out.println("The smaller no are : "+temp);
	}
}
