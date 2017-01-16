package com.query.maven;

import org.testng.annotations.Test;

public class ClassOne extends BaseTest {
	
	@Test
	public void myntraLoad(){
		
		System.out.println("Test Case myntra " + getClass().getSimpleName()
                + " with Thread Id:- " + Thread.currentThread().getId());


		driver.get("https://www.myntra.com");
		
	
		}
	
	@Test
	public void googleLoad(){
		
		System.out.println("Test Case google " + getClass().getSimpleName()
                + " with Thread Id:- " + Thread.currentThread().getId());


		driver.get("https://www.google.com");
		
		}
	
	
	

}
