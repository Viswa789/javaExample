package javaExampletest;

interface interfacee {
	
	public void same();
}

class A implements interfacee{
	public String a="classA";
	
	public void same() {
		System.out.println("same class-A");
	}
	
	public void classA() {
		System.out.println("classA");
	}

}

class B extends A implements interfacee{
	
	public String b="classB";
	
	public void same() {
		System.out.println("same class-B");
	}
	
	public void classB() {
		System.out.println("class-B");
	}

}

class C extends B implements interfacee{
	
	public String c="classC";
	
	public void same() {
		System.out.println("same class-C");
	}
	public void classC() {
		System.out.println("class-C");
	}

}

class D extends C implements interfacee{
	
	public String d="class D";

	public void same() {
		System.out.println("same class-D");
	}
	
	public void classD() {
		System.out.println("class-D");
	}	
}

class Q {
	 interfacee r= new C();
	 {r.same();}
}



public class upcastingNdowncasting {

	public static void main(String[] args) {
		
		
		//upcasting all possibilities
		
				A t=new D();
						t.same();//overriding to D
						t.classA();
						System.out.println(t.a);
						//not possible to access other classes B,C,D
						//t.classD();
						
						
				B y=new D();   System.out.println("\n");
						y.same();//overriding to D
						y.classA();
						System.out.println(y.a);
						y.classB();
						System.out.println(y.b);
						//not possible to access other classes C,D
						
						
 				C u=new D();      System.out.println("\n");
						u.same();//overriding to D
						u.classA();
						System.out.println(u.a);
						u.classB();
						System.out.println(u.b);
						u.classC();
						System.out.println(u.c);
						//not possible to access class D
						
						
				D i=new D();    System.out.println("\n");
						i.same();//overriding to D
						i.classA();
						System.out.println(i.a);
						i.classB();
						System.out.println(i.b);
						i.classC();
						System.out.println(i.c);
						i.classD();
						System.out.println(i.d);
						
						//downcasting
						D j=(D)t;
						
						Q qw=new Q();
						
						
						//upcasting equal to (A aw=new D();)
						D rt=new D();
						A aw=(A) rt;

	}

}
