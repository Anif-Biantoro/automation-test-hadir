package com.juaracoding.utils;

import com.juaracoding.drivers.DriverSingleton;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public static WebDriver driver;
    @Before
    public void  setUp(){
        DriverSingleton.getInstance(Constant.CHROME);
        driver = DriverSingleton.getDriver();
    }
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}