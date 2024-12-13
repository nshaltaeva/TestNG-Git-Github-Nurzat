package org.qafellas.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations1 {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Running before every method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Running after every method");
    }

    @Test(groups = "smoke")
    public void test1(){
        System.out.println("TC1");
    }

    @Test
    public void test2(){
        System.out.println("TC2");
    }


}
