package com.juaracoding;

import com.juaracoding.pages.JadwalPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.juaracoding.utils.Hooks;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class JadwalSteps {
    //Assert hanya bisa digunakan di anotasi @Then
    private WebDriver driver = Hooks.driver;
    private LoginPage loginPage = new LoginPage(driver);
    private JadwalPage jadwalPage = new JadwalPage(driver);
    private ExtentTest extentTest;

    public JadwalSteps(){
        extentTest = Hooks.extentTest;
    }

    // ##TCC 001

    @Given("User is on login page for jadwal")
    public void user_is_on_login_page_for_jadwal(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User is on login page for jadwal");
    }


    @When("User enters valid email and password for jadwal")
    public void user_enters_valid_email_and_password_for_jadwal() {
        loginPage.enterEmail("admin@hadir.com");
        delay(3);
        loginPage.enterPassword("admin@hadir");
        delay(3);
        extentTest.log(LogStatus.PASS, "User enters valid email and password for jadwal");
    }


    @And("User clicks login button for jadwal")
    public void user_clicks_login_button_on_jadwal() {
        loginPage.clickLoginButton();
        extentTest.log(LogStatus.PASS, "User clicks login button for jadwal");
    }


    @When("User should be redirected to dashboard for jadwal")
    public void user_should_be_redirected_to_dashboard_for_jadwal() {
        delay(3);
        driver.getCurrentUrl();
        delay(3);
        extentTest.log(LogStatus.PASS, "User should be redirected to dashboard for jadwal");
    }

    @And("User click Management Menu")
    public void user_click_management_menu(){
        jadwalPage.setBtnManagementmenu();
        delay(3);
        extentTest.log(LogStatus.PASS, "User enters valid email and password for jadwal");
    }

    @And("User scroll down")
    public void user_scroll_down(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement sidebar = driver.findElement(By.xpath("//div[@id='__next']//div[5]//div[2]"));
        js.executeScript("arguments[0].scrollBy(0, 300);", sidebar);
        extentTest.log(LogStatus.PASS, "User click Management Menu");
    }

    @And("User Click Jadwal")
    public void user_click_jadwal(){
        jadwalPage.setClickJadwal();
        delay(3);
        extentTest.log(LogStatus.PASS, "User Click Jadwal");
    }

    @And("User click on Button Add")
    public void user_click_on_button_add(){
        jadwalPage.setBtnTambah();
        delay(2);
        jadwalPage.setBtnBatalJadwal();
        delay(2);
        jadwalPage.setBtnTambah();
        extentTest.log(LogStatus.PASS, "User click on Button Add");
    }

    @And("User choose Jadwal")
    public void user_choose_jadwal() {
        jadwalPage.setClickJadwalTipe();
        delay(2);
        jadwalPage.setClickChooseTipeJadwal1();
        extentTest.log(LogStatus.PASS, "User choose Jadwal");
    }

    @And("User choose Date")
    public void user_choose_date(){
        jadwalPage.setClickDate();
        delay(2);
        jadwalPage.setChooseDate();
        extentTest.log(LogStatus.PASS, "User choose Date");
    }

    @And("User input jadwal kerja")
    public void user_input_jadwal_kerja(){
        jadwalPage.setInputJadwalTipe("CS Live Tiktik");
        delay(3);
        extentTest.log(LogStatus.PASS, "User input jadwal kerja");
    }


    @And("User choose hari kerja")
    public void user_choose_hari_kerja(){
        jadwalPage.setClickModalHariKerja();
        delay(3);
        jadwalPage.setBtnBatalTerapkan();
        delay(2);
        jadwalPage.setClickModalHariKerja();
        delay(3);
        jadwalPage.setClickMHK1();
        delay(2);
        jadwalPage.setClickChooseMHK1();
        delay(2);
        jadwalPage.setClickMHK2();
        delay(2);
        jadwalPage.setClickChooseMHK2();
        delay(3);
        jadwalPage.setClickMHK3();
        delay(2);
        jadwalPage.setClickChooseMHK3();
        delay(2);
        jadwalPage.setClickMHK4();
        delay(2);
        jadwalPage.setClickChooseMHK4();
        delay(2);
        jadwalPage.setClickMHK5();
        delay(2);
        jadwalPage.setClickChooseMHK5();
        delay(2);
        jadwalPage.setClickMHK6();
        delay(2);
        jadwalPage.setClickChooseMHK6();
        delay(3);
        jadwalPage.setClickMHK7();
        delay(2);
        jadwalPage.setClickChooseMHK7();
        delay(3);
        jadwalPage.setBtnTerapkan();
        extentTest.log(LogStatus.PASS, "User choose hari kerja");
    }

    @And("User input keterlambatan")
    public void user_input_keterlambatan(){
        jadwalPage.setInputKeterlambatan("26");
        delay(2);
        extentTest.log(LogStatus.PASS, "User input keterlambatan");
    }

    @And("User click Button Save Add")
    public void user_click_button_save_add(){
        jadwalPage.setBtnTambahJadwal();
        delay(2);
        extentTest.log(LogStatus.PASS, "User click Button Save Add");
    }

    // ##TCC 002
    @And("User search by Jadwal Name")
    public void user_search_by_jadwal_name(){
      jadwalPage.setInputSearchJadwal("CS Live Tiktik");
      delay(3);
      jadwalPage.setBtnSearchJadwal();
        extentTest.log(LogStatus.PASS, "User search by Jadwal Name");
    }

    @And("User Click Button for Popup and choose Edit")
    public void user_click_button_for_popup_and_choose_edit(){
        jadwalPage.setBtnMoreJadwal();
        delay(3);
        jadwalPage.setBtnMoreEditJadwal();
        extentTest.log(LogStatus.PASS, "User Click Button for Popup and choose Edit");
    }

    @And("User Edit Tipe Jadwal")
    public void user_edit_tipe_jadwal(){
        jadwalPage.setClickEditTipeJadwal();
        delay(3);
        jadwalPage.setClickPilihEditTipeJadwal();
        extentTest.log(LogStatus.PASS, "User Edit Tipe Jadwal");
    }

    @And("User Edit Toleransi Keterlambatan")
    public void user_edit_toleransi_keterlambatan(){
        driver.findElement(By.xpath("//*[@id=\"t_keterlambatan\"]")).clear();
        delay(3);
        jadwalPage.setInputKeterlambatan("30");
        extentTest.log(LogStatus.PASS, "User Edit Toleransi Keterlambatan");
    }

    @And("User Click Button Simpan")
    public void user_click_button_simpan(){
        delay(5);
        jadwalPage.setBtnSimpanEditJadwal();
        extentTest.log(LogStatus.PASS, "User Click Button Simpan");
    }

    // ##TCC 003
    @And("User Click Button Action for choose delete")
    public void user_click_button_action_for_choose_delete(){
        jadwalPage.setBtnMoreJadwal();
        delay(3);
        jadwalPage.setBtnMoreDeleteJadwal();
        extentTest.log(LogStatus.PASS, "User Click Button Action for choose delete");
    }

    @And("User Click Button Ya for delete")
    public void user_click_button_ya_for_delete(){
        delay(3);
        jadwalPage.setBtnKonfirmDelete();
        extentTest.log(LogStatus.PASS, "User Click Button Ya for delete");
    }

    // ##TCC 004
    @And("User empty hari kerja")
    public void user_empty_hari_kerja(){
        jadwalPage.setClickModalHariKerja();
        delay(3);
        jadwalPage.setBtnBatalTerapkan();
        extentTest.log(LogStatus.PASS, "User empty hari kerja");
    }

    @Then("User see error message for empty hari kerja")
    public void user_see_error_message_for_empty_hari_kerja() {
        delay(3);
        Assert.assertEquals(jadwalPage.getErrorMessageEmptyHariKerja(), "Isi terlebih dahulu hari kerja");
        extentTest.log(LogStatus.PASS, "User click Button Save Add for empty hari kerja");
    }

    public static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
