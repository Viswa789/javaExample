package javaExampletest;

class i1{
	int u = 123;
	i1(){System.out.println("cons of i1");}
}

class i2 extends i1{
	i2(){System.out.println("cons od i2");}
	
}


public class inheretenceflow extends i2 {
	inheretenceflow (){System.out.println("cons of inheretenceflow ");}
	public static void main(String[] args) {
		inheretenceflow y = new inheretenceflow ();
		
		System.out.println(y.u);//it checks one by one (follows error in each) finally reches "u" variable in parent class
		

	}

}
