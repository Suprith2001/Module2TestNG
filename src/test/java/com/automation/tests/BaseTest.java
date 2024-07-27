package com.automation.tests;


import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        DriverManager.createDriver();
        ConfigReader.initProperties();
    }

    @AfterMethod(alwaysRun = true)
    public void cleanUp() {
        DriverManager.getDriver().quit();
    }
}
