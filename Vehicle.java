package abstraction;

abstract class Vehicle {
	abstract void design();
	abstract void colour();
	abstract void startwith();
	abstract int price();
	

}
class car extends Vehicle{

	@Override
	void design() {
		System.out.println("The details of car is : ");
		System.out.println("The car is design has Automotive Engineering, "
				+ "Transportation Design");
		
	}

	@Override
	void colour() {
		System.out.println("The car colour is black");
		
	}

	@Override
	void startwith() {
		System.out.println("The car start with Acceletor");
	}

	@Override
	int price() {
		return  8000000;
		// TODO Auto-generated method stub
		
	}
	
}
class truck extends Vehicle{

	@Override
	void design() {
		System.out.println("the details of truck is :");
		System.out.println("the truck design has equipment, axles, suspension and "
				+ "roadwheels, an engine and a drivetrain");
		
	}

	@Override
	void colour() {
	System.out.println("The truck colour is red");
		
	}

	@Override
	void startwith() {
		System.out.println("The truck start with stering");
		
		
	}

	@Override
	int price() {
		// TODO Auto-generated method stub
		return 9000000;
	}
	
}
class bike extends Vehicle {

	@Override
	void design() {
		System.out.println("the details of bike is :");
		System.out.println("The bike design has the front and rear triangles,");
		
	}

	@Override
	void colour() {
		System.out.println("the bike colour is dark green");
		
	}

	@Override
	void startwith() {
		System.out.println("The bike start with self");
	}

	@Override
	int price() {
		// TODO Auto-generated method stub
		return 80000;
	}
	
}
class scooty extends Vehicle{

	@Override
	void design() {
		System.out.println("the details of scooty is :");
		System.out.println("The sccoty design has combines practicality, "
				+ "performance and retro design.");
		
	}

	@Override
	void colour() {
		System.out.println("The scooty colour is baby pink");
		
	}

	@Override
	void startwith() {
		System.out.println("the scooty start with key");
		
	}

	@Override
	int price() {
		// TODO Auto-generated method stub
		return 70000;
	}
	
}