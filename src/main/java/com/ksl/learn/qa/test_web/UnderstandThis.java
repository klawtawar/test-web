package com.ksl.learn.qa.test_web;



class Test {
	int pid = 10;
	String comp = "IBM";
	
	Test(){
		System.out.println("Test Construtor");
	}
	
	public void display(int p, String c) {
	
		this.pid = p;
		this.comp = c;
		this.display();

	}
	
	public void display() {
		
		System.out.println("display test method " + "pid" + pid + "comp" + comp); 

	}

	
}
public class UnderstandThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Test t = new Test();
			t.display();
			t.display(222, "HCL");
			
	}

}
