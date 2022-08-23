package Multilevel_inheri_QByR;

import java.util.Scanner;

public class Inheritence3 extends Inheritence2 {
	public void grade(){

		 System.out.println("result is : "+per);
		if(per>=90 && per<=100) {
			System.out.println("A+ grade");
		}
		else if(per>=80 &&  per<=90) {
			System.out.println("A grade");
		}
		else if(per>=70 && per<=80) {
			System.out.println("B grade");
		}
		else if (per>=60 && per<=70){
			System.out.println("C grade");
		}
		else if (per>=50 && per<=60){
			System.out.println("D grade");
		}
		else if(per<50) {
			System.out.println("Fail");
		}
		else {
			System.out.println("invalid");
		}
		
		
	}

}
