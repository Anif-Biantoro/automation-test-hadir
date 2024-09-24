package com.juaracoding;

import com.juaracoding.pages.AturanCuti;
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

public class AturanCutiTest {
    private WebDriver driver;
    private ExtentTest extentTest;
    private LoginPage loginPage = new LoginPage();
    private TombolPage tombolPage = new TombolPage();
    private AturanCuti aturanCuti = new AturanCuti();
    public AturanCutiTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
        driver.get(Constant.URL);
    }

    @Given("The User Logged in to the Hadir")
    public void User_Logged_in_to_the_Hadri_Page(){
        driver.get("https://magang.dikahadir.com/authentication/login");
        loginPage.login("admin@hadir.com","admin@hadir");
        loginPage.clickLoginBtn();
        extentTest.log(LogStatus.PASS,"User Logged in to the Hadir Page");
    }
    @When("Click Management List and Click Aturan Cuti List")
    public void Click_Management_List_and_Click_Aturan_Cuti_List(){
        aturanCuti.setMuiManagement();
        aturanCuti.setMuiManagement();
        extentTest.log(LogStatus.PASS,"Click Import List and Click Import Cuti");

    }
    @Then("User Should Move to Aturan Cuti Page")
    public void User_Should_Move_to_Aturan_Cuti_Page(){
        aturanCuti.getTxtAturanCuti();
        Assert.assertEquals(aturanCuti.getTxtAturanCuti(),"Aturan Cuti");
        extentTest.log(LogStatus.PASS,"User Should Move to Aturan Cuti Page");
    }
    @And("User Search Aturan Cuti With Valid Name")
    public void User_Search_Aturan_Cuti_With_Valid_Name(){
        aturanCuti.setName();
        aturanCuti.setPengaturanCuti();
        aturanCuti.setBatasTanggal();
        aturanCuti.setBatasBulan();
        aturanCuti.setMaxCuti();
        aturanCuti.setTotalCuti();
        aturanCuti.setAddBtn();
        extentTest.log(LogStatus.PASS,"User Search Aturan Cuti With Valid Name");
    }
    @And("User Reset Aturan Cuti")
    public void User_Reset_Aturan_Cuti(){
        aturanCuti.setResetBtn();
        extentTest.log(LogStatus.PASS,"User Reset Aturan Cuti");
    }
    @And("User Click Padding Switch")
    public void User_Click_Padding_Switch(){
        aturanCuti.setSwitchDensePadding();
        extentTest.log(LogStatus.PASS,"User Click Padding Switch");
    }
    @And("User CLick Option List and Edit Aturan CUti")
    public void User_CLick_Option_List_and_Edit_Aturan_CUti(){
        aturanCuti.setEdit();
        aturanCuti.setCancelBtn();
        extentTest.log(LogStatus.PASS,"User CLick Option List and Edit Aturan CUti");
    }
    @And("User CLick Option List and Delete Aturan CUti")
    public void User_CLick_Option_List_and_Delete_Aturan_CUti(){
        aturanCuti.setDelete();
        aturanCuti.setDeleteCuti();
        extentTest.log(LogStatus.PASS,"User CLick Option List and Delete Aturan CUti");
    }
    @And("User CLick Option List and View Aturan CUti")
    public void User_CLick_Option_List_and_View_Aturan_CUti(){
        aturanCuti.setView();
        extentTest.log(LogStatus.PASS,"User CLick Option List and View Aturan CUti");
    }
}
