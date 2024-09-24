package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestLogin {

    private static WebDriver driver;
    static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();

    public TestLogin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    // TCC.HADIR.001
    @Given("User enter url HADIR")
    public void user_enter_url_hadir() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"User enter url HADIR");
    }

    @When("User input valid username")
    public void user_input_valid_username() {
        loginPage.inputUsername("admin@hadir.com");
        extentTest.log(LogStatus.PASS,"User input valid username");
    }

    @And("User input valid password")
    public void user_input_valid_password() {
        loginPage.inputPassword("admin@hadir");
        extentTest.log(LogStatus.PASS,"User input valid password");
    }

    // Click button login cukup hanya satu
    @And("User click button login")
    public void user_click_button_login() {
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS,"User click button login");
    }

}
