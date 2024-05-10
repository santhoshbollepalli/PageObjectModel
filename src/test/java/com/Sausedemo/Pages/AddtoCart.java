package com.Sausedemo.Pages;

import com.Sausedemo.Utility.Baseclass;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class AddtoCart extends Baseclass {
    //Objects
    static By btn_backpack = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    static By btn_bikelight = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
    static By btn_jacket = By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");

    //functionalities
    public static void Addtocart (){
        driver.findElement(btn_backpack).click();
        driver.findElement(btn_bikelight).click();
        driver.findElement(btn_jacket).click();
        Reporter.log("Product added into cart");
    }
}
