package com.automation.pages;

import com.automation.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

abstract class BasePage {
    WebDriver driver;
    public BasePage()
    {
        driver= DriverManager.getDriver();
        PageFactory.initElements(driver,this);
    }
}
