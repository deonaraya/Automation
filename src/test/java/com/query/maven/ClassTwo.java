package com.query.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {
	
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
	
	@Test
	public void yahooLoad(){
		
		driver.get("http://yahoo.com");
//		Assert.assertEquals(driver.getCurrentUrl(), "http://myntra.com");
		
		System.out.println("Test Case yahoo " + getClass().getSimpleName()
                + " with Thread Id:- " + Thread.currentThread().getId());
	
		}
	
	@Test
	public void adobeLoad(){
		
		driver.get("https://www.olacabs.com/");
//		Assert.assertEquals(driver.getCurrentUrl(), "http://google.com");
		
		System.out.println("Test Case ola " + getClass().getSimpleName()
                + " with Thread Id:- " + Thread.currentThread().getId());
		}
	
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	



}
