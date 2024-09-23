package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.ManagementUser;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class ManagementUserTest {
    private WebDriver driver;
    private LoginPage loginPage = new LoginPage();
    private ExtentTest extentTest;
    private ManagementUser managementUser = new ManagementUser();

    public ManagementUserTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @And("User Click Management List and Click User List")
    public void User_Click_Management_List(){
        managementUser.setMuiManagement();
        managementUser.setMuiUser();
        DriverSingleton.delay(2);
    }
    @And("User Click Export Button")
    public void User_Click_Management_list(){
        managementUser.setExportBtn();
        DriverSingleton.delay(2);
    }
    @Then("User Has Been Downloaded File Export Users")
    public void User_Has_Been_Downloaded_File_Export_Users(){
        managementUser.setExportBtn();
    }

    @And("User Search Name")
    public void user_seach_name(){
        managementUser.setSearchValid();
        managementUser.setSearchBtn();
    }
    @Then ("User Should See The name")
    public void user_should_see_the_name(){
        managementUser.getTxtValid();
    }
    @And ("user filter the name of user")
    public void user_filter_the_name_of_user(){
        managementUser.setFilterBtn();
        DriverSingleton.delay(2);
        managementUser.setUnit();
        DriverSingleton.delay(2);
        managementUser.setJobLevel();
        DriverSingleton.delay(2);
        managementUser.setEmployeeType();
        DriverSingleton.delay(2);
        managementUser.setJobPosistion();
        DriverSingleton.delay(2);
        managementUser.setLocationPoint();
        DriverSingleton.delay(2);
        managementUser.setStatusActive();
        DriverSingleton.delay(2);
        managementUser.setTerapkanBtn();

    }

}
