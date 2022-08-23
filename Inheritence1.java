package Multilevel_inheri_QByR;

import java.util.Scanner;

public class Inheritence1 {
	int rollno;
	String name;
	int arr[];
	
	public void data() {
		 {
		    	Scanner sc=new Scanner (System.in);
		   
		    	System.out.println("enter your name");
		    	name=sc.next();
		       System.out.println("enter your roll no.");
		       rollno=sc.nextInt();
		       int size;
		       System.out.println("enter a size");
		       size = sc.nextInt();
		       arr =new int[size]; 
		       System.out.println("enter your 5 subjects marks:");
		     for (int i=0;i<5;i++)
		     {
		    	 arr[i]=sc.nextInt();
		     }
		     
		    }
		}
	}


