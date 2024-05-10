package com.Sausedemo.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class Baseclass {
    public static WebDriver driver;
    public static void openApplication(){
        driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        System.out.println("Application Opened");
        Reporter.log("Application closed");
    }
    public static void applicationClosed(){
        driver.quit();
        System.out.println("Application Closed");
        Reporter.log("Application Closed");

    }
}
