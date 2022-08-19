package java_constructor;

public class Constructor1{
    Constructor1()
     {
    	 //System.out.println("Happy birthday Shubham ");
    	// System.out.println("Hello Ragini");
    	 }
	void hello()
	{
		this.hii();
	}
	public void hii()
	{
		System.out.println("Hello ranjeet");
	}
	Constructor1(int length,int breadth)  // parameterized constructor
	{
		System.out.println("Area of rectangle:"+length*breadth);
		System.out.println("Hello neha");
	}
	Constructor1(int side)  // parameterized constructor
	{
		System.out.println("Area of square:"+side*side);
		System.out.println("Hello ragini");
	}
	public static void main(String[] args) {
		//Constructor1 obj=new Constructor1();
		Constructor1 obj=new Constructor1(4);
		obj.hello();
		//System.out.println("Hello muskan");
		
	}
}
