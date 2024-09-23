package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
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


    @Given("User is on login page for login")
    public void user_Is_On_Login_Page_for_login() {
        driver.get("https://magang.dikahadir.com/authentication/login");
    }

    @When("User enters valid email and password for login")
    public void user_Enters_Valid_Email_And_Password_For_Login() {
        loginPage.login("admin@hadir.com","admin@hadir");
        DriverSingleton.delay(1);
    }

    @And("User Click Login Button")
    public void User_Click_Login_Button(){
        DriverSingleton.delay(1);
        loginPage.clickLoginBtn();
        DriverSingleton.delay(1);
    }
    @Then("The user successfully entered the login page")
    public void The_user_successfully_entered_the_login_page(){
        loginPage.getTxtDashboard();
        DriverSingleton.delay(1);
    }
}
