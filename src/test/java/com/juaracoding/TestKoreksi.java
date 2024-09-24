package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.KoreksiPage;
import com.juaracoding.pages.LemburPage;
import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestKoreksi {
    private static WebDriver driver;
    static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();
    private static KoreksiPage koreksiPage = new KoreksiPage();

    public TestKoreksi() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    // TCC.HADIR.002
    @Given("user klik menu koreksi")
    public void user_klik_menu_koreksi() {
        koreksiPage.clickMenuKoreksi();
        extentTest.log(LogStatus.PASS, "User klik menu lembur");
        delay(3);
    }

    @When("user input search koreksi")
    public void user_input_search_koreksi() {
        koreksiPage.inputSearch("Dummy Staff");
        extentTest.log(LogStatus.PASS, "User input search koreksi");
        delay(3);
    }

    @And("user klik button search koreksi")
    public void user_klik_button_search_koreksi() {
        koreksiPage.clickSearch();
        extentTest.log(LogStatus.PASS, "user klik button search koreksi");
        delay(3);
    }

    @Given("user klik button reset koreksi")
    public void user_klik_button_reset_koreksi() {
        koreksiPage.clickReset();
        extentTest.log(LogStatus.PASS, "user klik button reset koreksi");
        delay(3);
    }


    @When("user input start date koreksi")
    public void user_input_start_date_koreksi() {
        koreksiPage.startDate("12-07-2024");
        extentTest.log(LogStatus.PASS, "input start date koreksi");
        delay(3);
    }

    @And("user input end date koreksi")
    public void user_input_end_date_koreksi() {
        koreksiPage.endDate("12-07-2024");
        extentTest.log(LogStatus.PASS, "input end date koreksi");
        delay(3);
    }


    //    // TCC.HADIR.003
//    @When("user klik titik tiga")
//    public void user_klik_titik_tiga() {
//        koreksiPage.clickTitikTiga();
//        extentTest.log(LogStatus.PASS, "user klik titik tiga");
//    }
//
//    @And("user klik approval koreksi")
//    public void user_klik_approval_koreksi() {
//        koreksiPage.clickApprov();
//        extentTest.log(LogStatus.PASS, "user klik approval koreksi");
//    }
//
//    @And("user click button setujui")
//    public void user_click_button_setujui() {
//        koreksiPage.clickSetujui();
//        extentTest.log(LogStatus.PASS, "user click button setujui");
//    }
//
//    @Given("user klik reject koreksi")
//    public void user_klik_reject_koreksi() {
//        koreksiPage.clickReject();
//        extentTest.log(LogStatus.PASS, "user klik reject koreksi");
//    }
//    @When("user input alasan reject")
//    public void user_input_alasan_reject() {
//        koreksiPage.alasanReject("Data Tidak Valid");
//        extentTest.log(LogStatus.PASS,"user input alasan reject");
//    }
//
//    @And("user click button tolak")
//    public void user_click_button_tolak() {
//        koreksiPage.clickTolakReject();
//        extentTest.log(LogStatus.PASS, "user click button tolak");
//    }
    public static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
