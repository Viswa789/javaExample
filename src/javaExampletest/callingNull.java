package javaExampletest;

public class callingNull {

	public static void abc(Object o) {
		System.out.println(o);
	}
	
	public static void abc(String s) {
		System.out.println(s);
		
	}
	
	
	public static void main(String[] args) {
		
		abc(null);
		
		//fun(null); compile error ambigivity 
		
		//main(args);
		
		//test1.main(args);
		

	}

	 // Overloaded methods
    public static void fun(Integer i)
    {
        System.out.println("fun(Integer ) ");
    }
    public static void fun(String name)
    {
        System.out.println("fun(String ) "+name);
    }
	
	
}
