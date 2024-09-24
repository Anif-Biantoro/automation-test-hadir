package com.juaracoding;

import com.juaracoding.pages.LaporanSemuaPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.juaracoding.utils.Hooks;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import static com.juaracoding.drivers.DriverSingleton.delay;

public class LaporanSemuaTest {
    private ExtentTest extentTest;

    private WebDriver driver = Hooks.driver;
    private LoginPage loginPage = new LoginPage(driver);
    private LaporanSemuaPage laporanSemuaPage = new LaporanSemuaPage(driver);

    public LaporanSemuaTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //TL.1-1
    @Given("User go to menu laporan semua")
    public void user_go_menu_laporan_semua(){
        driver.get(Constants.URL);
        loginPage.enterEmail("admin@hadir.com");
        delay(1);
        loginPage.enterPassword("admin@hadir");
        delay(2);
        loginPage.clickLoginButton();
        laporanSemuaPage.goToMenuLaporan();
        delay(2);
        laporanSemuaPage.goToMenuSemua();
        extentTest.log(LogStatus.PASS, "User go to menu laporan semua");
    }

    @When("User click start date")
    public void user_click_start_date(){
        delay(10);
        laporanSemuaPage.setButtonCalendar();
        delay(1);
        laporanSemuaPage.startDate();
        extentTest.log(LogStatus.PASS, "User click start date");
    }

    @And("User click end date")
    public void user_click_end_date(){
        laporanSemuaPage.endDate();
        extentTest.log(LogStatus.PASS, "User click end date");
    }

    @And("User click button search")
    public void user_click_button_save(){
        laporanSemuaPage.buttonSearch();
        delay(2);
        extentTest.log(LogStatus.PASS, "User click button search");
    }

    @Then("User get data calendar")
    public void user_get_data_calendar(){
        Assert.assertEquals(laporanSemuaPage.getTxtSearchByCalendar(), "10 Sep 2024");
        extentTest.log(LogStatus.PASS, "User get data calendar");
    }

    //TL.1-2
    @And("User input name")
    public void user_input_name(){
        laporanSemuaPage.searchInputName("Elva Yundra Rindyana");
        extentTest.log(LogStatus.PASS, "User input name");
    }

    @Then("User get data name")
    public void user_get_data_name(){
        Assert.assertEquals(laporanSemuaPage.getTxtSearchByName(), "Elva Yundra Rindyana");
        extentTest.log(LogStatus.PASS, "User get data name");
    }

        //TL.1-3
    @And("User click button reset")
    public void user_click_button_reset(){
        laporanSemuaPage.buttonReset();
        extentTest.log(LogStatus.PASS, "User click button reset");
    }
    @Then("User get text success reset calendar")
    public void user_get_text_success_reset_calendar(){
        Assert.assertEquals(laporanSemuaPage.txtHeaderSemua(), "Semua");
        extentTest.log(LogStatus.PASS, "User get text success reset calendar");
    }

    //TL.1-4
    @And("User input invalid name")
    public void user_input_invalid_name(){
        laporanSemuaPage.searchInputName("Jajang");
        extentTest.log(LogStatus.PASS, "User input invalid name");
    }
    @Then("User did not get data")
    public void user_did_not_get_data(){
        Assert.assertEquals(laporanSemuaPage.getTxtInvalidSearchByName(), "0-0 of 0");
        extentTest.log(LogStatus.PASS, "User did not get data");
    }
}
