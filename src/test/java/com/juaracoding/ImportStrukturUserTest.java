package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.ImportStrukturUserPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.NavbarPage;
import com.juaracoding.utils.Constants;
import com.juaracoding.utils.Hooks;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.juaracoding.drivers.DriverSingleton.delay;


public class ImportStrukturUserTest {
    private ExtentTest extentTest;

    private WebDriver driver = Hooks.driver;
    private LoginPage loginPage = new LoginPage(driver);
    private NavbarPage navbarPage = new NavbarPage(driver);
    private ImportStrukturUserPage importStrukturUserPage = new ImportStrukturUserPage(driver);

    public ImportStrukturUserTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //TI.4-1
    @Given("I am logged in to the admin website")
    public void i_am_logged_in_to_the_admin_website(){
        driver.get(Constants.URL);
        loginPage.enterEmail("admin@hadir.com");
        delay(1);
        loginPage.enterPassword("admin@hadir");
        delay(2);
        loginPage.clickLoginButton();
        extentTest.log(LogStatus.PASS,"I am logged in to the admin website");
    }

    @When("I am on import struktur user")
    public void i_am_on_import_struktur_user_page(){
        DriverSingleton.delay(2);
        navbarPage.btnNavbarImport();
        navbarPage.btnNavbarImportStrukturUser();
        extentTest.log(LogStatus.PASS,"I am on import status aktif page");
    }

    @And("I clicked the Download Template button")
    public void i_clicked_the_download_template_button(){
        DriverSingleton.delay(2);
        importStrukturUserPage.setBtnDownloadTemplate();
        extentTest.log(LogStatus.PASS,"I clicked the Download Template button");
    }

    @Then("I successfully download the file")
    public void i_successfully_download_the_file(){
        DriverSingleton.delay(2);
        Assert.assertEquals(Utils.getfilename("C:/Users/user/Downloads/DATA_STATUS_USER.xlsx"),"DATA_STATUS_USER.xlsx");
        extentTest.log(LogStatus.PASS,"I successfully download the file");
    }

    //TL.4-2
    @And("I choose file to import")
    public void i_choose_file_to_import(){
        DriverSingleton.delay(2);
        importStrukturUserPage.uploadFile("C:\\Users\\User\\Downloads\\SQA & RPA\\HADIR\\file test\\DATA_STRUKTUR_USER.xlsx");
        extentTest.log(LogStatus.PASS,"I choose file to import");
    }

    @And("I click button import")
    public void i_click_button_import(){
        DriverSingleton.delay(2);
        importStrukturUserPage.setBtnImport();
        extentTest.log(LogStatus.PASS,"I click button import");
    }

    @Then("I should see message successful import excel")
    public void i_should_see_message_berhasil_import_excel(){
        Assert.assertEquals(importStrukturUserPage.getTxtSuccessfulImport(),"Berhasil import excel");
        extentTest.log(LogStatus.PASS,"I should see message successful import excel");
    }

    //TL.4-3
    @And("I choose different file to import")
    public void i_choose_different_file_to_import(){
        DriverSingleton.delay(2);
        importStrukturUserPage.uploadFile("C:\\Users\\User\\Downloads\\SQA & RPA\\HADIR\\file test\\DATA_STRUKTUR_USER.pdf");
        extentTest.log(LogStatus.PASS,"I choose different file to import");
    }

    @Then("I should see error message displayed")
    public void i_should_see_error_message_displayed(){
        Assert.assertEquals(importStrukturUserPage.getTxtWrongFile(),"*File harus berupa file Excel (.xls atau .xlsx)");
        extentTest.log(LogStatus.PASS,"I should see error message displayed");
    }
}

