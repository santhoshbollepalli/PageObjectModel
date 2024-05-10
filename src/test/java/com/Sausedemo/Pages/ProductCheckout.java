package com.Sausedemo.Pages;

import com.Sausedemo.Utility.Baseclass;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ProductCheckout extends Baseclass {
    //Objects
    static By btn_checkout = By.xpath("//button[@id='checkout']");
    static By icon_cart = By.xpath("//a[@class='shopping_cart_link']");
    static By txt_fn = By.xpath("//input[@id='first-name']");
    static By txt_ln =By.xpath("//input[@id='last-name']");
    static By txt_pc =By.xpath("//input[@id='postal-code']");
    static By btn_continue = By.xpath("//input[@id='continue']");

    //functionalties
    public static void ProductChechkout(String fn,String ln,String pc) throws Exception{
        driver.findElement(icon_cart).click();
        driver.findElement(btn_checkout).click();

        driver.findElement(txt_fn).sendKeys(fn);
        Thread.sleep(3000);
        driver.findElement(txt_ln).sendKeys(ln);
        Thread.sleep(3000);
        driver.findElement(txt_pc).sendKeys(pc);
        Thread.sleep(3000);
    }
    public static void click_on_continue_btn(){
        driver.findElement(btn_continue).click();
        Reporter.log("Checked out products");
    }

}
