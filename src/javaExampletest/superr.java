package javaExampletest;


class A11{
	{System.out.println("class A11 instancs block");}
	
	A11(){
		System.out.println("class A11 constructor");
	}
	
	void play() {
		System.out.println("class A11 play");
	}
}

class B11 extends A11{
	{System.out.println("class B11 instancs block");}
	
	B11() {
		super();
		System.out.println(" class B11 instancs block");
		}
	
	void play() {
		super.play();
		System.out.println(" class B11 play");
	}
}

public class superr {

	public static void main(String[] args) {
		B11 r = new B11();
		 
		r.play();

	}

}
