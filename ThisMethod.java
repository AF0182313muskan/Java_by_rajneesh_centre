package com.muskan;

public class ThisMethod {
	String name;
	String empid;
	int salary;
	static String companyName;
	
	public void method(String name,String empid,int salary) {
		this.name=name;
		this.empid=empid;
		this.salary=salary;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ThisMethod obj1 = new  ThisMethod();
		 ThisMethod.companyName="TCS";
		 obj1.method("muskan", "mus123@", 20000);
		 
		 System.out.println(" the data is : " +obj1.name+ " " +obj1.empid+
				 " " +obj1.salary+ " "+ThisMethod.companyName);

	}

}
