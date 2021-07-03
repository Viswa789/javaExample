package javaExampletest;

interface t1{
default void y1() {
	System.out.println("y1 in interface t1");
	
}
}

class new1{
	public void y1() {
		System.out.println("y1 in class new1");
	}
}


public class test8 extends new1 implements t1{

	public static void main(String[] args) {
		
		test8 k = new test8();
		
		k.y1();//class has high priority
		
	}

}
