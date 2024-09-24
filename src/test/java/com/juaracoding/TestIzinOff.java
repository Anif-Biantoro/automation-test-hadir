package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.IzinOffPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestIzinOff {
    private static WebDriver driver;
    static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();
    private static IzinOffPage izinOffPage = new IzinOffPage();

    public TestIzinOff(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    // TCC.HADIR.002
    @Given("user klik menu laporan")
    public void user_klik_menu_laporan() {
        izinOffPage.clickMenuLaporan();
        extentTest.log(LogStatus.PASS,"user klik menu laporan");
        delay(3);
    }

    @When("user klik menu izinOff")
    public void user_klik_menu_izinOff() {
        izinOffPage.clickMenuIzinOff();
        extentTest.log(LogStatus.PASS,"User klik menu izinOff");
        delay(3);
    }
    @And("user input search")
    public void user_input_search() {
        izinOffPage.inputSearch("Elva");
        extentTest.log(LogStatus.PASS,"User input search");
        delay(3);
    }
    @And("user click button search")
    public void user_click_button_search() {
        izinOffPage.clickSearch();
        extentTest.log(LogStatus.PASS,"User click button search");
        delay(3);
    }

    // TCC.HADIR.003
    @Given("user klik button reset")
    public void user_klik_button_reset() {
        izinOffPage.clickReset();
        extentTest.log(LogStatus.PASS,"user klik button reset");
        delay(3);
    }

    @When("user input start date")
    public void user_input_start_date() {
        izinOffPage.startDate("07-07-2023");
        extentTest.log(LogStatus.PASS,"input start date");
        delay(3);
    }
    @And("user input end date")
    public void user_input_end_date() {
        izinOffPage.endDate("07-08-2023");
        extentTest.log(LogStatus.PASS,"input end date");
        delay(3);
    }

    public static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
