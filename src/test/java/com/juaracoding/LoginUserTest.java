package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.DashboardUserPage;
import com.juaracoding.pages.LoginUserPage;
import com.juaracoding.utils.Constans;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginUserTest {

    private WebDriver driver;
    private LoginUserPage loginUserPage = new LoginUserPage();
    private DashboardUserPage dashboardUserPage = new DashboardUserPage();
    private ExtentTest extentTest;

    public LoginUserTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    //TCC HADIR 0011
    @Given("I am on the login page")
    public void i_am_on_the_login_page(){
        driver.get(Constans.URLMOBILE);
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS,"I am on the login page");
    }

    @When("I enters email and password validly")
    public void i_enters_email_and_password_validly(){
        loginUserPage.login("arsya78.clk2078@gmail.com","12345678910");
        DriverSingleton.delay(2);
        loginUserPage.setBtnSeePassword();
        extentTest.log(LogStatus.PASS,"I enters email and password validly");
    }

    @And("I click the login button")
    public void i_click_the_login_button(){
        loginUserPage.setBtnMasuk();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS,"I click the login button");
    }

    @Then("I should be redirected to the dashboard page")
    public void i_should_be_redirected_to_the_dashboard_page(){
        Assert.assertEquals(dashboardUserPage.getTxtNameDashboard(),"Hai, Arsya Naufaldi");
        extentTest.log(LogStatus.PASS,"I should be redirected to the dashboard page");
    }

    //TCC HADIR 0012
    @And("I enters unregistered account")
    public void i_enters_unregistered_account(){
        loginUserPage.login("test.Jcode@gmail.com","admin123");
        DriverSingleton.delay(2);
        loginUserPage.setBtnSeePassword();
        extentTest.log(LogStatus.PASS,"I enters unregistered account");
    }

    @Then("an error message should be displayed")
    public void an_error_message_should_be_displayed(){
        DriverSingleton.delay(2);
        Assert.assertEquals(loginUserPage.getTxtFailedElement(),"Akun tidak ditemukan");
        extentTest.log(LogStatus.PASS,"an error message should be displayed");
    }

    //TCC HADIR 0013
    @And("I leaves email and password fields empty")
    public void i_leaves_email_and_password_fields_empty(){
        loginUserPage.login("","");
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS,"I leaves email and password fields empty");
    }

    //TCC HADIR 0014
    @And("I enters email with wrong format and password validly")
    public void i_enters_email_with_wrong_format_and_password_validly(){
        loginUserPage.login("arsya78.clk2078gmail.com","12345678910");
        DriverSingleton.delay(2);
        loginUserPage.setBtnSeePassword();
        extentTest.log(LogStatus.PASS,"I enters email with wrong format and password validly");
    }

    @Then("an pop up message should be displayed")
    public void an_pop_up_message_should_be_displayed(){
        DriverSingleton.delay(2);
        Assert.assertEquals(loginUserPage.popUpMessage(),"null");
        extentTest.log(LogStatus.PASS,"I enters email with wrong format and password validly");
    }

    //TCC HADIR 0015
    @And("I enters email validly and password invalidly")
    public void i_enters_email_validly_and_password_invalidly(){
        loginUserPage.login("arsya78.clk2078@gmail.com","123456789");
        DriverSingleton.delay(2);
        loginUserPage.setBtnSeePassword();
        extentTest.log(LogStatus.PASS,"I enters email validly and password invalidly");
    }

    @Then("an wrong password message should be displayed")
    public void an_wrong_password_message_should_be_displayed(){
        DriverSingleton.delay(2);
        Assert.assertEquals(loginUserPage.getTxtFailedElement(),"Email atau password salah");
        extentTest.log(LogStatus.PASS,"an wrong password should be displayed");
    }

    //TCC HADIR 0016
    @And("I enters email invalidly and password validly")
    public void i_enters_email_invalidly_and_password_validly(){
        loginUserPage.login("arsya.clk2078@gmail.com","12345678910");
        DriverSingleton.delay(2);
        loginUserPage.setBtnSeePassword();
        extentTest.log(LogStatus.PASS,"I enters email invalidly and password validly");
    }

}
