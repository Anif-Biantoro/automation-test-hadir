package com.juaracoding.utils;

import com.juaracoding.drivers.DriverSingleton;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.*;

public class Hooks {

    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static ExtentReports reports = new ExtentReports("target/extent-report.html");


    @Before
    public void setUp() {
        // Reset testCount if it exceeds the number of scenarios
        if (Utils.testCount >= ScenarioTest.values().length) {
            Utils.testCount = 0; // Reset test count to avoid out-of-bounds
        }

        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        ScenarioTest[] test = ScenarioTest.values();
        extentTest = reports.startTest(test[Utils.testCount].getScenarioTestName());
        Utils.testCount++;
    }

    @AfterStep
    public void getResultStatus(Scenario scenario) throws IOException {
        if (scenario.isFailed()){
            String screenshotPath = Utils.getScreenshot(driver, scenario.getName().replace(" ","_"));
            extentTest.log(LogStatus.FAIL,scenario.getName()+"\n"
                    +extentTest.addScreenCapture(screenshotPath));
        }
    }

    @After
    public void endTestScenario(){
        reports.endTest(extentTest);
        reports.flush();
    }

    @AfterAll
    public static void finish(){
        DriverSingleton.delay(4);
        DriverSingleton.closeObjectInstance();
    }
}
