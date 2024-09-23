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

public class LogoutUserTest {

    private WebDriver driver;
    private LoginUserPage loginUserPage = new LoginUserPage();
    private DashboardUserPage dashboardUserPage = new DashboardUserPage();
    private ExtentTest extentTest;

    public LogoutUserTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    //TCC HADIR 0017
    @Given("I am logged in to the mobile site")
    public void i_am_logged_in_to_the_mobile_site(){
        driver.get(Constans.URLMOBILE);
        DriverSingleton.delay(2);
        loginUserPage.login("arsya78.clk2078@gmail.com","12345678910");
        loginUserPage.setBtnMasuk();
        extentTest.log(LogStatus.PASS,"I am logged in to the mobile site");
    }

    @When("I clicked button navbar")
    public void i_clicked_button_navbar(){
        DriverSingleton.delay(2);
        dashboardUserPage.setBtnNavbar();
        extentTest.log(LogStatus.PASS,"I clicked button navbar");
    }

    @Then("I clicked button logout")
    public void i_clicked_button_logout(){
        DriverSingleton.delay(2);
        dashboardUserPage.setBtnLogout();
        extentTest.log(LogStatus.PASS,"I clicked button logout");
    }

    @And("I should see Hadir logo in login page")
    public void i_should_see_hadir_logo_in_login_page(){
        DriverSingleton.delay(2);
        Assert.assertTrue(loginUserPage.setImage());
        extentTest.log(LogStatus.PASS,"I should see Hadir logo in login page");
    }

    //TCC HADIR 0018
    @And("I clicked back button in the browser")
    public void i_clicked_back_button_in_the_browser(){
        driver.navigate().back();
        extentTest.log(LogStatus.PASS,"I clicked back button in the browser");
    }

}
