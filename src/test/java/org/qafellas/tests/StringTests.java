package org.qafellas.tests;

import org.qafellas.functions.StringFunctions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringTests {

    @Test(description = "should convert a String to uppercase")
    public void upperCaseTest(){
        StringFunctions sf = new StringFunctions();
        String str = "Orlando";
        String expected = "ORLANDO";
        String actual = sf.toUpperCase(str);
        //verify the result
        Assert.assertEquals(actual,expected, "It is not matching");
    }
}
