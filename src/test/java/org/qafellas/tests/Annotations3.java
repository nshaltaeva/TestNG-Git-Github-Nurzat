package org.qafellas.tests;

import org.testng.annotations.*;

public class Annotations3 {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite runs");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite runs");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test runs before every test method");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After test runs after every test method");
    }

    @Test
    public void test5(){
        System.out.println("TC5");
    }

    @Test
    public void test6(){
        System.out.println("TC6");
    }


}
