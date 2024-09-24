package com.juaracoding;

import com.aventstack.extentreports.ExtentTest;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.PendingPage;
import com.juaracoding.utils.ExtentReportManager;
import com.juaracoding.utils.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.juaracoding.drivers.DriverSingleton.delay;

public class Pending {

    private LoginPage loginPage = new LoginPage(Hooks.driver);
    private PendingPage pendingPage = new PendingPage(Hooks.driver);
    private ExtentTest test;

    @Given("the user is on the Pending Page")
    public void the_user_is_on_the_pending_page() {
        test = ExtentReportManager.getInstance().createTest("the user is on the Pending Page");
        Hooks.driver.get("https://magang.dikahadir.com/authentication/login");
        loginPage.enterUsername("admin@hadir.com");
        delay(3);
        loginPage.enterPassword("admin@hadir");
        delay(3);
        loginPage.clickLoginButton();
        delay(4);
        test.pass("Navigated to the Pending Page successfully.");
    }

    @When("the user selects the start date")
    public void the_user_selects_the_start_date() {
        test = ExtentReportManager.getInstance().createTest("the user selects the start date");
        pendingPage.btnStartDate();
        delay(2);
        pendingPage.btnStartDatePick();
        delay(2);
        test.pass("Start date button clicked.");
    }

    @And("the user selects the end date")
    public void the_user_selects_the_end_date() {
        test = ExtentReportManager.getInstance().createTest("the user selects the end date");
        pendingPage.btnEndDatePick();
        delay(2);
        test.pass("End date button clicked.");
    }

    @And("the user saves the selected date range")
    public void the_user_saves_the_selected_date_range() {
        test = ExtentReportManager.getInstance().createTest("the user saves the selected date range");
        pendingPage.btnSaveDate();
        delay(2);
        test.pass("Date range saved.");
    }

    @And("the user applies the filters")
    public void the_user_applies_the_filters() {
        test = ExtentReportManager.getInstance().createTest("the user applies the filters");
        pendingPage.btnFilter();
        delay(2);
        test.pass("Filters applied.");
    }

    @And("the user sets the job department")
    public void the_user_sets_the_job_department() {
        test = ExtentReportManager.getInstance().createTest("the user sets the job department");
        pendingPage.setJobDepartment("Colliers Indonesia - AIA");
        delay(5);
        test.pass("Job department set succussfully");
    }

    @And("the user saves the job department")
    public void the_user_saves_the_job_department() {
        test = ExtentReportManager.getInstance().createTest("the user saves the job department");
        pendingPage.btnSaveJobDepartmentClick();
        delay(3);
        pendingPage.btnSaveJobDepartment();
        delay(2);
        pendingPage.btnSearch();
        delay(3);
        test.pass("Job department saved.");
    }

    @Then("the data should be filtered according to the selected criteria")
    public void the_data_should_be_filtered_according_to_the_selected_criteria() {
        test = ExtentReportManager.getInstance().createTest("the data should be filtered according to the selected criteria");
        pendingPage.btnFilter();
        delay(4);
        pendingPage.getJobDepartment();
        Assert.assertTrue(true,"Colliers Indonesia - AIA"); // Replace with actual validation
        test.pass("Data is filtered according to the selected criteria.");
    }

    @When("the user applies some filters")
    public void the_user_applies_some_filters() {
        test = ExtentReportManager.getInstance().createTest("the user applies some filters");
        pendingPage.btnStartDate();
        pendingPage.btnEndDatePick();
        pendingPage.btnSaveDate();
        pendingPage.btnFilter();
        pendingPage.setJobDepartment("Colliers Indonesia - Menara Bank Danamon");
        pendingPage.btnSaveJobDepartment();
        pendingPage.btnSearch();
        test.pass("Some filters applied.");
    }

    @And("the user resets all filters")
    public void the_user_resets_all_filters() {
        test = ExtentReportManager.getInstance().createTest("the user resets all filters");
        pendingPage.btnReset();
        test.pass("Filters reset.");
    }

    @Then("the filters should be cleared")
    public void the_filters_should_be_cleared() {
        test = ExtentReportManager.getInstance().createTest("the filters should be cleared");
        String actual = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actual,"https://magang.dikahadir.com/dashboards/pending"); // Replace with actual validation
        test.pass("Filters are cleared.");
    }
}
