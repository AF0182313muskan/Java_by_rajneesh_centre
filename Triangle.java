package interfaceprog;

public class Triangle implements Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle obj = new Triangle ();
		obj.shape();

	}

	
		public void shape() {
			int base= 10,height =20;
			System.out.println("Area of triangle is = "+(0.5*base*height));
	}
}
