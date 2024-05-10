package com.Sausedemo.Testcases;

import com.Sausedemo.Pages.AddtoCart;
import com.Sausedemo.Pages.Login;
import com.Sausedemo.Pages.ProductCheckout;
import com.Sausedemo.Utility.Baseclass;
import org.testng.annotations.Test;

public class TC03_Checkout {
    @Test
    public static void prodcheckout() throws Exception{
        Baseclass.openApplication();
        Login.loggin();
        AddtoCart.Addtocart();
        ProductCheckout.ProductChechkout("Bollepalli","Santhosh","507303");
        ProductCheckout.click_on_continue_btn();
        Thread.sleep(3000);
        Baseclass.applicationClosed();

    }
}
