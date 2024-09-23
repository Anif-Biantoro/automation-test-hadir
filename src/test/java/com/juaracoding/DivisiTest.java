package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.DivisiPage;
import com.juaracoding.pages.LoginAdminPage;
import com.juaracoding.pages.NavbarAdminPage;
import com.juaracoding.utils.Constans;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DivisiTest {

    private WebDriver driver;
    private LoginAdminPage loginAdminPage = new LoginAdminPage();
    private NavbarAdminPage navbarAdminPage = new NavbarAdminPage();
    private DivisiPage divisiPage = new DivisiPage();
    private ExtentTest extentTest;

    public DivisiTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    //TCC HADIR 0004
    @Given("I am logged in to the admin web")
    public void i_am_logged_in_to_the_admin_web(){
        driver.get(Constans.URLWEB);
        DriverSingleton.delay(2);
        loginAdminPage.adminLogin("admin@hadir.com","admin@hadir");
        loginAdminPage.setBtnAdminMasuk();
        extentTest.log(LogStatus.PASS,"I am logged in to the admin web");
    }

    @And("I am on divisi page")
    public void i_am_on_divisi_page(){
        DriverSingleton.delay(2);
        navbarAdminPage.btnNavbarManagement();
        navbarAdminPage.btnNavbarDivisi();
        extentTest.log(LogStatus.PASS,"I am on divisi page");
    }

    @When("I clicked button Tambahkan")
    public void i_clicked_button_tambahkan(){
        DriverSingleton.delay(2);
        divisiPage.setBtnTambahkan();
        extentTest.log(LogStatus.PASS,"I clicked button Tambahkan");
    }

    @And("I input new name division")
    public void i_input_new_name_division(){
        DriverSingleton.delay(2);
        divisiPage.inputNamaDivisi("3D Artist");
        extentTest.log(LogStatus.PASS,"I input new name division");
    }

    @Then("I clicked button Tambah")
    public void i_clicked_button_tambah(){
        DriverSingleton.delay(2);
        divisiPage.setBtnTambah();
        extentTest.log(LogStatus.PASS,"I clicked button Tambah");
    }

    @And("I should see message successful add division")
    public void i_should_see_message_successful_add_division(){
        DriverSingleton.delay(2);
        Assert.assertEquals(divisiPage.getTxtSuccessfulPopUp(),"Berhasil Menambahkan Divisi");
        extentTest.log(LogStatus.PASS,"I should see message successful add division");
    }

    //TCC HADIR 0005
    @Then("I clicked button Batal")
    public void i_clicked_button_batal(){
        DriverSingleton.delay(2);
        divisiPage.setBtnBatal();
        extentTest.log(LogStatus.PASS,"I clicked button Batal");
    }

    //TCC HADIR 0006
    @And("I input name division on search field")
    public void i_input_name_division_on_search_field(){
        DriverSingleton.delay(2);
        divisiPage.inputSearch("3D Artist");
        extentTest.log(LogStatus.PASS,"I input name division on search field");
    }

    @Then("I clicked button Search")
    public void i_clicked_button_search(){
        divisiPage.setBtnSearch();
        extentTest.log(LogStatus.PASS,"I clicked button Search");
    }

    @And("I should see the name division on the list")
    public void i_should_see_the_name_division_on_the_list(){
        DriverSingleton.delay(2);
        Assert.assertEquals(divisiPage.getTxtNamaDivisi(),"3D Artist");
        divisiPage.clearFieldSearch();
        extentTest.log(LogStatus.PASS,"I should see the name division on the list");
    }

    //TCC HADIR 0007
    @And("I input name division that is not available in the list")
    public void i_input_name_division_that_is_not_available_in_the_list(){
        DriverSingleton.delay(2);
        divisiPage.inputSearch("2D animator");
        extentTest.log(LogStatus.PASS,"I input name division that is not available in the list");
    }

    //TCC HADIR 0008
    @Then("I clicked button Reset")
    public void i_clicked_button_reset(){
        DriverSingleton.delay(2);
        divisiPage.setBtnReset();
        extentTest.log(LogStatus.PASS,"I clicked button Reset");
    }

    //TCC HADIR 0009
    @And("I clicked button Edit")
    public void i_clicked_button_edit(){
        DriverSingleton.delay(2);
        divisiPage.setBtnShowMore();
        divisiPage.setBtnEdit();
        extentTest.log(LogStatus.PASS,"I clicked button Edit");
    }

    @And("I change name division")
    public void i_change_name_division(){
        DriverSingleton.delay(2);
        divisiPage.inputEditDivisi("3D Animator");
        extentTest.log(LogStatus.PASS,"I change name division");
    }

    @Then("I clicked button Simpan")
    public void i_clicked_button_simpan(){
        divisiPage.setBtnSimpan();
        extentTest.log(LogStatus.PASS,"I clicked button Simpan");
    }

    @And("I should see message successful edit division")
    public void i_should_see_message_successful_edit_division(){
        DriverSingleton.delay(2);
        Assert.assertEquals(divisiPage.getTxtSuccessfulPopUp(),"Berhasil Edit Divisi");
        extentTest.log(LogStatus.PASS,"I should see message successful edit division");
    }

    //TCC HADIR 0010
    @And("I clicked button Delete")
    public void i_clicked_button_delete(){
        DriverSingleton.delay(2);
        divisiPage.setBtnShowMore();
        divisiPage.setBtnDelete();
        extentTest.log(LogStatus.PASS,"I clicked button Delete");
    }

    @Then("I clicked button Ya")
    public void i_clicked_button_ya(){
        DriverSingleton.delay(2);
        divisiPage.setBtnYa();
        extentTest.log(LogStatus.PASS,"I clicked button Ya");
    }

    @And("I should see message successful delete division")
    public void i_should_see_message_successful_delete_division(){
        DriverSingleton.delay(2);
        Assert.assertEquals(divisiPage.getTxtSuccessfulPopUp(),"Berhasil Delete Divisi");
        extentTest.log(LogStatus.PASS,"I should see message successful delete division");
        DriverSingleton.closeObjectInstance();
    }

}
