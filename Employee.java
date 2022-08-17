package com.muskan;
public class Employee {
	String empid;  
	String name;
	static String CompanyName;
	int salary ;
	 public void method1(String empid,String name, int salary) 
	 {
		   this.empid = empid;
		   this.name = name;
		   this.salary = salary;
		  // System.out.println(empid+ " "+name+ " " +CompanyName+ " " +salary);   
		}
	
	public static void main(String[] args) {
		Employee obj1=new Employee();
		Employee obj2=new Employee();
		Employee.CompanyName="Accenture";
        obj1.method1("muskan123", "Muskan", 200000);
        System.out.println(obj1.name+ " " +obj1.empid+ " " +obj1.salary+
        		" " +Employee.CompanyName);
	}
      
}
