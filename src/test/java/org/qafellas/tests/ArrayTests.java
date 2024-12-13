package org.qafellas.tests;

import org.qafellas.functions.ArrayFunctions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayTests {
    ArrayFunctions arrayFunctions;
    @Test(description = "should find the sum of array elements")
    public void sumOfElements(){
         arrayFunctions = new ArrayFunctions();
        int [] arr = {2,3,4,7,8};
        Assert.assertEquals(arrayFunctions.sumOfElements(arr), 24);
    }

    @Test(groups = "smoke")
    public void findMaxNum(){
        arrayFunctions = new ArrayFunctions();
        int [] arr = {9,3,78,-5,0};
        Assert.assertEquals(arrayFunctions.maxNum(arr),78);
    }
}
