package org.qafellas.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations2 {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class runs before test class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class runs after test class");
    }

    @Test
    public void test3(){
        System.out.println("TC3");
    }

    @Test
    public void test4(){
        System.out.println("TC4");
    }
}
