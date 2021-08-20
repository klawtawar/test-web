package com.ksl.learn.qa.test_web;

public class StaticClass {
	
	protected static void employee() {
		StaticAndNonStatic sc = new StaticAndNonStatic();
		sc.employee(220);
		
		System.out.println( sc.getFormat() + " " + "static class");
	}
	
	
	protected static void employee(int i) {
		StaticAndNonStatic sc = new StaticAndNonStatic();
		sc.employee(i);
		
		System.out.println( sc.getFormat() + " " + "static class" + " " + i);
	}
	
	public  void sal() {
		//System.out.println(StaticAndNonStatic.company + " " + "static class");
	}
	
}
