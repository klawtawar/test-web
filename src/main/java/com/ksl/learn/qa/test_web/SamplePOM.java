package com.ksl.learn.qa.test_web;

import org.openqa.selenium.By;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class SamplePOM {
	
	WebDriver driver;
	
	By SigninClick = By.xpath("//h1");
	By Header = By.xpath("//h1");
	By userName = By.xpath("//*[@id='user_full_name']");
	By businessEmail = By.xpath("//*[@id='user_email_login']");
	By password = By.xpath("//*[@id='user_password']");
	By submitclick = By.xpath("//h1");

	
	public void testpom() {
		String url = "https://www.google.com/";
		System.setProperty("webdriver.chrome.driver", "/tmp/chromedriver");

		driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(SigninClick).click();
		driver.findElement(userName).sendKeys("userid");
		driver.findElement(password).sendKeys("pass");
		driver.findElement(submitclick).click();
		Boolean b = driver.findElement(Header).isDisplayed();
		Assert.assertTrue(b);
		driver.quit();
	}
	
}
