package com.automation.listeners;

import com.automation.utils.DriverManager;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;

public class AllureReportManager {
    public static void attachScreenshot() {
        TakesScreenshot screenshot = (TakesScreenshot) DriverManager.getDriver();
        byte[] b = screenshot.getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("screenshot", new ByteArrayInputStream(b));
    }

    public static void attachLog(String message) {
        Allure.addAttachment("message", message);
    }
}
