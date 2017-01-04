package com.query.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne extends BaseTest {
	
	@Test
	public void myntraLoad(){
		
		driver.get("http://myntra.com");
//		Assert.assertEquals(driver.getCurrentUrl(), "http://myntra.com");
		
		System.out.println("Test Case myntra " + getClass().getSimpleName()
                + " with Thread Id:- " + Thread.currentThread().getId());
	
		}
	
	@Test
	public void googleLoad(){
		
		driver.get("http://google.com");
//		Assert.assertEquals(driver.getCurrentUrl(), "http://google.com");
		
		System.out.println("Test Case google " + getClass().getSimpleName()
                + " with Thread Id:- " + Thread.currentThread().getId());
		}
	
	
	

}
