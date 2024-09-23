package com.juaracoding;

import com.juaracoding.pages.KalenderPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.juaracoding.utils.Hooks;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class KalenderSteps {
        //Assert hanya bisa digunakan di anotasi @Then
        private WebDriver driver = Hooks.driver;
        private LoginPage loginPage = new LoginPage(driver);
        private KalenderPage kalenderPage = new KalenderPage(driver);
        private ExtentTest extentTest;

    public KalenderSteps(){
        extentTest = Hooks.extentTest;
    }

        //TCC 01
        @Given("User is on login page for kalender")
        public void user_is_on_login_page_for_kalender() {
            driver.get(Constants.URL);
            extentTest.log(LogStatus.PASS, "User is on login page for kalender");
        }


        @When("User enters valid email and password for kalender")
        public void user_enters_valid_email_and_password_for_kalender() {
            loginPage.enterEmail("admin@hadir.com");
            delay(1);
            loginPage.enterPassword("admin@hadir");
            delay(2);
            extentTest.log(LogStatus.PASS, "User enters valid email and password for kalender");
        }


        @And("User clicks login button for kalender")
        public void user_clicks_login_button_on_kalender() {
            loginPage.clickLoginButton();
            extentTest.log(LogStatus.PASS, "User clicks login button for kalender");
        }


        @When("User should be redirected to dashboard for kalender")
        public void user_should_be_redirected_to_dashboard_for_kalender() {
            delay(1);
            driver.getCurrentUrl();
            delay(3);
            extentTest.log(LogStatus.PASS, "User should be redirected to dashboard for kalender");
        }

        @And("User click Management Menu for kalender")
        public void user_click_management_menu_for_kalender() {
            kalenderPage.setBtnMenu();
            delay(2);
            extentTest.log(LogStatus.PASS, "User click Management Menu for kalender");
        }

        @And("User Click kalender")
        public void user_click_kalender() {
            kalenderPage.setClickKalender();
            delay(3);
            extentTest.log(LogStatus.PASS, "User Click kalender");
        }

        @When("User click on Button Tambah Kalender")
        public void user_click_on_button_tambah_kalender() {
            kalenderPage.setBtnTambahKalender();
            delay(2);
            extentTest.log(LogStatus.PASS, "User click on Button Tambah Kalender");
        }

        @And("User input on Field Kalender")
        public void user_input_on_Field_Kalender(){
            kalenderPage.setKalenderField("Libur Cuti Bersama");
            delay(2);
            extentTest.log(LogStatus.PASS, "User input on Field Kalender");
        }

        @And("User click Tambah Button")
        public void user_click_tambah_button() {
            kalenderPage.setButtonTambah();
            delay(5);
            extentTest.log(LogStatus.PASS, "User click Tambah Button");
        }

        @When("User on Search Field to searching recently added")
        public void user_on_search_field_to_searching_recently_added(){
            kalenderPage.setSearchField("Libur Cuti Bersama");
            delay(3);
            extentTest.log(LogStatus.PASS, "User on Search Field to searching recently added");
        }

        @And("user click search button")
        public void user_click_search_button(){
            kalenderPage.setButtonSearch();
            delay(5);
            extentTest.log(LogStatus.PASS, "user click search button");
        }

        @And("user click button action for view")
        public void user_click_button_action_for_view() {
            kalenderPage.setButtonAction();
            delay(3);
            kalenderPage.setButtonView();
            extentTest.log(LogStatus.PASS, "user click button action for view");
        }

        @When("user click button Tambahkan kalender")
        public void user_click_button_tambahkan_kalender() {
            kalenderPage.setButtonTambahkanKalenderView();
            delay(2);
            extentTest.log(LogStatus.PASS, "user click button Tambahkan kalender");
        }

        @And("user choose Tanggal Cuti")
        public void user_choose_tanggal_cuti(){
            kalenderPage.setClickPilihTanggal();
            delay(2);
            kalenderPage.setChoosePilihTanggal();
            delay(2);
            extentTest.log(LogStatus.PASS, "user choose Tanggal Cuti");
        }

        @And("user choose Tipe Cuti")
        public void user_choose_tipe_cuti() {
            kalenderPage.setClickTipeCuti();
            delay(2);
            kalenderPage.setChooseTipeCuti();
            delay(2);
            extentTest.log(LogStatus.PASS, "user choose Tipe Cuti");
        }

        @And("user input Deskripsi Tanggal")
        public void user_input_deskripsi_tanggal(){
            kalenderPage.setInputDeskripsiTanggal("Libur Lebaran");
            delay(2);
            extentTest.log(LogStatus.PASS, "user input Deskripsi Tanggal");
        }

        @And("user click button Tambah")
        public void user_click_button_tambah(){
            kalenderPage.setButtonSimpanTambahkanKalender();
            delay(3);
            extentTest.log(LogStatus.PASS, "user click button Tambah");
        }

        //TCC 02
        @When("User enters empty Field Kalender")
        public void user_enters_empty_field_kalender(){
            kalenderPage.setKalenderField("");
            delay(2);
            extentTest.log(LogStatus.PASS, "User enters empty Field Kalender");
        }

        @Then("User should see an error message after click Tambah Button")
        public void user_should_see_an_error_message_after_click_tambah_button(){
            kalenderPage.getErrorMessageKalender();
            delay(2);
            System.out.println(kalenderPage.getErrorMessageKalender());
            extentTest.log(LogStatus.PASS, "User should see an error message after click Tambah Button");
        }

        public static void delay(long detik){
            try {
                Thread.sleep(detik*1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
