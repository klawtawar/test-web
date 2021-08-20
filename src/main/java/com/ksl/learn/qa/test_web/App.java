package com.ksl.learn.qa.test_web;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
        System.out.println( "Hello World!1" );
        
        int[] list = {2,4,2,5,6,5,1,4};
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        hm.put(list[0], 0);
        
        for(int i=1; i<list.length; i++ ) {
        	if(hm.containsKey(list[i])) 
        		System.out.println(list[i] + " " + "Duplicate");    	
        	hm.put(list[i], i);
        }
        
        System.out.println(hm.keySet());
        String sheetname = "Sheet1";
        
        try {
			FileInputStream  fs = new FileInputStream("/Users/kunallawtawar/Downloads/abc.xlsx");
			XSSFWorkbook wb;
			try {
				wb = new XSSFWorkbook(fs);
				XSSFSheet sh = wb.getSheet(sheetname);
				XSSFRow rw = sh.getRow(0);
				
				XSSFCell cell  = rw.getCell(1);
				
				System.out.println(rw.getCell(0) + " " + cell);


				
				
			//	System.out.println(cell.getStringCellValue());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File not found");
			
		}
        
        
        
    }
}
