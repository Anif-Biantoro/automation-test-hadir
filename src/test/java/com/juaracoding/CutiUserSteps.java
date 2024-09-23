package com.juaracoding;

import com.juaracoding.pages.*;
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

public class CutiUserSteps {

    private WebDriver driver = com.juaracoding.utils.Hooks.driver;
    private LoginUserPage loginUserPage = new LoginUserPage(driver);
    private CutiUserPage cutiUserPage = new CutiUserPage(driver);

    @Given("User is on login page for cuti user")
    public void user_Is_On_Login_Page_for_cuti_user() {
        driver.get("https://magang.dikahadir.com/absen/login");
    }

    @When("User enters valid email and password for cuti user")
    public void user_enters_valid_email_and_password_for_cuti_user() {
        loginUserPage.enterEmail("anifbiantoro99@gmail.com");
        loginUserPage.enterPassword("sayasukses45");
    }

    @And("User clicks login button for cuti user")
    public void user_clicks_login_button_for_cut_user() {
        loginUserPage.clickLoginButton();
    }

    @And("User clicks the cuti button")
    public void user_clicks_the_cuti_button() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement cutiButton = wait.until(ExpectedConditions.elementToBeClickable(cutiUserPage.getCutiButton()));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", cutiButton);
        js.executeScript("window.scrollBy(0,100);");
        cutiButton.click();
        delay(3);
    }

    @And("User clicks the ajukan cuti button")
    public void user_clicks_the_ajukan_cuti_button() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(cutiUserPage.getAjukanCutitButton())).click();
        delay(3);
    }

    @And("User clicks the info cuti button")
    public void user_clicks_the_info_cuti_button() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(cutiUserPage.getInfoCutiButton())).click();
        delay(1);
    }

    @And("User clicks the form cuti button")
    public void user_clicks_the_form_cuti_button() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(cutiUserPage.getFormCutiButton())).click();
        delay(1);
    }

    @When("User fills in the leave form with valid data")
    public void user_fills_in_the_leave_form_with_valid_data() {
        WebElement typeCutiDropdown = driver.findElement(By.xpath("//div[@id='leave_type_id']"));
        typeCutiDropdown.click();
        delay(3);
        WebElement cutiTahunanOption = driver.findElement(By.xpath("//li[text()='Pernikahan anak(1 hari)']"));
        cutiTahunanOption.click();
        delay(1);
        WebElement reasonField = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/form/div/div[3]/div/div/textarea[1]")); // Ganti dengan ID yang sesuai
        reasonField.sendKeys("Testing 2");
    }

    @When("User fills in the duplicate type leave form with valid data")
    public void user_fills_in_the_duplicate_type_leave_form_with_valid_data() {
        WebElement typeCutiDropdown = driver.findElement(By.xpath("//div[@id='leave_type_id']"));
        typeCutiDropdown.click();
        delay(1);
        WebElement cutiTahunanOption = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[4]"));
        cutiTahunanOption.click();
        delay(1);
        WebElement reasonField = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/form/div/div[3]/div/div/textarea[1]")); // Ganti dengan ID yang sesuai
        reasonField.sendKeys("Testing 3 (Ajuan di tanggal sama)");
    }

    @And("User clicks the field date")
    public void user_clicks_the_field_date() {
        WebElement submitButton = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/form/div/div[2]/div")); // Ganti dengan XPath yang sesuai
        submitButton.click();
    }

    @And("User clicks the start date")
    public void user_clicks_the_start_date() {
        WebElement submitButton = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[1]/div[2]/div[3]/div/div[2]/button[25]/span[2]")); // Ganti dengan XPath yang sesuai
        submitButton.click();
    }

    @And("User clicks the end date")
    public void user_clicks_the_end_date() {
        WebElement submitButton = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[1]/div[2]/div[3]/div/div[2]/button[25]/span[2]")); // Ganti dengan XPath yang sesuai
        submitButton.click();
    }

    @And("User clicks the save button")
    public void user_clicks_the_save_button() {
        WebElement submitButton = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/button[2]")); // Ganti dengan XPath yang sesuai
        submitButton.click();
    }


    @And("User submits the leave form")
    public void user_submits_the_leave_form() {
        WebElement submitButton = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/form/div/div[4]/button[2]")); // Ganti dengan XPath yang sesuai
        submitButton.click();
    }


    public static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

