package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Hooks;
import com.juaracoding.utils.ExtentReportManager;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Login{

    private LoginPage loginPage = new LoginPage(Hooks.driver);
    private ExtentTest test;

    @Given("User is on login page for login")
    public void user_is_on_login_page_for_login() {
        test = ExtentReportManager.getInstance().createTest("User is on login page for login");
        Hooks.driver.get("https://magang.dikahadir.com/authentication/login");
        test.info("Navigated to login page.");
    }

    @When("User enters valid username and password for login")
    public void user_enters_valid_username_and_password_for_login() {
        test = ExtentReportManager.getInstance().createTest("User enters valid username and password for login");
        loginPage.enterUsername("admin@hadir.com");
        delay(3);
        loginPage.enterPassword("admin@hadir");
        delay(3);
        test.info("Entered valid username and password.");
    }

    @And("User clicks login button on login page")
    public void user_clicks_login_button_on_login_page() {
        test = ExtentReportManager.getInstance().createTest("User clicks login button on login page");
        loginPage.clickLoginButton();
        delay(4);
        test.info("Clicked login button.");
    }

    @Then("User should be redirected to the dashboards page")
    public void user_should_be_redirected_to_the_dashboards_page() {
        test = ExtentReportManager.getInstance().createTest("User should be redirected to the dashboards page");
        delay(3);
        String currentUrl = Hooks.driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("dashboards"));
        test.pass("User is redirected to the dashboards page");
    }

    public static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
