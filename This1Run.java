package com.muskan;

public class This1Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This1method obj = new This1method();
		This1method.compnayName="TCS";
		obj.method("Muskan", "Muskan123", 20000);
		System.out.println("the data is : "+obj.name+ " " +obj.empid+
				" " +obj.salary+ " "+This1method.compnayName );
		This1method obj1 = new This1method();
		obj1.method("neha", "neha123", 20000);
		System.out.println("the data is : "+obj1.name+ " " +obj1.empid+
				" " +obj1.salary+ " "+This1method.compnayName );
		
		

	}

}
