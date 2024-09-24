package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.UnitSettingPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UnitSettingStep {

    private ExtentTest extentTest;
    private WebDriver driver = Hooks.driver;
    private LoginPage loginPage = new LoginPage(driver);
    private UnitSettingPage unitSettingPage = new UnitSettingPage(driver);
    public UnitSettingStep() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Admin is on login page for unit setting page")
    public void admin_is_on_login_page_for_unit_setting_page() {
        driver.get("https://magang.dikahadir.com/authentication/login");
    }

    @When("Admin enters valid email and password for unit setting page")
    public void admin_enters_valid_email_and_password_for_unit_setting_page() {
        loginPage.enterEmail("admin@hadir.com");
        delay(1);
        loginPage.enterPassword("admin@hadir");
        delay(1);
    }

    @And("Admin clicks login button for unit setting page")
    public void admin_clicks_login_button_for_unit_setting_page() {
        loginPage.clickLoginButton();
        delay(1);
    }

    @And("Admin should be redirected to dashboard for unit setting page")
    public void admin_should_be_redirected_to_dashboard_for_unit_setting_page() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("dashboard"));
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "User is not redirected to dashboard");
    }

    @And("Admin clicks the management button")
    public void admin_clicks_the_management_button() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(unitSettingPage.getManagementButton())).click();
    }

    @And("Admin clicks unit setting button")
    public void admin_clicks_pendaftaran_user_button() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(unitSettingPage.getUnitSettingButton())).click();
        delay(5);
    }

    @And("Admin clicks Tambahkan")
    public void admin_clicks_tambahkan() {
        unitSettingPage.clickAddButton();
        delay(1);
        extentTest.log(LogStatus.PASS,"Admin clicks Tambahkan");
    }

    @And("Admin selects the department to be added")
    public void admin_selects_department() {
        unitSettingPage.selectDepartment();
        delay(1);
        extentTest.log(LogStatus.PASS,"Admin selects the department to be added");
    }

    @And("Admin clicks Submit")
    public void admin_clicks_submit() {
        unitSettingPage.clickSubmitButton();
        delay(1);
        extentTest.log(LogStatus.PASS,"Admin clicks Submit");
    }

    @Then("The department is successfully added")
    public void department_is_successfully_added() {
        unitSettingPage.getSuccessMessage();
        extentTest.log(LogStatus.PASS,"The department is successfully added");
    }

    @And("Admin clicks Delete")
    public void admin_clicks_delete() {
        unitSettingPage.clickDeleteButton();
        extentTest.log(LogStatus.PASS,"Admin clicks Delete");
    }

    @And("A confirmation message")
    public void admin_sees_confirmation_message(String expectedMessage) {
        unitSettingPage.getConfirmationMessage();
        extentTest.log(LogStatus.PASS,"A confirmation message");
    }

    @And("Admin clicks Ya on the confirmation dialog")
    public void admin_clicks_yes_confirmation() {
        unitSettingPage.clickConfirmYesButton();
        extentTest.log(LogStatus.PASS,"Admin clicks Ya on the confirmation dialog");
    }

    @Then("The department is successfully deleted")
    public void the_department_is_successfully_deleted() {
        unitSettingPage.getSuccessMessage();
        extentTest.log(LogStatus.PASS,"The department is successfully deleted");

    }

    public static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
