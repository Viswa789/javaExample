package javaExampletest;

class q1 {
	q1 (){
		System.out.println("Q cons");
	}
	
	int a = 11;
	public void patient() {
		System.out.println("class Q");
	}
}

class a1 extends q1{
	
	a1(){
		System.out.println("A cons");
	}
	
	protected int a=10;
	
	public void patient() {
		System.out.println("class A");
	}
}

class b1 extends a1{
	b1(){
		System.out.println("B cons");
	}
	
	protected int a = 20;
	public void patient() {
		System.out.println("class B");
	}
}

public class privateMethod {

	public static void main(String[] args) {
		
		q1 h = new b1();
		h.patient();
		System.out.println(h.a);

	}

}
