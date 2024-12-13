package org.qafellas.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

    @Test
    @Parameters({"productName","quantity"})
    public void parametersTest(String product, int amount){
        System.out.println(product);
        System.out.println(amount);
    }
}
