package com.query.maven;

import org.testng.annotations.Test;

/**
 * Created by chandrad on 1/16/17.
 */
public class ClassFour {


    @Test
    public void testThree(){
        System.out.println("Thread id = " + Thread.currentThread().getId());
        System.out.println("Hashcode of webDriver instance = " + LocalDriverManager.getDriver().hashCode());
        LocalDriverManager.getDriver().get("https://www.amazon.in");
    }

    @Test
    public void testFour(){
        System.out.println("Thread id = " + Thread.currentThread().getId());
        System.out.println("Hashcode of webDriver instance = " + LocalDriverManager.getDriver().hashCode());
        LocalDriverManager.getDriver().get("https://www.jabong.com");
    }
}
