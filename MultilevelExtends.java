package inheritence;

public class MultilevelExtends extends Multilevel5 {
	public void result() {
		System.out.println("The results are");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelExtends obj = new MultilevelExtends();
		obj.result(); 
		obj.add();
		obj.subs();
		obj.mul();
		obj.div();
		obj.mod();

	}

}
