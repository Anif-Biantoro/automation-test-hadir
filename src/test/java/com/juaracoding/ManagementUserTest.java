package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.ManagementUser;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.juaracoding.utils.Hooks.driver;

public class ManagementUserTest {

    private ManagementUser managementUser = new ManagementUser(driver);
    private ExtentTest extentTest;
    private LoginPage loginPage = new LoginPage();
    public ManagementUserTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    @Given("User Click Management List and Click User List")
    public void User_Click_Management_List(){
        managementUser.setMuiManagement();
        managementUser.setMuiUser();
        DriverSingleton.delay(2);
    }
    @When("User Click Export Button")
    public void User_Click_Management_list(){
        managementUser.setExportBtn();
        DriverSingleton.delay(2);
    }
    @Then("User Has Been Downloaded File Export Users")
    public void User_Has_Been_Downloaded_File_Export_Users(){
        managementUser.setExportBtn();
    }

}
