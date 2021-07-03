package javaExampletest;

public class staticandnonstatic {
	
	static {
		System.out.println("compiling code class executing");
	}

	public static final void name() {
		System.out.println("asdfghjsdg");
		
		int u =23456;
	}
	
	public void name1() {
		System.out.println(12);
	}
	
	public static void main(String[] args) {
		int i= 0; 
		new staticandnonstatic().name2();
		
	}

	public void name2() {
		this.name1();
	}
	
}
