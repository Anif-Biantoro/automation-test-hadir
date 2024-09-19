package com.juaracoding;

import com.juaracoding.pages.DayOffPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.LogoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DayOffSteps {

    private WebDriver driver = com.juaracoding.utils.Hooks.driver;
    private LoginPage loginPage = new LoginPage(driver);
    private DayOffPage dayOffPage = new DayOffPage(driver);

    @Given("User is on login page for day off")
    public void user_Is_On_Login_Page_for_day_off() {
        driver.get("https://magang.dikahadir.com/authentication/login");
    }

    @When("User enters valid email and password for day off")
    public void user_enters_valid_email_and_password_for_day_off() {
        loginPage.enterEmail("admin@hadir.com");
        loginPage.enterPassword("admin@hadir");
    }

    @And("User clicks login button for day off")
    public void user_clicks_login_button_for_day_off() {
        loginPage.clickLoginButton();
    }

    @And("User should be redirected to dashboard for day off")
    public void user_should_be_redirected_to_dashboard_for_day_off() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("dashboard"));
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "User is not redirected to dashboard");
        delay(9);
    }

    @When("User clicks the sidebar button for day off")
    public void user_clicks_the_sidebar_button_for_day_off() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dayOffPage.getSidebarButton())).click();
        delay(9);
    }

    @And("User clicks the management button on sidebar")
    public void user_clicks_the_management_button_on_sidebar() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dayOffPage.getManagementButton())).click();
        delay(3);
    }

    @And("User clicks day off button")
    public void user_clicks_day_off_button() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dayOffPage.getDayOffButton())).click();
        delay(3);
    }

//    @Then("User should be redirected to the day off page")
//    public void user_should_be_redirected_to_the_day_off_page() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.urlContains("day off"));
//        Assert.assertTrue(driver.getCurrentUrl().contains("day off"), "User is not redirected to the day off page");
//        delay(1);
//    }

    public static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

