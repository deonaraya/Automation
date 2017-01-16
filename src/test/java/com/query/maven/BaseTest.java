package com.query.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
	
    WebDriver driver;
    
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName){
		 if(browserName.equalsIgnoreCase("firefox"))
	            driver = new FirefoxDriver();
	         else  if(browserName.equalsIgnoreCase("chrome"))
	            driver = new ChromeDriver();
	        else {
	            throw new IllegalArgumentException("Invalid browser value!!");
	        }
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
