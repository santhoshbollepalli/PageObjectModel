package com.Sausedemo.Testcases;

import com.Sausedemo.Pages.AddtoCart;
import com.Sausedemo.Pages.Login;
import com.Sausedemo.Utility.Baseclass;
import org.testng.annotations.Test;

public class TC02_Addtocart {
@Test
    public static void addtocart() throws Exception{
    Baseclass.openApplication();
    Login.loggin();
    AddtoCart.Addtocart();
    Baseclass.applicationClosed();
    }
}
