package com.ksl.learn.qa.test_web;

public class ArrayLeet01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int[] nums = {2,7,11,15};
	        
	        int target = 9;
	        int k = 0 ;
	        
	        for(int i=0; i<nums.length; i++){
	        	
	        	for(int j=0; j<nums.length; j++) {
	        		
	        		if(i!=j) {
	        			int sum = nums[i] + nums[j];
	        			if(sum==target){
	        				System.out.println("Sum" + nums[i] + nums[j]);
	        				
	        			}
	        		}
	        	}
	        }
}}