package com.juaracoding;

import com.juaracoding.pages.LoginUserPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class TestLoginUser {
    private static WebDriver driver;
    static ExtentTest extentTest;
    private static LoginUserPage loginUserPage = new LoginUserPage();

    public TestLoginUser(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User is on login page for login user")
    public void user_Is_On_Login_Page_for_login_user() {
        driver.get("https://magang.dikahadir.com/absen/login");
    }

    @When("User enters valid email and password for login user")
    public void user_enters_valid_email_and_password_for_login_user() {
        loginUserPage.inputUsername("mhmmdasshidiqii@gmail.com");
        loginUserPage.inputPassword("kikidiqi1");
        delay(1);
    }

    @And("User clicks login button for login login user")
    public void user_clicks_login_button_for_login_user() {
        loginUserPage.clickBtnLogin();
        delay(3);
    }


    public static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}