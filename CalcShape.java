package interfaceprog;
//multiple inheritance
public class CalcShape implements Shape , Shape1{

	public static void main(String[] args) {
		CalcShape obj = new CalcShape ();
		obj.circle();
		obj.square();
	}
	public void circle() {
		System.out.println("Area of circle is = "+(3.14*r*r));
	}
	public void square() {
		System.out.println("Area of Square is = "+(a*a));
		
	}
}
