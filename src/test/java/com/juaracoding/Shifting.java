package com.juaracoding;

import com.aventstack.extentreports.ExtentTest;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.PendingPage;
import com.juaracoding.pages.ShiftingPage;
import com.juaracoding.utils.ExtentReportManager;
import com.juaracoding.utils.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static com.juaracoding.drivers.DriverSingleton.delay;

public class Shifting {

    private LoginPage loginPage = new LoginPage(Hooks.driver);
    private ShiftingPage shiftingPage = new ShiftingPage(Hooks.driver);
    private ExtentTest test;
    JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;

    @Given("I am on the dashboard page")
    public void i_am_on_the_dashboard_page(){
        test = ExtentReportManager.getInstance().createTest("the user is on the Dashboard Page");
        Hooks.driver.get("https://magang.dikahadir.com/authentication/login");
        loginPage.enterUsername("admin@hadir.com");
        delay(3);
        loginPage.enterPassword("admin@hadir");
        delay(3);
        loginPage.clickLoginButton();
        delay(4);
        test.pass("Navigated to the Dashboard Page successfully.");
    }

    @When("I click on the management menu")
    public void i_click_on_the_management_menu(){
        test = ExtentReportManager.getInstance().createTest("I click on the management menu");
        shiftingPage.btnManagementMenu();
        delay(3);
        test.pass("Click management button");
    }

    @And("I click on the shifting bar")
    public void i_click_on_the_shifting_bar(){
        test = ExtentReportManager.getInstance().createTest("I click on the shifting bar");
        WebElement Element = Hooks.driver.findElement(By.xpath("//div[11]/div[2]/p"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        shiftingPage.btnShiftingBar();
        delay(3);
        test.pass("Click shifting bar");
    }

    @Then("I search for the shift with bca life")
    public void i_search_for_the_shift_with_bca_Life(){
        test = ExtentReportManager.getInstance().createTest("I search for the shift with bca Life");
        shiftingPage.setInputSearch("BCA Life");
        shiftingPage.getInputSearch();
        delay(2);
        shiftingPage.btnSearch();
        delay(3);
        test.pass("Search for the shift with bca Life");
    }

    @And("I click on the edit button for the shift")
    public void i_click_on_the_edit_button_for_the_shift(){
        test = ExtentReportManager.getInstance().createTest("I click on the edit button for the shift");
        WebElement Element = Hooks.driver.findElement(By.xpath("(//button[@type='button'])[6]"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        shiftingPage.btnDot();
        delay(2);
        shiftingPage.btnEdit();
        delay(3);
        test.pass("Click on the edit button for the shift");
    }

    @And("I update the name")
    public void i_update_the_name(){
        test = ExtentReportManager.getInstance().createTest("I update the name");
        shiftingPage.clearInputName();
        delay(2);
        shiftingPage.setInputName(" - Test BCA");
        delay(3);
        test.pass("I update the name");
    }

    @And("I select the job")
    public void i_select_the_job(){
        test = ExtentReportManager.getInstance().createTest("I select the job");
        shiftingPage.setInputJob("BCA");
        delay(2);
        shiftingPage.btnListBca();
        delay(2);
        test.pass("I select the job");
    }

    @And("I enter the shift code")
    public void i_enter_the_shift_code(){
        test = ExtentReportManager.getInstance().createTest("I enter the shift code");
        shiftingPage.setInputShiftCode("BCA-002");
        delay(2);
        test.pass("I enter the shift code");
    }

    @And("I click on the save button")
    public void i_click_on_the_save_button(){
        test = ExtentReportManager.getInstance().createTest("I click on the save button");
        shiftingPage.btnSave();
        delay(2);
        test.pass("I click on the save button");
    }

    @Then("the shift for the bca department should be updated successfully")
    public void the_shift_for_the_bca_department_should_be_updated_successfully(){
        test = ExtentReportManager.getInstance().createTest("Department Updated");
        test.pass("Department Updated");
    }

    @Then("I search for the shift with love indonesia")
    public void i_search_for_the_shift_with_love_indonesia(){
        test = ExtentReportManager.getInstance().createTest("I search for the shift with love indonesia");
        shiftingPage.setInputSearch("Sastra");
        shiftingPage.getInputSearch();
        delay(2);
        shiftingPage.btnSearch();
        delay(3);
        test.pass("search for the shift with love indonesia");
    }

    @And("I click on the delete button for the shift")
    public void i_click_on_the_delete_button_for_the_shift(){
        test = ExtentReportManager.getInstance().createTest("I click on the delete button for the shift");
        shiftingPage.btnDot();
        delay(3);
        shiftingPage.btnDelete();
        delay(3);
        shiftingPage.btnDeleteConfirm();
        delay(4);
        test.pass("I click on the delete button for the shift");
    }

    @Then("the shift for the love indonesia should be deleted successfully")
    public void the_shift_for_the_love_indonesia_should_be_deleted_successfully(){
        test = ExtentReportManager.getInstance().createTest("the shift for the love indonesia should be deleted successfully");
        test.pass("Department Deleted");
    }






































}