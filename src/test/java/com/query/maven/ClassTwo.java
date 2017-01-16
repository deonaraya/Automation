package com.query.maven;

import org.testng.annotations.Test;

public class ClassTwo extends BaseTest {
	
	@Test
	public void yahooLoad(){
		System.out.println("Test Case yahoo " + getClass().getSimpleName()
                + " with Thread Id:- " + Thread.currentThread().getId());


		driver.get("https://www.yahoo.com");

		
		}
	
	@Test
	public void olaLoad(){
		System.out.println("Test Case ola " + getClass().getSimpleName()
                + " with Thread Id:- " + Thread.currentThread().getId());

		driver.get("https://www.ola.com");
		
		
		}
	
	



}
