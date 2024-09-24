package com.juaracoding;


import com.aventstack.extentreports.ExtentTest;
import com.juaracoding.pages.AbsensiMobilePage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.PendingPage;
import com.juaracoding.pages.ShiftingPage;
import com.juaracoding.utils.ExtentReportManager;
import com.juaracoding.utils.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static com.juaracoding.drivers.DriverSingleton.delay;

public class Absen {

    private AbsensiMobilePage absenPage = new AbsensiMobilePage(Hooks.driver);
    private ExtentTest test;
    JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;

    @Given("the user is logged in")
    public void the_user_is_logged_in(){
        test = ExtentReportManager.getInstance().createTest("the user is logged in");
        Hooks.driver.get("https://magang.dikahadir.com/absen/login");
        absenPage.setEmailLogin("aldoandre99@gmail.com");
        delay(3);
        absenPage.setPasswordLogin("p@ssw0rd");
        delay(3);
        absenPage.btnMasuk();
        delay(4);
        test.pass("the user is logged in successfully");
    }

    @When("the user clicks the absen masuk button")
    public void the_user_clicks_the_absen_masuk_button(){
        test = ExtentReportManager.getInstance().createTest("the user clicks the absen masuk button");
        absenPage.btnAbsenMasuk();
        test.pass("clicks the absen masuk button");
    }

    @And("read clock and selects work from office")
    public void read_clock_and_selects_work_from_office(){
        test = ExtentReportManager.getInstance().createTest("read clock and selects work from office");
        absenPage.getJamAbsen();
        delay(2);
        absenPage.btnWorkFrom();
        delay(2);
        absenPage.btnWorkFromOffice();
        delay(3);
        test.pass("read clock and selects work from office");
    }

    @And("enters notes for the absence")
    public void enters_notes_for_the_absence(){
        test = ExtentReportManager.getInstance().createTest("read clock and selects work from office");
        absenPage.setNotesAbsen("Absen Masuk Hari Ini");
        delay(3);
        test.pass("enters notes for the absence");
    }

    @And("submits the absence")
    public void submits_the_absence(){
        test = ExtentReportManager.getInstance().createTest("submits the absence");
        absenPage.btnAbsenMasuk2();
        delay(3);
        test.pass("submits the absence");
    }

    @Then("the absence should be recorded successfully")
    public void the_absence_should_be_recorded_successfully() {
        test = ExtentReportManager.getInstance().createTest("the absence should be recorded successfully");
        WebElement Element = Hooks.driver.findElement(By.xpath("//p[(text() = 'ALDO ANDRE ERZHAL SYAHREZA' or . = 'ALDO ANDRE ERZHAL SYAHREZA')]"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        absenPage.getUserAbsen();
        String userRecord = absenPage.getUserAbsen();
        Assert.assertTrue(userRecord.contains("ALDO ANDRE ERZHAL SYAHREZA"));
        delay(2);
        test.pass("the absence should be recorded successfully");
    }

    @And("the user clicks the keluar button")
    public void the_user_clicks_the_keluar_button(){
        test = ExtentReportManager.getInstance().createTest("the user clicks the keluar button");
        WebElement Element = Hooks.driver.findElement(By.xpath("//div[2]/div/div[2]/button"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        absenPage.btnKeluar();
        delay(3);
        test.pass("the user clicks the keluar button");
    }

    @And("entering notes keluar")
    public void entering_notes_keluar(){
        test = ExtentReportManager.getInstance().createTest("entering notes keluar");
        absenPage.getJamKeluar();
        absenPage.setNotesKeluar("Absen Keluar");
        delay(3);
        test.pass("entering notes keluar");
    }

    @And("clicks the absen pulang button")
    public void clicks_the_absen_pulang_button(){
        test = ExtentReportManager.getInstance().createTest("clicks the absen pulang button");
        absenPage.btnAbsenPulang();
        delay(3);
        test.pass("clicks the absen pulang button");
    }






}
