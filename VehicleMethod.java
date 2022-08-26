package abstraction;

public class VehicleMethod {
	public void car1(){
		car obj = new car();
		obj.design();
		obj.colour();
		obj.price();
		System.out.println("The car price is : "+obj.price()+ "Rs");
		obj.startwith();
		System.out.println();
	}
	public void truck1()
	{
		truck obj1 = new truck();
		obj1.design();
		obj1.colour();
		obj1.price();
		System.out.println("The truck price is : "+obj1.price()+ "Rs");
		obj1.startwith();
		System.out.println();
	}
	public void bike() {
		bike obj2 = new bike();
		obj2.design();
		obj2.colour();
		obj2.price();
		System.out.println("The bike price is : "+obj2.price()+ "Rs");
		obj2.startwith();
		System.out.println();
	}
	
	public void scooty1() {
		scooty obj3 = new scooty();
		obj3.design();
		obj3.colour();
		obj3.price();
		System.out.println("The scooty price is : "+obj3.price()+ "Rs");
		obj3.startwith();
		System.out.println();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 VehicleMethod  obj = new  VehicleMethod();
		 obj.car1();
		 obj.bike();
		 obj.truck1();
		 obj.scooty1();
		
	}
	}
