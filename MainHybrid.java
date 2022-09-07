package inheritence;

public class MainHybrid extends Hybrid2 implements HybridMulInter1   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainHybrid obj = new MainHybrid();
		obj.circle();
		obj.circum();
		obj.square();
		obj.triangle();

	}

	@Override
	public void square() {
		int s=54;
		System.out.println("Area of square is = "+(s*s));
		
	}

	@Override
	public void triangle() {
	int b=12, h=47;
	System.out.println("Area of triangle is = "+(0.5*b*h));
		
	}

}
