package com.ksl.learn.qa.test_web;

public class UnderstandException {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		
			int a=1, b=0;
			int c= a/b;
			System.out.println(c);
			
		}
		catch(ArrayIndexOutOfBoundsException  e){
			System.out.println("Caught the  ArrayIndexOutOfBoundsException");
		}
		catch(Exception e) {
			System.out.println("Caught the exception");
		}
        finally{
            System.out.println("final statement");
        }
	}}
