package java_constructor;
//by using method
import java.util.Scanner;

public class Prog1method {
	String name;
	 String empid;
	float salary;
	 static String CompanyName;
	 
	 public void details(String name1,String empid1,float salary1) {
		 name= name1;
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
		Prog1method obj = new Prog1method();
		Prog1method .CompanyName="TCS";
		obj.details(name1, empid1, salary1);
		System.out.println(obj.name+ " " +obj.empid+ 
				" " +obj.salary+ " "+Prog1method .CompanyName );
		
		

	}

}
