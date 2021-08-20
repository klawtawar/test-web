package com.ksl.learn.qa.test_web;

public class ExpalinThis {
	
	public static void main(String[] args) {
		
		 Rectangle r1 = new Rectangle(); 	    //Invoke current class constructor	 
		 
		
	}

}



class Rectangle{
	

	public Rectangle(){

	  this(10, 20);  //Pass an argument in the constructor call
		//  this.square("Law"); //Invoke current class method
	  this.square2();



	}
	
	public Rectangle(int l, int b){
		//Return the current class object

		System.out.println(l  + " " + b);
		
	}
	
	public void square(String str) {  
		System.out.println("Hi Square" + str);
	}
	
	public void square2() {
		this.square("Kunal"); //Pass an argument in the method call
		System.out.println("Hi Square2");
	}
	
}
