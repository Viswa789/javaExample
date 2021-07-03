package javaExampletest;

public class mainOverloading {
	
	public static void main(String []args) {
		String k = "okk";
		int [] a = {1,2,3};
		main(a);
		main(k);
		
		//main(args);//stack over flow error
		
	}
	
public static void main(int []args) {
		System.out.println(args);
		for (int i : args) {
			System.out.println(i);
		}
	}

public static void main(String a) {
	System.out.println(a);
}

}
