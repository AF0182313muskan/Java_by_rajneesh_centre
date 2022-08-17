package com.muskan;
//ascending
import java.util.Scanner;

public class Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size,temp=0 ;
		System.out.println("Enter a size");
		size=sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter a number");
		for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("the ascending numbers are : ");
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}

	}

}
