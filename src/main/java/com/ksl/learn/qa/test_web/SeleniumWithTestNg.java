package com.ksl.learn.qa.test_web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class SeleniumWithTestNg {
	
	
	
	WebDriver driver ;
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Starting Test On Chrome Browser");
		
	}
	
	 
	@Test(dataProvider = "name" )
	public void test01() {
	  
	      String url = "https://www.google.com/";
			System.setProperty("webdriver.chrome.driver", "/tmp/chromedriver");

	         
	        System.out.println("Launching Google Chrome browser"); 
	        driver = new ChromeDriver();
	        driver.get(url);
	        String testTitle = "Free For Everyone";
	        String originalTitle = driver.getTitle();
	        Assert.assertEquals(originalTitle, testTitle);
  }
	

	
	@AfterMethod
	public void afterMethod() {
		driver.close();
		System.out.println("Finished Test On Chrome Browser");
	}
	
	
	@Test
	public void test02() {
		Response response = RestAssured.get("http://.google.com");
		System.out.println(response.statusCode());
		System.out.println(response.asString());
		System.out.println(response.body().asString());
		System.out.println(response.statusLine());
		int status = response.getStatusCode();
		Assert.assertEquals(status, 200);
				
	}
	
	@Test
	public void test03() {
		Actions ac = new Actions(driver);
//		Action mouseover =  ac.moveToElement(2).build();
		
//		mouseover.perform();
	}
	}
	



