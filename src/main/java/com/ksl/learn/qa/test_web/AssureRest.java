package com.ksl.learn.qa.test_web;


import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.RestAssured;


public class AssureRest {

	
	String make;
	String model;
	int year;
	
	public AssureRest() {		
	}
	
	public AssureRest(String make, String model, int year) {
		
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	public String toString() {
		return "My car is a " + this.year + " " + this.make + " " + this.model;
	}



@Test
public void testCarSerialization() {
	
	RestAssured.baseURI = "https://www.google.com";
	RequestSpecification request = RestAssured.given();
	
	
	AssureRest myCar = new AssureRest("Aston Martin","DB9",2004);			
	myCar.setMake("mm");
	myCar.getMake();

//	AssureRest response = RestAssured.get("url").body(myCar).asString();
//	response.getMake();
	

	
}
}
