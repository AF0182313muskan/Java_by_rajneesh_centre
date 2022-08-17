package com.muskan;

public class This1Runconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 This1Constructor obj = new  This1Constructor("Muskan","mus123",20000);
		 This1Constructor.companyName="TCS";
		 System.out.println("The data is : " +obj.name+
				 " " +obj.empid+ " " +obj.salary+ " "+This1Constructor.companyName);

	}

}
