package com.juaracoding.utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest extentTest;

    @Before
    public void setUp() {
        // Set up ExtentReports
        extent = new ExtentReports("ExtentReport.html", true);

        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "C://chromedriver-win64//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        // End the test in ExtentReports
        if (extentTest != null) {
            extentTest.log(LogStatus.INFO, "Test finished");
        }
        // Flush the report
        extent.flush();
    }
}
