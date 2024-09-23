package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.ImportStatusAktifPage;
import com.juaracoding.pages.LoginAdminPage;
import com.juaracoding.pages.NavbarAdminPage;
import com.juaracoding.utils.Constans;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class ImportStatusAktifTest {

    private WebDriver driver;
    private LoginAdminPage loginAdminPage = new LoginAdminPage();
    private NavbarAdminPage navbarAdminPage = new NavbarAdminPage();
    private ImportStatusAktifPage importStatusAktifPage = new ImportStatusAktifPage();
    private ExtentTest extentTest;

    public ImportStatusAktifTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //TCC HADIR 0001
    @Given("I am logged in to the admin website")
    public void i_am_logged_in_to_the_admin_website(){
        driver.get(Constans.URLWEB);
        DriverSingleton.delay(2);
        loginAdminPage.adminLogin("admin@hadir.com","admin@hadir");
        loginAdminPage.setBtnAdminMasuk();
        extentTest.log(LogStatus.PASS,"I am logged in to the admin website");
    }

    @And("I am on import status aktif page")
    public void i_am_on_import_status_aktif_page(){
        DriverSingleton.delay(2);
        navbarAdminPage.btnNavbarImport();
        navbarAdminPage.btnNavbarImportStatusAktif();
        extentTest.log(LogStatus.PASS,"I am on import status aktif page");
    }

    @When("I clicked the Download Template button")
    public void i_clicked_the_download_template_button(){
        DriverSingleton.delay(2);
        importStatusAktifPage.setBtnDownloadTemplate();
        extentTest.log(LogStatus.PASS,"I clicked the Download Template button");
    }

    @Then("I successfully download the file")
    public void i_successfully_download_the_file(){
        DriverSingleton.delay(2);
        Assert.assertEquals(Utils.getfilename("C:/Users/user/Downloads/DATA_STATUS_USER.xlsx"),"DATA_STATUS_USER.xlsx");
        extentTest.log(LogStatus.PASS,"I successfully download the file");
    }

    //TCC HADIR 0002
    @And("I choose file to import")
    public void i_choose_file_to_import(){
        DriverSingleton.delay(2);
        importStatusAktifPage.uploadFile("C:/Users/user/Downloads/DATA_STATUS_USER.xlsx");
        extentTest.log(LogStatus.PASS,"I choose file to import");
    }

    @Then("I click button import")
    public void i_click_button_import(){
        DriverSingleton.delay(2);
        importStatusAktifPage.setBtnImport();
        extentTest.log(LogStatus.PASS,"I click button import");
    }

    @And("I should see message successful import excel")
    public void i_should_see_message_berhasil_import_excel(){
        DriverSingleton.delay(2);
        Assert.assertEquals(importStatusAktifPage.getTxtSuccessfulImport(),"Berhasil import excel");
        extentTest.log(LogStatus.PASS,"I should see message successful import excel");
    }

    //TCC HADIR 0003
    @And("I choose different file to import")
    public void i_choose_different_file_to_import(){
        DriverSingleton.delay(2);
        importStatusAktifPage.uploadFile("C:/Users/user/Downloads/DATA_STATUS_USER (1).pdf");
        extentTest.log(LogStatus.PASS,"I choose different file to import");
    }

    @Then("I should see error message displayed")
    public void i_should_see_error_message_displayed(){
        Assert.assertEquals(importStatusAktifPage.getTxtWrongFile(),"*File harus berupa file Excel (.xls atau .xlsx)");
        extentTest.log(LogStatus.PASS,"I should see error message displayed");
        DriverSingleton.closeObjectInstance();
    }
}
