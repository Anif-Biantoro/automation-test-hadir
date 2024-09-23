package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.ImportCuti;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.TombolPage;
import com.juaracoding.utils.Constant;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ImportTest {
    private WebDriver driver;
    private ExtentTest extentTest;
    private LoginPage loginPage = new LoginPage();
    private TombolPage tombolPage = new TombolPage();
    private ImportCuti importCuti = new ImportCuti();

    public ImportTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("Click Import List and Click Import Cuti")
    public void Click_Import_List_and_Click_Import_Cuti(){
        DriverSingleton.delay(2);
        importCuti.setMuiImport();
        importCuti.setMuiImportCuti();
        extentTest.log(LogStatus.PASS,"Click Import List and Click Import Cuti");
        }
    @Then("User Should Move To Import Cuti Page")
    public void User_Should_Move_To_Import_Cuti_Page(){
        DriverSingleton.delay(2);
        Assert.assertEquals(importCuti.getTxtDashboard(),"Import Cuti");
        extentTest.log(LogStatus.PASS,"User Should Move To Import Cuti Page");
    }
    @And("User Download Template Cuti")
    public void User_Download_Template_Cuti(){
        DriverSingleton.delay(2);
        importCuti.setDownloadBtn();
        extentTest.log(LogStatus.PASS,"User Download Template Cuti");
    }
    @And("User Upload File Cuti With Empty File")
    public void User_Upload_File_Cuti_With_Empty_File() {
        importCuti.setImportBtn();
        extentTest.log(LogStatus.PASS, "User Upload File Cuti With Empty File");

    }
    @Then("User should see error message Empt")
    public void User_should_see_error_mesage_empty(){
        importCuti.setBlankFile();
        Assert.assertEquals(importCuti.setBlankFile(),"false");
        extentTest.log(LogStatus.PASS, "User should see error message Empty");
    }
    @And("User Upload Flie Cuti")
    public void User_Upload_Flie_Cuti(){
        DriverSingleton.delay(2);
        importCuti.setChooseFileValid();
        importCuti.setImportBtn();
        extentTest.log(LogStatus.PASS,"User Upload Flie Cuti");
    }
    @And("User Upload File Cuti With Invalid File")
    public void User_Upload_File_Cuti_With_Invalid_File(){
        DriverSingleton.delay(2);
        importCuti.setChooseFileInvalid();
        importCuti.setImportBtn();
        extentTest.log(LogStatus.PASS,"User Upload File Cuti With Invalid File");
    }
    @Then("User Should See Error Message")
    public void User_Should_See_Error_Message(){
        DriverSingleton.delay(2);
        Assert.assertEquals(importCuti.getTxtFailedUpload(),"Gagal import excel");
        extentTest.log(LogStatus.PASS,"User Should See Error Message");

    }
    }
