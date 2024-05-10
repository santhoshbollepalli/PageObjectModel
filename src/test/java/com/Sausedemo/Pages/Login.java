package com.Sausedemo.Pages;

import com.Sausedemo.Utility.Baseclass;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class Login extends Baseclass {
    //Objects
   static By txt_username = By.xpath("//input[@id='user-name']");
   static By txt_password = By.xpath("//input[@id='password']");
   static By login = By.xpath("//input[@id='login-button']");

    //Functionality
    public static void loggin() throws Exception{
        driver.findElement(txt_username).sendKeys("problem_user");
        //Thread.sleep(3000);
        driver.findElement(txt_password).sendKeys("secret_sauce");
        driver.findElement(login).click();
        System.out.println("Login Successful");
        Reporter.log("Loggin into application");
    }
}
