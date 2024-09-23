package com.juaracoding;

import com.juaracoding.pages.DayOffPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.LogoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static com.juaracoding.utils.Hooks.driver;

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
        delay(1);
    }

    @When("User clicks the sidebar button for day off")
    public void user_clicks_the_sidebar_button_for_day_off() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dayOffPage.getSidebarButton())).click();
        delay(3);
    }

    @And("User clicks the management button on sidebar")
    public void user_clicks_the_management_button_on_sidebar() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dayOffPage.getManagementButton())).click();
        delay(3);
    }

    @And("User clicks day off button")
    public void user_clicks_day_off_button() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000);");
        js.executeScript("arguments[0].scrollIntoView(true);", dayOffPage.getDayOffButton());
        delay(3);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dayOffPage.getDayOffButton())).click();
        delay(3);
//        wait.until(ExpectedConditions.elementToBeClickable(dayOffPage.getSidebarCloseButton())).click();
//        delay(1);
        wait.until(ExpectedConditions.urlContains("day-off"));
        Assert.assertTrue(driver.getCurrentUrl().contains("day-off"), "User is not on the Day Off page");
    }

    // Method to check if the expected text is present on the Day Off page
    public void checkTextOnDayOffPage(String expectedText, String xpathExpression) {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        // Find an element based on the provided XPath
        WebElement pageContent = driver.findElement(By.xpath(xpathExpression));

        // Check if the expected text is present on the page
        boolean textPresent = pageContent.getText().contains(expectedText);

        // Optionally, add an assertion to verify the text
        Assert.assertTrue(textPresent, "Expected text: " + expectedText + " is not present on the Day Off page.");
    }

    @When("User should see {string} text on the Day Off page for cuti bersama")
    public void user_should_see_text_on_the_day_off_page(String expectedText) {
        // XPath for finding the "Cuti Bersama" text
        String xpathForCutiBersama = "//h3[normalize-space()='Cuti Bersama']";
        checkTextOnDayOffPage(expectedText, xpathForCutiBersama);
    }

    @And("User should see {string} text on the Day Off page for liburan nasional")
    public void user_should_see_text_on_the_day_off_page_and(String expectedText) {
        // XPath for finding the "tanggal" text
        String xpathForTanggal = "//h3[normalize-space()='Liburan Nasional']";
        checkTextOnDayOffPage(expectedText, xpathForTanggal);
    }

    @When("User accesses the day off page directly without login")
    public void user_accesses_the_day_off_page_directly_without_login() {
        driver.get("https://magang.dikahadir.com/management/day-off");
        delay(3);
    }


//    @And("User should see {string} text on the Day Off page")
//    public void user_should_see_text_on_the_day_off_page_and_third(String expectedText) {
//        // XPath for finding the "Deskripsi" text
//        String xpathForDeskripsi = "[@id=\"__next\"]/div/div[2]/div/div[1]/div[1]/div[2]/div/div/table/thead/tr/th[2]/h5";
//        checkTextOnDayOffPage(expectedText, xpathForDeskripsi);
//    }


    public static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

