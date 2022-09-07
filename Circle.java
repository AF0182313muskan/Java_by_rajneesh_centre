package interfaceprog;

public class Circle implements Interface1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle();
		obj.shape();

	}
	public void shape() {
		int r=4;
		System.out.println("Area of circle is = "+(3.14*r*r));
}
	

}
