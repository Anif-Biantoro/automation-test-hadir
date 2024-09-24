package com.juaracoding;

import com.aventstack.extentreports.ExtentTest;
import com.juaracoding.pages.DashboardPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.ExtentReportManager;
import com.juaracoding.utils.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.juaracoding.drivers.DriverSingleton.delay;

public class Dashboard {

    private LoginPage loginPage = new LoginPage(Hooks.driver);
    private DashboardPage dashboardPage = new DashboardPage(Hooks.driver);
    private ExtentTest test;
    JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;

    @Given("I am logged in and on the dashboard page")
    public void i_am_logged_in_and_on_the_dashboard_page() {
        test = ExtentReportManager.getInstance().createTest("I am logged in and on the dashboard page");
        Hooks.driver.get("https://magang.dikahadir.com/authentication/login");
        loginPage.enterUsername("admin@hadir.com");
        delay(3);
        loginPage.enterPassword("admin@hadir");
        delay(3);
        loginPage.clickLoginButton();
        delay(4);
        test.info("Logged in successfully.");
    }

    @When("I view the dashboard page")
    public void i_view_the_dashboard_page() {
        test = ExtentReportManager.getInstance().createTest("I view the dashboard page");
        test.info("Viewing the dashboard page.");
    }

    @Then("I should click the dashboard button")
    public void i_should_click_the_dashboard_button(){
        test = ExtentReportManager.getInstance().createTest("I should click the dashboard button");
        dashboardPage.btnDashboard();
        delay(3);
        test.info("Click dashboard button");
    }

    @And("I should see the total number of employees section")
    public void i_should_see_the_total_number_of_employees_section(){
        test = ExtentReportManager.getInstance().createTest("I should see the total number of employees section");
        String messageTotal = dashboardPage.getTotalKaryawan();
        Assert.assertTrue(messageTotal.contains("Total semua karyawan"));
        dashboardPage.getJumlahTotalKaryawan();
        delay(3);
        test.info("I see total number of employees");
    }

    @And("I should see the number of employees who are absent")
    public void i_should_see_the_number_of_employees_who_are_absent(){
        test = ExtentReportManager.getInstance().createTest("I should see the number of employees who are absent");
        String messageAbsen = dashboardPage.getKaryawanAbsen();
        Assert.assertTrue(messageAbsen.contains("Total absen hari ini"));
        dashboardPage.getJumlahKaryawanAbsen();
        delay(3);
        test.info("I see total number of employees who are absent");
    }

    @And("I should see the number of employees who are working from home")
    public void i_should_see_the_number_of_employees_who_are_working_from_home(){
        test = ExtentReportManager.getInstance().createTest("I should see the number of employees who are working from home");
        String messageWfh = dashboardPage.getKaryawanWfh();
        Assert.assertTrue(messageWfh.contains("Karyawan yang sedang WFH hari ini"));
        dashboardPage.getJumlahKaryawanWfh();
        delay(3);
        test.info("I see total number of employees who are work from home");
    }

    @And("I should see the number of employees on leave")
    public void i_should_see_the_number_of_employees_on_leave(){
        test = ExtentReportManager.getInstance().createTest("I should see the number of employees on leave");
        String messageCuti = dashboardPage.getKaryawanCuti();
        Assert.assertTrue(messageCuti.contains("Karyawan yang sedang cuti hari ini"));
        dashboardPage.getJumlahKaryawanCuti();
        delay(3);
        test.info("I see total number of employees who are on leave");
    }

    @And("I should see the number of employees who are sick")
    public void i_should_see_the_number_of_employees_who_are_sick(){
        test = ExtentReportManager.getInstance().createTest("I should see the number of employees who are sick");
        String messageSakit = dashboardPage.getKaryawanSakit();
        Assert.assertTrue(messageSakit.contains("Karyawan yang sedang sakit hari ini"));
        WebElement Element = Hooks.driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[1]/div/div[5]/div/div[2]/div[1]/p"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        dashboardPage.getJumlahKaryawanSakit();
        delay(3);
        test.info("I see total number of employees who are sick");
    }

    @And("I should see the number of employees who are on permission")
    public void i_should_see_the_number_of_employees_who_are_on_permission(){
        test = ExtentReportManager.getInstance().createTest("I should see the number of employees who are on permission");
        String messageIzin = dashboardPage.getKaryawanIzin();
        Assert.assertTrue(messageIzin.contains("Karyawan yang sedang Izin hari ini"));
        WebElement Element = Hooks.driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[1]/div/div[6]/div/div[2]/div[1]/p"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        dashboardPage.getJumlahKaryawanIzin();
        delay(3);
        test.info("I see total number of employees who are on permission");
    }



}


