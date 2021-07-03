package javaExampletest;

class cons{
	consNDmethodPara ui;
	cons(){}
	cons(consNDmethodPara ho){
		this.ui = ho;
	}
	void setobj(consNDmethodPara ho) {this.ui = ho;}
	void display() {System.out.println("satic content : "+ui.g);}
}

public class consNDmethodPara {
		public int g = 505;
		static void ma() {System.out.println("satic method in consNDmethodPara : ");}
	public static void main(String[] args) {
		consNDmethodPara fg = new consNDmethodPara();
		cons co1 = new cons(fg); //constructor injection//work fine
		co1.display();
		//cons co = new cons(); 
		//co.setobj(fg);//sending through obj reference variable//work fine
		//fg.sendobj();//sending through method//giving error (nullpointer)
		//co.display();
	}
	void sendobj() {
		consNDmethodPara nh=new consNDmethodPara();
		cons jj=new cons();
		System.out.println("satic content : "+nh.g);
		jj.setobj(nh);
	}

}
