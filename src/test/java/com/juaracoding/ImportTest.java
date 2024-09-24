package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.ImportPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class ImportTest {

    public static final Logger log = LoggerFactory.getLogger(ImportTest.class);

    private WebDriver driver;
    private ExtentTest extentTest;

    private LoginPage loginPage;
    private ImportPage importPage = new ImportPage();

    public ImportTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //0001
    @Given("I am logged into Hadir page and clicked the import menu")
    public void i_am_logged_into_hadir_page_and_clicked_the_import_menu(){
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        driver.get(Constants.URL1);
        loginPage = new LoginPage();
        importPage = new ImportPage();
        loginPage.login("admin@hadir.com", "admin@hadir");
        DriverSingleton.delay(1);
        loginPage.setBtnLogin();
        DriverSingleton.delay(1);
        importPage.setImportAbsen();
        extentTest.log(LogStatus.PASS, "I am logged into Hadir page and clicked the import menu");
    }

    @When("I click choose and upload the required file")
    public void i_click_choose_and_upload_the_required_file(){
        DriverSingleton.delay(2);
        importPage.setChooseFile();
        extentTest.log(LogStatus.PASS, "I click choose and upload the required file");
    }

    @And("I click the import button")
    public void i_click_the_import_button() {
        DriverSingleton.delay(2);
        importPage.setBtnImport();
        extentTest.log(LogStatus.PASS, "I click the import button");
    }

    @Then("I should see success alert")
    public void i_should_see_sucess_alert(){
        DriverSingleton.delay(2);
        importPage.getImportSucess();
        Assert.assertEquals(importPage.getImportSucess(), "Berhasil import excel");
        extentTest.log(LogStatus.PASS, "I should see success alert");
        loginPage.logout();
    }

    //0002
    @When("I click the import button without choosing file")
    public void i_click_the_import_button_without_choosing_file(){
        DriverSingleton.delay(2);
        importPage.setBtnImport();
        extentTest.log(LogStatus.PASS, "I click the import button without choosing file");
    }

    @Then("I should see need a required file")
    public void i_should_see_need_a_required_file(){
        DriverSingleton.delay(2);
        importPage.isRequiredFile();
        Assert.assertEquals(importPage.isRequiredFile(), true);
        extentTest.log(LogStatus.PASS, "I should see need a required file");
    }

    //0003
    @When("I click choose and upload with the wrong file")
    public void i_click_choose_and_upload_with_the_wrong_file(){
        DriverSingleton.delay(2);
        importPage.setWrongFile();
        extentTest.log(LogStatus.PASS, "I click choose and upload the wrong file");
    }

    @Then("I should see wrong format alert")
    public void i_should_see_wrong_format_alert(){
        DriverSingleton.delay(2);
        importPage.getImportSucess();
        Assert.assertEquals(importPage.getImportSucess(), "Gagal import excel");
        extentTest.log(LogStatus.PASS, "I should see wrong format alert");
        loginPage.logout();
    }
}
