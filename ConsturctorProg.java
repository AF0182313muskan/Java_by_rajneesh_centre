package com.muskan;
//without this
public class ConsturctorProg {
	String name;
	 String empid;
	 int salary;
	 static String companyName;
	
	ConsturctorProg(String name1,String empid1,int salary1){
		name = name1;
		empid =  empid1;
		salary = salary1;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsturctorProg obj = new ConsturctorProg("muskan","mus@123",20000);
		ConsturctorProg.companyName="TCS";
		System.out.println("The data is : "+obj.empid+ " " +obj.name+ " " +obj.salary
				+ " " +ConsturctorProg.companyName);

	}

}
