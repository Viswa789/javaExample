package javaExampletest;

class this1{
	
	public thiss i;
	
	
	this1(thiss u) {
		this.i = u;
	
		System.out.println(i.g);
	}
	
	void fff() {
		System.out.println();
	}
	
	this1(int q) {
		//this();
		System.out.println(q);
	}
}

public class thiss {
	
	public int g = 123;
	thiss(){
		System.out.println("constructor thiss");
	}
	
	public static void main(String[] args) {
		thiss rt = new thiss();
		rt.usethis();
		this1 ne1 = new this1(rt);
		this1 ne = new this1(10);
		
		//ne.obj(this);//cannot use this in static area
			//System.out.println(this.g);
	}
	
	void usethis() {
		this.g = 1234;
	System.out.println(this.g);
	}

}
