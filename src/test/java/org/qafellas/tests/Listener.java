package org.qafellas.tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
    public void onTestStart(ITestResult result){
        System.out.println(result.getName());
    }
    public void onTestSuccess(ITestResult result){
        System.out.println(result.getName());
    }
    public void onTestFailure(ITestResult result){
        System.out.println(result.getName());
    }
    public void onTestSkipped(ITestResult result){
        System.out.println(result.getName());
    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }

    public void onStart(ITestContext context) {
    }

    public void onFinish(ITestContext context) {
    }

}
