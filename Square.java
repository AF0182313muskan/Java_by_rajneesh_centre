package interfaceprog;
class Square implements Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square obj = new Square();
		obj.shape();
		

	}
	public void shape() {
		int a= 10;
		System.out.println("Area of Square is = "+(a*a));
		
	}

}
