package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static com.juaracoding.utils.Hooks.driver;

public class LoginSteps {

    private ExtentTest extentTest;
    private LoginPage loginPage = new LoginPage();
    public LoginSteps(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }



    @Given("The User is on login page for login")
    public void the_user_is_on_login_page_for_login() {
        driver.get("https://magang.dikahadir.com/authentication/login");
        extentTest.log(LogStatus.PASS, "The User is on login page for login");
        throw new io.cucumber.java.PendingException();
    }

    @When("User enters valid email and password for login")
    public void user_enters_valid_email_and_password_for_login() {
        loginPage.login("admin@hadir.com","admin@hadir");
        DriverSingleton.delay(1);
    }

    @And("User Click Login Button")
    public void user_click_login_button(){
        DriverSingleton.delay(1);
        loginPage.clickLoginBtn();
        DriverSingleton.delay(1);
    }
    @Then("The user successfully entered the login page")
    public void the_user_successfully_entered_the_login_page(){
        loginPage.getTxtDashboard();
        DriverSingleton.delay(1);
    }
}
