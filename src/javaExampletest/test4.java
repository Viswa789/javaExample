package javaExampletest;

class tt{
	int a = 11;
	public void name() {
		System.out.println("class tt");
	}
	
	public void name(int i) {
		
	}
	
	public int name(String k) {
		return 10;
	}
}


public class test4 {

	public void test4() {System.out.println("OOOOOOOOOOOOOOOOOOOO");}
	public static void main(String[] args) {
		test4 p = new test4();
		tt i = new tt();
		tt k = new tt();k = i;
		i.a = 200;System.out.println(i.a);
		i.name();
		System.out.println(k.a);
		
		if(true) {
			throw new ArithmeticException("not valid");
		}else {System.out.println("eligible to vote");}
		
	}

}
