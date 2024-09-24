package com.juaracoding;

import com.juaracoding.pages.LemburPage;
import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestLembur {
    private static WebDriver driver;
    static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();
    private static LemburPage lemburPage = new LemburPage();

    public TestLembur(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    // TCC.HADIR.002
    @Given("user klik menu laporan lembur")
    public void user_klik_menu_laporan_lembur() {
        lemburPage.clickMenuLaporan();
        extentTest.log(LogStatus.PASS,"user klik menu laporan lembur");
        delay(3);

    }
    @When("user klik menu lembur")
    public void user_klik_menu_lembur() {
        lemburPage.clickMenuLembur();
        extentTest.log(LogStatus.PASS,"User klik menu lembur");
        delay(3);
    }
    @And("user input search lembur")
    public void user_input_search_lembur() {
        lemburPage.inputSearch("Husain");
        extentTest.log(LogStatus.PASS,"User input search lembur");
        delay(3);
    }
    @And("user klik button search lembur")
    public void user_klik_button_search_lembur() {
        lemburPage.clickSearch();
        extentTest.log(LogStatus.PASS,"User click button search lembur");
        delay(3);
    }

    // TCC.HADIR.003
    @Given("user klik button reset lembur")
    public void user_klik_button_reset_lembur() {
        lemburPage.clickReset();
        extentTest.log(LogStatus.PASS,"user klik button reset lembur");
        delay(3);
    }

    @When("user input start date lembur")
    public void user_input_start_date_lembur() {
        lemburPage.startDate("25-09-2024");
        extentTest.log(LogStatus.PASS,"input start date lembur");
        delay(3);
    }
    @And("user input end date lembur")
    public void user_input_end_date_lembur() {
        lemburPage.endDate("25-09-2024");
        extentTest.log(LogStatus.PASS,"input end date lembur");
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
