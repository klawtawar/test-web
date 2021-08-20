package com.ksl.learn.qa.test_web;

public class StaticAndNonStatic {
	
	private static  String company = "ABC";
	private String department = "ABC-DEPARTMENT"; 
	static final int counter = 0;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		StaticAndNonStatic e = new StaticAndNonStatic();
		e.employee(007);
		
		StaticAndNonStatic s = new StaticAndNonStatic();
		s.salary(9000);
		
		StaticClass sc = new StaticClass();
		StaticClass.employee(222222);
		

	}
	
	protected void employee(int id){
		System.out.println(id);
		System.out.println(StaticAndNonStatic.company);
		
		
		System.out.println(counter);

		
		
	}
	
	public void salary(int sal){
		System.out.println(sal);
		System.out.println(StaticAndNonStatic.company);
	//	counter++;
		
		System.out.println(counter);
	}
	public String getFormat() {
	      return this.department;
	   }
	
}


