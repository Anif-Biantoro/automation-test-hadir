package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LemburPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LemburTest {

    public static final Logger log = LoggerFactory.getLogger(ImportTest.class);

    private WebDriver driver;
    private ExtentTest extentTest;

    private LemburPage lemburPage = new LemburPage();

    public LemburTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //0004
    @Given("I am logged into user absen page")
    public void i_am_logged_into_user_absen_page(){
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        driver.get(Constants.URL2);
        lemburPage = new LemburPage();
        lemburPage.login("daffazakaria1@gmail.com", "tugasakhir123");
        DriverSingleton.delay(1);
        lemburPage.setBtnLogin();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS, "I am logged into user absen page");
    }

    @When("I click lembur button and click ajukan")
    public void i_click_lembur_button_and_click_ajukan(){
        DriverSingleton.delay(3);
        lemburPage.setBtnLembur();
        DriverSingleton.delay(2);
        DriverSingleton.refreshPage();
        DriverSingleton.delay(2);
        lemburPage.setBtnAjukanLembur();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "I click lembur button and click ajukan");
    }

    @And("I fill the all text box")
    public void i_fill_the_all_the_box(){
        DriverSingleton.delay(2);
        lemburPage.setKetikMasuk("25 09 2024, 00:70");
        DriverSingleton.delay(2);
        lemburPage.setKetikKeluar("25 09 2024, 01:70");
        DriverSingleton.delay(2);
        lemburPage.setIsiCatatan("testing");
        extentTest.log(LogStatus.PASS, "I fill the all text box");
    }

    @And("I click accept")
    public void i_click_accept(){
        DriverSingleton.delay(2);
        lemburPage.setBtnAccept();
        extentTest.log(LogStatus.PASS, "I click accept");
    }

    @Then("I successfully added new lembur")
    public void i_successfully_added_new_lembur(){
        DriverSingleton.delay(2);
        Assert.assertEquals(lemburPage.getTxtHalamanLembur(), "Halaman Lembur");
        extentTest.log(LogStatus.PASS, "I successfully added new lembur");
    }

    //0005
    @And("I click reset button")
    public void i_click_reset_button(){
        DriverSingleton.delay(2);
        lemburPage.setBtnReset();
        extentTest.log(LogStatus.PASS, "I click reset button");
    }

    @Then("The text box should be empty")
    public void the_text_box_should_be_empty(){
        DriverSingleton.delay(2);
        Assert.assertEquals(lemburPage.cekReset(), "");
        extentTest.log(LogStatus.PASS, "The text box should be empty");
    }

    //0006
    @And("I fill the all text box except jam masuk")
    public void i_fill_the_all_the_box_except_jam_masuk(){
        DriverSingleton.delay(2);
        lemburPage.setKetikMasuk("");
        lemburPage.setKetikKeluar("25 09 2024, 01:70");
        lemburPage.setIsiCatatan("testing");
        extentTest.log(LogStatus.PASS, "I fill the all text box except jam masuk");
    }

    @Then("I should see jam masuk harus di isi")
    public void i_should_see_jam_masuk_harus_di_isi(){
        DriverSingleton.delay(2);
        Assert.assertEquals(lemburPage.getTxtRequiredMasuk(),"Jam masuk harus di isi!");
        extentTest.log(LogStatus.PASS, "I should see jam masuk harus di isi");
    }

    //0007
    @And("I fill the all text box except jam keluar")
    public void i_fill_the_all_the_box_except_jam_keluar() {
        DriverSingleton.delay(2);
        lemburPage.setKetikMasuk("25 09 2024, 00:70");
        lemburPage.setKetikKeluar("");
        lemburPage.setIsiCatatan("testing");
        extentTest.log(LogStatus.PASS, "I fill the all text box except jam keluar");
    }

    @Then("I should see jam keluar harus di isi")
    public void i_should_see_jam_keluar_harus_di_isi(){
        DriverSingleton.delay(2);
        Assert.assertEquals(lemburPage.getTxtRequiredKeluar(),"Jam Keluar harus di isi!");
        extentTest.log(LogStatus.PASS, "I should see jam keluar harus di isi");
    }

    //0008
    @And("I fill the all text box except notes")
    public void i_full_the_all_text_box_except_notes(){
        DriverSingleton.delay(2);
        lemburPage.setKetikMasuk("25 09 2024, 00:70");
        lemburPage.setKetikKeluar("25 09 2024, 01:70");
        lemburPage.setIsiCatatan("");
        extentTest.log(LogStatus.PASS, "I fill the all text box except notes");
    }

    @Then("I should see Masukan minimal 5 karakter")
    public void i_shold_see_masukan_minimal_5_karakter(){
        DriverSingleton.delay(2);
        Assert.assertEquals(lemburPage.getTxtRequiredCatatan(),"Masukan minimal 5 karakter");
        extentTest.log(LogStatus.PASS, "I should see Masukan minimal 5 karakter");
        DriverSingleton.closeObjectInstance();
    }
}
