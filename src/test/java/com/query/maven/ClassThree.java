package com.query.maven;

import org.testng.annotations.Test;

/**
 * Created by chandrad on 1/16/17.
 */
public class ClassThree {


    @Test
    public void testOne(){
        System.out.println("Thread id = " + Thread.currentThread().getId());
        System.out.println("Hashcode of webDriver instance = " + LocalDriverManager.getDriver().hashCode());
        LocalDriverManager.getDriver().get("https://www.adobe.com");
    }

    @Test
    public void testTwo(){
        System.out.println("Thread id = " + Thread.currentThread().getId());
        System.out.println("Hashcode of webDriver instance = " + LocalDriverManager.getDriver().hashCode());
        LocalDriverManager.getDriver().get("https://www.skype.com");
    }
}
