package com.Sausedemo.Testcases;

import com.Sausedemo.Pages.Login;
import com.Sausedemo.Utility.Baseclass;
import org.testng.annotations.Test;

public class TC01_Login {
@Test
    public static void login() throws Exception{
    Baseclass.openApplication();
    Login.loggin();
    Baseclass.applicationClosed();
}
}
