package javaExampletest;

public class test3 {

	public static int assignment() {
	    int number = 1;
	    try {
	        number = 3;
	        if (true) {
	            throw new Exception("Test Exception");
	        }
	        number = 2;
	    } catch (Exception ex) {
	        return number;
	    } finally {
	        number = 4;
	    }
	    return number;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(assignment());
	}

}
