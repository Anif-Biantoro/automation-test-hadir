package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.PendaftaranUserPage;
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

public class PendaftaranUserStep {

    private ExtentTest extentTest;
    private WebDriver driver = Hooks.driver;
    private LoginPage loginPage = new LoginPage(driver);
    private PendaftaranUserPage pendaftaranUserPage = new PendaftaranUserPage(driver);
    public PendaftaranUserStep() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Admin is on login page for pendaftaran user page")
    public void admin_is_on_login_page_for_pendaftaran_user_page() {
        driver.get("https://magang.dikahadir.com/authentication/login");
    }

    @When("Admin enters valid email and password for pendaftaran user page")
    public void admin_enters_valid_email_and_password_for_pendaftaran_user_page() {
        loginPage.enterEmail("admin@hadir.com");
        delay(1);
        loginPage.enterPassword("admin@hadir");
        delay(1);
    }

    @And("Admin clicks login button for pendaftaran user page")
    public void admin_clicks_login_button_for_pendaftaran_user_page() {
        loginPage.clickLoginButton();
        delay(1);
    }

    @And("Admin should be redirected to dashboard for pendaftaran user page")
    public void admin_should_be_redirected_to_dashboard_for_pendaftaran_user_page() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("dashboard"));
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "User is not redirected to dashboard");
    }

    @And("Admin clicks the management button on sidebar")
    public void admin_clicks_the_management_button_on_sidebar() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(pendaftaranUserPage.getManagementButton())).click();
    }

    @And("Admin clicks pendaftaran user button")
    public void admin_clicks_pendaftaran_user_button() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(pendaftaranUserPage.getPendaftaranUserButton())).click();
    }

    @And("Admin fills in account information with the following details:")
    public void fill_in_account_information(io.cucumber.datatable.DataTable dataTable) {
        pendaftaranUserPage.setBtnChooseFile("D://SQA RPA BATCH 17//Tugas//foto karyawan.avif");
        delay(1);
        pendaftaranUserPage.enterNIK("D6220637");
        delay(1);
        pendaftaranUserPage.enterEmployeeName("Budi Santoso");
        delay(1);
        pendaftaranUserPage.enterEmail("budisantoso123@gmail.com");
        delay(1);
        pendaftaranUserPage.enterPassword("12345678");
        delay(1);
        extentTest.log(LogStatus.PASS,"User fills in account information with the following details:");
    }

    @And("Admin fills in work information with the following details:")
    public void fill_in_work_information(io.cucumber.datatable.DataTable dataTable) {
        pendaftaranUserPage.selectDivision("Axiata Digital Labs");
        delay(1);
        pendaftaranUserPage.selectUnit("Axiata Digital Labs");
        delay(1);
        pendaftaranUserPage.selectWorkPosition("QA");
        delay(1);
        pendaftaranUserPage.selectJobTitle("Supervisor");
        delay(1);
        pendaftaranUserPage.selectContractType("PKWTT");
        delay(1);
        extentTest.log(LogStatus.PASS,"User fills in work information with the following details:");
    }

    @And("Admin fills in attendance settings with the following details:")
    public void fill_in_attendance_settings(io.cucumber.datatable.DataTable dataTable) {
        pendaftaranUserPage.selectWorkLocation("AXIATA DIGITAL LABS");
        delay(3);
        pendaftaranUserPage.selectShiftType();
        delay(1);
        pendaftaranUserPage.selectWorkSchedule("SQA Axiata");
        delay(3);
        pendaftaranUserPage.toggleSelfie(Boolean.parseBoolean("Selfie"));
        delay(1);
        pendaftaranUserPage.enterLeaveQuota("12");
        delay(1);
        extentTest.log(LogStatus.PASS,"User fills in attendance settings with the following details:");
    }

    @And("Admin clicks Submit to complete the registration")
    public void user_clicks_submit_to_complete_registration() {
        String button = "Submit";
        pendaftaranUserPage.clickSubmit();
        delay(1);
        extentTest.log(LogStatus.PASS, "User clicks Submit to complete the registration");
    }

    @Then("Admin is successfully registered")
    public void verify_user_registration() {
        pendaftaranUserPage.verifySuccessMessage();
        delay(1);
        pendaftaranUserPage.verifyUserListPage();
        delay(1);
        extentTest.log(LogStatus.PASS, "Admin is successfully registered");
        }

    @And("Admin fills in account information with an invalid email")
    public void admin_fills_in_account_information_with_an_invalid_email() {
        pendaftaranUserPage.enterEmail("budisantoso123");
        pendaftaranUserPage.enterPassword("12345678");
        extentTest.log(LogStatus.PASS, "Admin fills in account information with an invalid email");
    }

    @And("Admin fills in account information with an invalid password")
    public void admin_fills_in_account_information_with_an_invalid_password() {
        pendaftaranUserPage.enterEmail("budisantoso123@gmail.com");
        pendaftaranUserPage.enterPassword("123");
        extentTest.log(LogStatus.PASS, "Admin fills in account information with an invalid password");
    }

    @And("Admin leaves required fields empty")
    public void user_leaves_required_fields_empty() {
        pendaftaranUserPage.leaveRequiredFieldsEmpty();
        extentTest.log(LogStatus.PASS, "Admin leaves required fields empty");
    }

    @Then("Admin should see an error message")
    public void user_should_see_error_message() {
        pendaftaranUserPage.getErrorMessage();
        extentTest.log(LogStatus.PASS, "Admin should see an error message");
    }

    public static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
