package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.ManagementUser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.juaracoding.utils.Hooks.driver;

public class ManagementUserTest {
    private LoginPage loginPage = new LoginPage();
    private ManagementUser managementUser = new ManagementUser(driver);

    @Given("User is on login page for login")
    public void User_Is_On_Login_Page_For_Login(){
        driver.get("https://magang.dikahadir.com/authentication/login");

    }
    @When("User enters valid email and password for login")
    public void user_Enters_Valid_Email_And_Password_For_Login() {
        loginPage.login("admin@hadir.com","admin@hadir");
        DriverSingleton.delay(2);
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

}
