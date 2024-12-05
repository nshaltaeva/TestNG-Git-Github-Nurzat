package org.qafellas.tests;

import org.testng.annotations.Test;

public class ExampleTests {

    @Test(description = "set up step", priority = 1 )
    public void setUp(){
        System.out.println("This is a set up step");
    }

    @Test
    public void test1(){
        System.out.println("This is test1");
    }

    @Test
    public void atest2(){
        System.out.println("This is test2");
    }

    @Test(enabled = false)
    public void test3(){
        System.out.println("This is test2");
    }

    @Test(priority = 2)
    public void tearDown(){
        System.out.println("This is tear down step");
    }
}
