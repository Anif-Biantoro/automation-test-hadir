package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.ManagementUnitPage;
import com.juaracoding.utils.Constants;
import com.juaracoding.utils.Hooks;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.juaracoding.drivers.DriverSingleton.delay;

public class ManagementUnitTest {
    private ExtentTest extentTest;

    private WebDriver driver = Hooks.driver;
    private LoginPage loginPage = new LoginPage(driver);
    private ManagementUnitPage managementUnitPage = new ManagementUnitPage(driver);

    public ManagementUnitTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    //1
    @Given("Click the management button")
    public void click_the_management_button(){
        driver.get(Constants.URL);
        loginPage.enterEmail("admin@hadir.com");
        delay(1);
        loginPage.enterPassword("admin@hadir");
        delay(2);
        loginPage.clickLoginButton();
        managementUnitPage.setManagementButton();
        extentTest.log(LogStatus.PASS,"Click the management button");
    }

    @When("Click the unit button")
    public void click_the_unit_button(){
        managementUnitPage.setUnitButton();
        extentTest.log(LogStatus.PASS,"Click the unit button");
    }

    @And("Enter department name in the search")
    public void enter_department_name_in_the_search(){
        managementUnitPage.setSearch("APP Jakarta");
        extentTest.log(LogStatus.PASS,"Enter department name in the search");
    }

    @And("Click search")
    public void click_search(){
        managementUnitPage.setSearchButton();
        extentTest.log(LogStatus.PASS,"Click search");
        delay(3);
    }

    @And("Display the department name")
    public void display_the_department_name(){
        Assert.assertEquals(managementUnitPage.getNamaDepartment(),"APP Jakarta");
        extentTest.log(LogStatus.PASS,"Display the department name");
    }

    @And("Display the release date")
    public void display_the_release_date(){
        Assert.assertEquals(managementUnitPage.getTanggalBuat(),"11 Jan 2023");
        extentTest.log(LogStatus.PASS,"Display the release date");
        delay(3);
    }

    @Then("Display the update date")
    public void display_the_update_date(){
        Assert.assertEquals(managementUnitPage.getTanggalUpdate(),"30 Nov 2023");
        extentTest.log(LogStatus.PASS,"Display the update date");
        delay(3);
    }

    //2
    @And("Click reset")
    public void click_reset(){
        managementUnitPage.setReset();
        extentTest.log(LogStatus.PASS,"Click reset");
    }

    @Then("Return to default view")
    public void return_to_default_view(){
        Assert.assertEquals(managementUnitPage.getDefaultDepartment(),"1-10 of 249");
        extentTest.log(LogStatus.PASS,"Return to default view");
        delay(3);
    }

    //3
//    @When("Click rows per page")
//    public void click_row_per_page(){
//        managementUnitPage.setRowPerPage();
//        extentTest.log(LogStatus.PASS,"Click row per page");
//    }

//    @And("Click the number of rows per page")
//    public void click_the_number_of_rows_per_page(){
//        managementUnitPage.setNumRowPerPage();
//        extentTest.log(LogStatus.PASS,"Click the number of rows per page");
//    }

//    @Then("Page size increases")
//    public void page_size_increases(){
//        Assert.assertEquals(managementUnitPage.getDataCount(),"1-5 of 248");
//        extentTest.log(LogStatus.PASS,"Page size increases");
//    }

////    //4
//    @When("Click add button to enter the new department")
//    public void click_add_button_to_enter_the_new_department(){
//        managementUnitPage.setTambahkanButton();
//        extentTest.log(LogStatus.PASS,"Click add button to enter the new department");
//    }
////
//    @And("Enter the department name")
//    public void enter_the_department_name(){
//        managementUnitPage.sendTambahkan("Pabrik Emas");
//        extentTest.log(LogStatus.PASS,"Enter the department name");
//    }
////
//    @And("Click add")
//    public void click_add(){
//        managementUnitPage.setTambahButton();
//        extentTest.log(LogStatus.PASS,"Click Add");
//    }
////
//    @Then("The entered department name appears")
//    public void the_entered_department_name_appears(){
//        Assert.assertEquals(managementUnitPage.setTxtNamaDepartment(),"Pabrik Emas");
//        extentTest.log(LogStatus.PASS,"The entered department name appears");
//    }
//
//    //TCC.HW.005
//    @And("Klik batal")
//    public void klik_batal(){
//        managementUnitPage.setBatalButton();
//        extentTest.log(LogStatus.PASS,"Klik batal");
//    }
//
//    @Then("Data baru batal dimasukkan")
//    public void data_baru_batal_dimasukkan(){
//        Assert.assertEquals(managementUnitPage.getDataCount(),"1-25 of 72");
//        extentTest.log(LogStatus.PASS,"Data baru batal dimasukkan");
//    }
//    //TCC.HW.006
//    @Then("Mendapatkan alert")
//    public void mendapatkan_alert(){
//        Assert.assertEquals(managementUnitPage.getTambahkanInput(),"true");
//        extentTest.log(LogStatus.PASS,"Mendapatkan alert");
//    }
//
//    //TCC.HW.007
//    @Given("Input nama department yang sudah ada dalam database")
//    public void input_nama_department_yang_sudah_ada_dalam_database(){
//        managementUnitPage.sendTambahkan("AAA Compe");
//        extentTest.log(LogStatus.PASS,"Input nama department yang sudah ada dalam database");
//    }
//    @Then("Tetap dalam tampilan Tambah Departements")
//    public void tetap_dalam_tampilan_tambah_departements(){
//        Assert.assertEquals(managementUnitPage.getTitle(), "Tambah Departements");
//        extentTest.log(LogStatus.PASS,"Tetap dalam tampilan Tambah Departements");
//    }
//
//    //TCC.HW.008
//    @Given("Klik kebab menu pada data yang ingin di edit")
//    public void klik_kebab_menu_pada_data_yang_ingin_di_edit(){
//        managementUnitPage.setKebabButton();
//        extentTest.log(LogStatus.PASS,"Klik kebab menu pada data yang ingin di edit");
//    }
//    @When("Klik edit")
//    public void klik_edit(){
//        managementUnitPage.setEditButton();
//        extentTest.log(LogStatus.PASS,"Klik edit");
//    }
//
//    @And("Input edit nama department")
//    public void input_edit_nama_department(){
//        managementUnitPage.inputEdit("ABB Compe");
//        extentTest.log(LogStatus.PASS,"Input edit nama department");
//    }
//
//    @And("Klik simpan")
//    public void klik_simpan(){
//        managementUnitPage.setSimpanButton();
//        extentTest.log(LogStatus.PASS,"Klik simpan");
//    }
//
//    @Then("Nama department berhasil di update")
//    public void nama_department_berhasil_di_update(){
//        Assert.assertEquals(managementUnitPage.getEditData(),"ABB Compe");
//        extentTest.log(LogStatus.PASS,"Nama department berhasil di update");
//    }
//
//    //TCC.HW.009
//    @And("Klik batal pada edit")
//    public void klik_batal_pada_edit(){
//        managementUnitPage.setBatalEditButton();
//        extentTest.log(LogStatus.PASS,"Klik batal pada edit");
//    }
//
//    @Then("Nama department tidak di update")
//    public void nama_department_tidak_di_update(){
//        Assert.assertEquals(managementUnitPage.getEditData(),"ABB Compe");
//        extentTest.log(LogStatus.PASS,"Nama department tidak di update");
//    }
//
//    //TCC.HW.010
//    @And("Hapus inputan")
//    public void hapus_inputan(){
//        managementUnitPage.inputEdit("");
//        extentTest.log(LogStatus.PASS,"Hapus inputan");
//    }
}
