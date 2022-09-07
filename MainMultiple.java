package inheritence;

public class MainMultiple implements MultipleInterface ,MultipleInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainMultiple obj = new MainMultiple();
		obj.square();
		obj.circle();

	}

	@Override
	public void square() {
		int a=54;
		System.out.println("Area of square is = "+(a*a));
	}

	@Override
	public void circle() {
		int r=21;
		System.out.println("Area of circle is = "+(3.10*r*r));
		
	}

}
