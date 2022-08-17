package com.muskan;

public class ConstructorThis {
	String name;
	String empid;
	int salary;
	static String companyName;
	 ConstructorThis(String name, String empid, int salary )
	 {
		 this.empid=empid;
		 this.name =name ;
		 this.salary = salary;	 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorThis obj = new ConstructorThis("mus123","Muskan",20000);
		ConstructorThis.companyName="TCS";
		System.out.println("the data is : "+obj.name+ " " +obj.empid+ " "
				+obj.salary+ " "+ConstructorThis.companyName);
		ConstructorThis obj1 = new ConstructorThis("neha123","neha",20000);
		System.out.println("the data is : "+obj1.name+ " " +obj1.empid+ " "
				+obj1.salary+ " "+ConstructorThis.companyName);
		
		

	}

}
