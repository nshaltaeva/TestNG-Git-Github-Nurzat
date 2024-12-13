package org.qafellas.tests;

import org.qafellas.functions.StringFunctions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StringTests {
    StringFunctions sf;

    @BeforeClass
    public void setUp(){
        sf = new StringFunctions();
    }

    @Test(description = "should convert a String to uppercase")
    public void upperCaseTest(){

        String str = "Orlando";
        String expected = "ORLANDO";
        String actual = sf.toUpperCase(str);
        //verify the result
        Assert.assertEquals(actual,expected, "It is not matching");
    }

    @Test(description = "should reverse a string successfully")
    public void reverseString(){

        String str = "cap";
        Assert.assertEquals(sf.reverseString(str),"pac");
    }
}
