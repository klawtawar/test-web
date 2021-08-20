package com.ksl.learn.qa.test_web;

import java.util.Arrays;

public class LargestNuminArray {

	
	public void find(int[] al, int k){
			
		Arrays.sort(al);		
		System.out.println(al[al.length-k]);
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestNuminArray obj = new LargestNuminArray();
		int[] list = {2,7,3,9,5,0,1}; 
		int k = 3;
		obj.find(list, k);

	}

}
