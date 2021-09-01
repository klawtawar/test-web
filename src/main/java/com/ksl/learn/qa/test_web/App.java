package com.ksl.learn.qa.test_web;
import java.io.FileInputStream;
import java.util.ArrayList;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Hello world!
 *
 *
		Create a Collection
		Collection Subtypes
		Add Element to Collection
		Remove Element From Collection
		Add Collection of Objects to Collection
		Remove Collection of Elements From Collection
		Retain All Elements From a Collection in Another Collection
		Checking if a Collection Contains a Certain Element
		Collection Size
		Iterate a Collection
 */
public class App 
{
    public static void main( String[] args ) 
    {

        
        int[] list = {2,4,2,5,6,5,1,4};
        
        Map<String, Integer> hm = new HashMap<String, Integer>();
		/*
		 * Map { "California" , 4 "Arkansas", 2 "texas",1 "florida", 2 "kansas", 1
		 * "missouri", 4 }
		 */
               
        hm.put("California", 4);
        hm.put("Arkansas", 2);
        hm.put("Texas", 1);
        hm.put("florida", 2);
        hm.put("kansas", 1);

               
   //      System.out.println(hm.get("California"));
        

        for (Map.Entry<String, Integer> set : hm.entrySet()) {
		//    System.out.println(set.getKey() + " = " + set.getValue());
		    
		    if(set.getValue() == 2) System.out.println(set.getKey());
		}
         
    //     System.out.println(hm.keySet());
         
         Set<String> keySet = hm.keySet();
         
    //     System.out.println(keySet.containsAll());
                  
         ArrayList<String> listOfKeys = new ArrayList<String>(keySet);
                  
         for(int i=0; i<listOfKeys.size(); i++){
        	 
        	 String str = listOfKeys.get(i);
      //  	 System.out.println(str);
    //    	 System.out.println(hm.get(str));
        	 
        	 if(hm.get(str) == 1) {
        		 
      //  		 System.out.println(str + " " + i);
      		 
        	 }      	 
         }
          
    }
}
