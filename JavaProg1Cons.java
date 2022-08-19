package java_constructor;

import java.util.Scanner;
//by using cons
//empid name salary company
//without using this
public class JavaProg1Cons {
      String name;
	 String empid;
	float salary;
	 static String CompanyName;
	
	JavaProg1Cons(String name1,String empid1,float salary1){
		name =name1;
		empid=empid1;
		salary=salary1;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1,empid1;
		float salary1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee details");
		System.out.println("Enter a name");
		name1=sc.nextLine();
		System.out.println("Enter a employee id");
		empid1=sc.nextLine();
		System.out.println("Enter a salary");
		salary1=sc.nextFloat();	
				JavaProg1Cons obj = new JavaProg1Cons(name1,empid1,salary1);
				JavaProg1Cons.CompanyName="TCS";
				System.out.println(obj.name+ " " +obj.empid+" "
						+obj.salary+ " "+JavaProg1Cons.CompanyName);
				
				
		

	}

}
