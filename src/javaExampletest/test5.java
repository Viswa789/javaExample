package javaExampletest;



public class test5 {
	
	public static void name(test5 s) {
		System.out.println(s.name);
	}
	
		int rollno;
		String name;
	static String college = "iittts";
	test5(){}
	 test5(int rollno,String name) {
		this.rollno = rollno;
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		test5 s1=new test5(101,"sundeep");

		test5 s2=new test5(102,"jai");
	
		test5.college = "ok finnee";
		
		s1.display();name(s1);
		s2.display();
		
		
		
	}

	private void display() {
		System.out.println(rollno+" "+name+" "+ college);
		
	}

}
