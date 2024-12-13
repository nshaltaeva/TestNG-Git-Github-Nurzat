package org.qafellas.tests;

import org.qafellas.functions.ArithmeticFunctions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ArithmeticTests {
    ArithmeticFunctions arithmeticFunctions;
    SoftAssert softAssert;
    @BeforeClass(groups = "smoke")
    public void setup(){
        arithmeticFunctions = new ArithmeticFunctions();
        softAssert = new SoftAssert();
    }

    @Test(groups = "smoke")
    public void calculationTest(){
        softAssert.assertTrue(arithmeticFunctions.addition(5,4)==9);
        //Assert.assertTrue(arithmeticFunctions.addition(5,4)==9);

        softAssert.assertEquals(arithmeticFunctions.subtraction(9,7),2);
        //Assert.assertEquals(arithmeticFunctions.subtraction(9,7),2);

        int actualMultiplicationResult = arithmeticFunctions.multiply(6,5);
        int expectedMultiplicationResult = 30;
        softAssert.assertEquals(actualMultiplicationResult, expectedMultiplicationResult);
        //Assert.assertEquals(actualMultiplicationResult, expectedMultiplicationResult);

        softAssert.assertEquals(arithmeticFunctions.divide(3,10),0.3);
        //Assert.assertEquals(arithmeticFunctions.divide(3,10),0.3);

        softAssert.assertAll();


    }
}
