package com.automation.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentListener implements ITestListener {
    public void onStart(ITestContext context) {
        ExtentReportManager.initExtentReport();
    }

    public void onFinish(ITestContext context) {
        ExtentReportManager.flush();
    }

    public void onTestStart(ITestResult result) {
        ExtentReportManager.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        ExtentReportManager.getExtentTest().pass(result.getTestName() + " Passed");
    }

    public void onTestFailure(ITestResult result) {
        ExtentReportManager.attachScreenShot();
        ExtentReportManager.getExtentTest().fail(result.getThrowable().getMessage());
    }

    public void onTestSkipped(ITestResult result) {
        ExtentReportManager.getExtentTest().skip("Test skipped");
    }
}
