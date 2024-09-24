package com.juaracoding;

import com.juaracoding.pages.AturanCutiPage;
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

public class AturanCutiSteps {
    //Assert hanya bisa digunakan di anotasi @Then
    private WebDriver driver = Hooks.driver;
    private LoginPage loginPage = new LoginPage(driver);
    private AturanCutiPage aturanCuti = new AturanCutiPage(driver);
    private ExtentTest extentTest;

    public AturanCutiSteps(){
        extentTest = Hooks.extentTest;
    }

    //TCC 01
    @Given("User is on login page for Aturan Cuti")
    public void user_is_on_login_page_for_aturan_cuti() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User is on login page for Aturan Cuti");
    }

    @When("User enters valid email and password for Aturan Cuti")
    public void user_enters_valid_email_and_password_for_aturan_cuti() {
        loginPage.enterEmail("admin@hadir.com");
        delay(1);
        loginPage.enterPassword("admin@hadir");
        delay(2);
        extentTest.log(LogStatus.PASS, "User enters valid email and password for Aturan Cuti");
    }

    @And("User clicks login button for Aturan Cuti")
    public void user_clicks_login_button_on_aturan_cuti() {
        loginPage.clickLoginButton();
        extentTest.log(LogStatus.PASS, "User clicks login button for Aturan Cuti");
    }

    @When("User should be redirected to dashboard for Aturan Cuti")
    public void user_should_be_redirected_to_dashboard_for_aturan_cuti() {
        delay(1);
        driver.getCurrentUrl();
        delay(3);
        extentTest.log(LogStatus.PASS, "User should be redirected to dashboard for Aturan Cuti");
    }

    @And("User click Management Menu for Aturan Cuti")
    public void user_click_management_menu_for_aturan_cuti() {
        aturanCuti.setBtnMenuforAturanCuti();
        delay(2);
        extentTest.log(LogStatus.PASS, "User click Management Menu for Aturan Cuti");
    }

    @And("User Click Aturan Cuti")
    public void user_click_aturan_cuti() {
        aturanCuti.setClickAturanCuti();
        delay(3);
        extentTest.log(LogStatus.PASS, "User Click Aturan Cuti");
    }

    @When("User click on Button Tambahkan Aturan Cuti")
    public void user_click_on_button_tambahkan_aturan_cuti() {
        aturanCuti.setBtnTambahkanAturanCuti();
        delay(2);
        extentTest.log(LogStatus.PASS, "User click on Button Tambahkan Aturan Cuti");
    }

    @And("User input on Field Nama Aturan Cuti")
    public void user_input_on_field_nama_aturan_cuti(){
        aturanCuti.setInputNamaAturanCutiField("Aturan Cuti Bersama");
        delay(2);
        extentTest.log(LogStatus.PASS, "User input on Field Nama Aturan Cuti");
    }

    @And("User input on Field Eligible Pengaturan Cuti")
    public void user_input_on_field_eligible_pengaturan_cuti() {
        aturanCuti.setInputEligiblePengaturanCutiField("5");
        delay(5);
        extentTest.log(LogStatus.PASS, "User input on Field Eligible Pengaturan Cuti");
    }

    @And("user choose Tanggal Batas Sisa Cuti")
    public void user_choose_tanggal_batas_sisa_cuti(){
        aturanCuti.setClickTanggalBatasSisaCuti();
        delay(3);
        aturanCuti.setChooseTanggalBatasSisaCuti();
        delay(3);
        extentTest.log(LogStatus.PASS, "user choose Tanggal Batas Sisa Cuti");
    }

    @And("user choose Bulan Batas Sisa Cuti")
    public void user_choose_bulan_batas_sisa_cuti(){
        aturanCuti.setClickBulanBatasSisaCuti();
        delay(3);
        aturanCuti.setChooseBulanBatasSisaCuti();
        delay(3);
        extentTest.log(LogStatus.PASS, "user choose Bulan Batas Sisa Cuti");
    }

    @And("User input on Field Maksimal Sisa Cuti")
    public void user_input_on_field_maksimal_sisa_cuti() {
        aturanCuti.setInputMaksimalSisaCutiField("9");
        delay(3);
        extentTest.log(LogStatus.PASS, "User input on Field Maksimal Sisa Cuti");
    }

    @When("User input on Field Jumlah Bulan Kerja Sisa Cuti")
    public void User_input_on_field_jumlah_bulan_kerja_sisa_cuti() {
        aturanCuti.setInputJumlahBulanKerjaSisaCutiField("5");
        delay(2);
        extentTest.log(LogStatus.PASS, "User input on Field Jumlah Bulan Kerja Sisa Cuti");
    }

    @And("User click Button Tambahkan Simpan Aturan Cuti")
    public void user_click_button_tambahkan_simpan_aturan_cuti(){
        aturanCuti.setBtnSimpanTambahkanAturanCuti();
        delay(7);
        extentTest.log(LogStatus.PASS, "User click Button Tambahkan Simpan Aturan Cuti");
    }

    @And("User searching recently added for Aturan Cuti")
    public void user_searching_recently_added_for_aturan_cuti() {
        aturanCuti.setInputSearchAturanCuti("Aturan Cuti Bersama");
        delay(2);
        extentTest.log(LogStatus.PASS, "User searching recently added for Aturan Cuti");
    }

    @And("user click search button Aturan Cuti")
    public void user_click_search_button_aturan_cuti(){
        aturanCuti.setBtnSearchAturanCuti();
        delay(2);
        extentTest.log(LogStatus.PASS, "user click search button Aturan Cuti");
    }

    @And("user scroll horizontal and click button action for view Aturan Cuti")
    public void user_scroll_horizontal_and_click_button_action_for_view_aturan_cuti(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement slide = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/section/div/div/div[2]/div[1]"));
        js.executeScript("arguments[0].scrollBy(0, 300);", slide);
        delay(3);
        aturanCuti.setBtnAction();
        delay(2);
        aturanCuti.setBtnView();
        delay(2);
        extentTest.log(LogStatus.PASS, "user scroll horizontal and click button action for view Aturan Cuti");
    }

    @When("user click button Tambahkan Detail Aturan Cuti")
    public void user_click_button_tambahkan_detail_aturan_cuti(){
        aturanCuti.setBtnTambahkanDetailAturanCuti();
        delay(2);
        extentTest.log(LogStatus.PASS, "user click button Tambahkan Detail Aturan Cuti");
    }

    @And("User input on Field Minimal Bulan Bekerja")
    public void User_input_on_field_minimal_bulan_bekerja(){
        aturanCuti.setInputMinimalBulanBekerjaField("2");
        delay(2);
        extentTest.log(LogStatus.PASS, "User input on Field Minimal Bulan Bekerja");
    }

    @And("User input on Field Total Cuti")
    public void User_input_on_field_total_cuti(){
        aturanCuti.setInputTotalCutiField("7");
        delay(3);
        extentTest.log(LogStatus.PASS, "User input on Field Total Cuti");
    }

    @And("user click button Tambahkan Simpan Detail Aturan Cuti")
    public void user_click_button_tambahkan_simpan_detail_aturan_cuti(){
        aturanCuti.setBtnSimpanTambahkanDetailAturanCuti();
        delay(2);
        extentTest.log(LogStatus.PASS, "user click button Tambahkan Simpan Detail Aturan Cuti");
    }

    //##TCC 002
    @And("User empty on Field Nama Aturan Cuti")
    public void user_empty_on_field_nama_aturan_cuti(){
        aturanCuti.setInputNamaAturanCutiField("");
        delay(2);
        extentTest.log(LogStatus.PASS, "User empty on Field Nama Aturan Cuti");
    }

    @Then("User see error message with empty field nama aturan cuti")
    public void user_see_error_message_with_empty_field_nama_aturan_cuti() {
        delay(3);
        Assert.assertEquals(aturanCuti.getErrorMessageAturanCuti(), "Nama aturan cuti harus diisi!");
        extentTest.log(LogStatus.PASS, "User see error message with empty field nama aturan cuti");
    }

    public static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
