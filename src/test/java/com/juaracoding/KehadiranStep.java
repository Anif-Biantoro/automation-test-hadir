package com.juaracoding;

import com.juaracoding.pages.KehadiranPage;
import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class KehadiranStep {

    private ExtentTest extentTest;
    private WebDriver driver = Hooks.driver;
    private LoginPage loginPage = new LoginPage(driver);
    private KehadiranPage kehadiranPage = new KehadiranPage(driver);
    public KehadiranStep() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Admin is on login page for kehadiran page")
    public void admin_is_on_login_page_for_kehadiran_page() {
        driver.get("https://magang.dikahadir.com/authentication/login");
    }

    @When("Admin enters valid email and password for kehadiran page")
    public void admin_enters_valid_email_and_password_for_login() {
        loginPage.enterEmail("admin@hadir.com");
        delay(1);
        loginPage.enterPassword("admin@hadir");
        delay(1);
    }

    @And("Admin clicks login button for kehadiran page")
    public void admin_clicks_login_button_for_kehadiran_page() {
        loginPage.clickLoginButton();
        delay(1);
    }

    @And("Admin should be redirected to dashboard for kehadiran page")
    public void admin_should_be_redirected_to_dashboard_for_kehdairan_page() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("dashboard"));
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "User is not redirected to dashboard");
    }

    @And("Admin clicks the laporan button on sidebar")
    public void admin_clicks_the_laporan_button_on_sidebar() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(kehadiranPage.getLaporanButton())).click();
    }

    @And("Admin clicks kehadiran button")
    public void admin_clicks_Kehadiran_button() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(kehadiranPage.getKehadiranButton())).click();
    }

    @And("Admin enters the start date and the end date")
    public void admin_enters_the_start_date_and_the_end_date() {
        kehadiranPage.setClickDateInput();
        delay(1);
        kehadiranPage.setChooseStartDate();
        delay(1);
        kehadiranPage.setChooseEndDate();
        delay(1);
        extentTest.log(LogStatus.PASS,"User enters the start date and the end date");
    }

    @And("Admin clicks {string}")
    public void admin_clicks(String button) {
        kehadiranPage.clickButton(button);
        delay(1);
        extentTest.log(LogStatus.PASS,"User clicks {string}");
    }

    @Then("The attendance report is updated based on the entered date range")
    public void the_attendance_report_is_updated_based_on_the_entered_date_range() {
        kehadiranPage.verifyReportUpdated();
        delay(1);
        extentTest.log(LogStatus.PASS,"The attendance report is updated based on the entered date range");
    }

    @And("Admin enters the employee name")
    public void admin_enters_the_employeel_name() {
        kehadiranPage.enterTxt("Husain");
        delay(1);
        extentTest.log(LogStatus.PASS,"Admin enters the employee name");
    }

    @Then("The system does not display the attendance report")
    public void the_system_does_not_display_the_attendance_report() {
        kehadiranPage.verifyReportUpdated();
        delay(1);
        extentTest.log(LogStatus.PASS,"The system does not display the attendance report");
    }

    @And("Admin leaves the start date and end date fields empty")
    public void admin_leaves_the_start_date_and_end_date_fields_empty() {
        kehadiranPage.leaveDateFieldsEmpty();
        delay(1);
        extentTest.log(LogStatus.PASS,"Admin leaves the start date and end date fields empty");
    }

    @And("A confirmation message appears")
    public void confirmation_message_appears() {
        kehadiranPage.getConfirmationMessage();
        delay(1);
        extentTest.log(LogStatus.PASS,"A confirmation message appears");
    }

    @And("Admin clicks {string} on the confirmation dialog")
    public void admin_clicks_export_on_confirmation_dialog(String button) {
        if (button.equalsIgnoreCase("Export")) {
            kehadiranPage.clickConfirmExport();
            delay(1);
            extentTest.log(LogStatus.PASS,"User clicks " + button + " on the confirmation dialog");
        }
    }

    @Then("The system displays the error message")
    public void the_system_displays_the_error_message() {
        try {
            kehadiranPage.verifyErrorMessage("Maaf terjadi kesalahan pada server");
            extentTest.log(LogStatus.PASS, "The system displays the correct error message: 'Maaf terjadi kesalahan pada server'");
        } catch (AssertionError e) {
            // Jika pesan error tidak sesuai, log akan mencatat sebagai gagal
            extentTest.log(LogStatus.FAIL, "The system failed to display the correct error message. Expected: 'Maaf terjadi kesalahan pada server', but found: " + e.getMessage());
            throw e;  // Re-throwing the error to ensure the test fails as expected
        }
        delay(1);
    }

    public static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
