package org.qafellas.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    @Test(dataProvider = "getData")
    public void dataProviderTest(String section, String item, int numberOfItems){
        System.out.println("Section: " +section);
        System.out.println("Item: " +item);
        System.out.println("Quantity: "+ numberOfItems);
        System.out.println("-------------------------------");
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data = {
                {"Clothes","Skirt", 3},
                {"Electronics", "iPhone",5},
                {"Toys", "woody",7}
        };
        return data;
    }

}
