package java_constructor;

import java.util.Scanner;

public class Accept_user_data extends inher_demo
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Accept_user_data obj=new Accept_user_data();
		obj.accept();

	}

	public void accept()//by method
	{
		String name;
		int[] m=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		System                                                                                                                                                  .out.println("Enter your name:");
		name=sc.next();
		System.out.println("Enter marks of 5 Subject");
		for(i=0;i<5;i++)
		{
			m[i]=sc.nextInt();
		}
	
		System.out.println("The perecntage is ="+calc(m));
	}
}
