package com.juaracoding;

import com.juaracoding.pages.KoreksiPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class KoreksiSteps {

    private WebDriver driver = Hooks.driver;
    private LoginPage loginPage = new LoginPage(driver);
    private KoreksiPage koreksiPage = new KoreksiPage(driver);

    @Given("User is on login page for koreksi")
    public void user_Is_On_Login_Page_for_koreksi() {
        driver.get("https://magang.dikahadir.com/authentication/login");
    }

    @When("User enters valid email and password for koreksi")
    public void user_enters_valid_email_and_password_for_koreksi() {
        loginPage.enterEmail("admin@hadir.com");
        loginPage.enterPassword("admin@hadir");
    }

    @And("User clicks login button for koreksi")
    public void user_clicks_login_button_for_koreksi() {
        loginPage.clickLoginButton();
    }

    @And("User should be redirected to dashboard for koreksi")
    public void user_should_be_redirected_to_dashboard_for_koreksi() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("dashboard"));
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "User is not redirected to dashboard");
        delay(3);
    }

//    @When("User clicks the laporan button on sidebar")
//    public void user_clicks_the_laporan_button_on_sidebar() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.elementToBeClickable(koreksiPage.getKoreksiButton())).click();
//        delay(5);
//    }

//    @And("User clicks lembur button")
//    public void user_clicks_lembur_button() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.elementToBeClickable(koreksiPage.getKoreksiButton())).click();
//        delay(9);
//    }

//    @And("User enters name for search field")
//    public void user_Enters_name_for_search_field() {
//        koreksiPage.enterText("Noviar Budi");
//        delay(3);
//    }

//    @And("User clicks search button for lembur")
//    public void user_clicks_the_search_button_for_lembur() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.elementToBeClickable(lemburPage.getSearchButton())).click();
//        delay(3);
//    }

//    @And("User clicks reset button for lembur")
//    public void user_clicks_the_reset_button_for_lembur() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.elementToBeClickable(koreksiPage.getResetButton())).click();
//        delay(3);
//    }



//    @And("User clicks filter button for lembur")
//    public void user_clicks_filter_button_for_lembur() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.elementToBeClickable(lemburPage.getFilterButton())).click();
//        delay(3);
//    }
////    @And("User enters name for filter field")
//    public void user_enters_name_for_filter_field() {
//        lemburPage.filterField("fiqih");
//        delay(3);
//    }

//    @When("user input start date lembur")
//    public void user_input_start_date_lembur() {
//        koreksiPage.startdate("19-08-2024");
//        delay(3);
//    }

//    @And("user input end date lembur")
//    public void user_input_end_date_lembur() {
//        koreksiPage.endDate("19-09-2024");
//        delay(3);
//    }
//
//    @And("User clicks search button for lembur")
//    public void user_clicks_the_search_button_for_lembur() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.elementToBeClickable(koreksiPage.getSearchButton())).click();
//        delay(3);
//    }

//    @When("User clicks the profile button on the dashboard")
//    public void user_clicks_the_profile_button_on_the_dashboard() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.elementToBeClickable(logoutPage.getProfileButton())).click();
//        delay(2);
//    }

//    @And("User clicks logout button")
//    public void user_clicks_logout_button() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.elementToBeClickable(logoutPage.getLogoutButton())).click();
//        delay(1);
//    }
//
//    @Then("User should be redirected to the login page")
//    public void user_should_be_redirected_to_the_login_page() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.urlContains("login"));
//        Assert.assertTrue(driver.getCurrentUrl().contains("login"), "User is not redirected to the login page");
//        delay(1);
//    }

    public static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
