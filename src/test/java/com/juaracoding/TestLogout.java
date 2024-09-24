package com.juaracoding;

import com.juaracoding.pages.LogoutPage;
import com.juaracoding.utils.Constants;
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

public class TestLogout {

    private static WebDriver driver;
    static ExtentTest extentTest;
    private static LogoutPage logoutPage = new LogoutPage();

    public TestLogout(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    // TCC.HADIR.001
    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        logoutPage.clickProfile();
        extentTest.log(LogStatus.PASS,"the user is logged in");
    }

    @When("the user clicks on the logout button")
    public void the_user_clicks_on_the_logout_button() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(logoutPage.clickbtnLogout())).click();
    }

    @Then("the user should be redirected to the login page")
    public void the_user_should_be_redirected_to_the_login_page() {
            driver.get("https://magang.dikahadir.com/authentication/login");
    }


}
