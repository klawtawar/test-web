package com.ksl.learn.qa.test_web;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SleniumTest {

	public static void main(String[] args) {

		WebDriver driver;		
		
		System.setProperty("webdriver.chrome.driver", "/Users/kunallawtawar/Downloads/selenium/drivers/chromedriver");
		
		driver = new ChromeDriver();
		
		
		

		
		  driver.get("https://www.google.com/"); List<WebElement> listOfElements =
		  driver.findElements(By.xpath("//div")); System.out.print(listOfElements);
		  
		  driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a")).click();
		  
		  driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("username"
		  );
		  
		  
		  driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("passkey")
		  ;
		  
		  
		  
		  driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click(
		  );
		  
		  driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).submit
		  (); driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).
		  getText();
		  
		  
		  
		  WebElement textDemo = driver.findElement(By.xpath(
		  "//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button"
		  ));
		  
		  
		  
		  
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  
		  if(textDemo.isDisplayed()) { System.out.println("Userid not exist"); }
		  
		  String title = driver.getTitle(); System.out.println(title);
		 
		
		driver.quit();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
