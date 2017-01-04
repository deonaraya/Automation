package com.query.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
	
    WebDriver driver;
    
	@Parameters("browser")
	@BeforeClass
	public void setUp(String browser){
		 if(browser.equalsIgnoreCase("firefox"))
	            driver = new FirefoxDriver();
	         else  if(browser.equalsIgnoreCase("chrome"))
	            driver = new ChromeDriver();
	        else {
	            throw new IllegalArgumentException("Invalid browser value!!");
	        }
	}
	
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	

}
