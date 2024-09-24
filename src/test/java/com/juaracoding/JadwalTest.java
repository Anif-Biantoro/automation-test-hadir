package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.JadwalPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class JadwalTest {
    public static final Logger log = LoggerFactory.getLogger(ImportTest.class);

    private WebDriver driver;
    private ExtentTest extentTest;

    private LoginPage loginPage;
    private JadwalPage  jadwalPage = new JadwalPage();

    public JadwalTest(){
        driver = Hooks.driver;
        extentTest  = Hooks.extentTest;
    }

    @Given("I am logged into Hadir page and clicked the management menu")
    public void i_am_logged_into_hadir_page_and_clicked_the_management_menu(){
        DriverSingleton.getInstance("chrome");
        driver =  DriverSingleton.getDriver();
        driver.get(Constants.URL1);
        loginPage = new LoginPage();
        jadwalPage = new JadwalPage();
        loginPage.login("admin@hadir.com", "admin@hadir");
        DriverSingleton.delay(1);
        loginPage.setBtnLogin();
        DriverSingleton.delay(3);
        DriverSingleton.refreshPage();
        DriverSingleton.delay(3);
        jadwalPage.setManagementMenu();
        DriverSingleton.delay(3);
        jadwalPage.setMenuJadwal();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS, "I am logged into Hadir page and clicked the management menu");
    }

    @When("I add new work schedule")
    public void i_add_new_work_schedule(){
        DriverSingleton.delay(5);
        jadwalPage.setBtnAdd();
        extentTest.log(LogStatus.PASS, "I add new work schedule");
    }

    @And("I fill the schedule type")
    public void i_fill_the_schedule_type(){
        DriverSingleton.delay(2);
        jadwalPage.setTipe();
        extentTest.log(LogStatus.PASS, "I fill the schedule type");
    }


    @And("I fill the schedule name")
    public void i_fill_the_schedule_name(){
        //DriverSingleton.delay(2);
        //jadwalPage.klikNamaJadwalKerja();
        DriverSingleton.delay(1);
        jadwalPage.setNamaJadwalKerja("Testing");
        extentTest.log(LogStatus.PASS, "I fill the schedule name");
    }

    @And("I fill the schedule days")
    public void i_fill_the_schedule_days(){
        DriverSingleton.delay(2);
        jadwalPage.setInputHariKerja();
        DriverSingleton.delay(2);
        jadwalPage.setHariSenin();
        DriverSingleton.delay(1);
        jadwalPage.setHariSelasa();
        DriverSingleton.delay(1);
        jadwalPage.setHariRabu();
        DriverSingleton.delay(1);
        jadwalPage.setHariKamis();
        DriverSingleton.delay(1);
        jadwalPage.setHariJumat();
        DriverSingleton.delay(1);
        jadwalPage.setBtnTerapkanHari();
        extentTest.log(LogStatus.PASS, "I fill the schedule days");
    }

    @And("I fill the late tolerance")
    public void i_fill_the_late_tolerance(){
        DriverSingleton.delay(3);
        jadwalPage.setToleransiTelat("1");
        extentTest.log(LogStatus.PASS, "I fill the late tolerance");
    }

    @And("I click add new schedule")
    public void i_click_add_new_schedule(){
        DriverSingleton.delay(2);
        jadwalPage.setBtnTambahJadwal();
        DriverSingleton.delay(2);
        jadwalPage.setSearchNameBox("Testing");
        DriverSingleton.delay(1);
        jadwalPage.setBtnSearch();
        extentTest.log(LogStatus.PASS, "I click add new schedule");
    }


    @Then("I successfully added new work schedule")
    public void i_successfully_added_new_work_schedule(){
        DriverSingleton.delay(3);
        Assert.assertEquals(jadwalPage.txtJadwal(),"Testing");
        extentTest.log(LogStatus.PASS, "I successfully added new work schedule");
    }

    //
    @When("I type the name i want to search")
    public void i_type_the_name_i_want_to_search(){
        jadwalPage.setSearchNameBox("Testing");
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "I type the name i want to search");
    }

    @And("I click search button")
    public void i_click_search_button(){
        jadwalPage.setBtnSearch();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "I click search button");
    }

    @Then("I found the name")
    public void i_found_the_name(){
        Assert.assertEquals(jadwalPage.txtJadwal(),"Testing");
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS, "I found the name");
    }


    //
    @When("I click the work details")
    public void i_click_the_work_details(){
        jadwalPage.setBtnSpanJadwal();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "I click the work details");
    }

    @And("I click detail button")
    public void i_click_detail_button(){
        jadwalPage.setDetailJadwal();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "I click detail button");
    }

    @Then("I successfully view the details")
    public void i_successfully_view_the_details(){
        jadwalPage.setBtnDetailKembali();
        DriverSingleton.delay(1);
        Assert.assertEquals(jadwalPage.txtJadwal(),"Testing");
        extentTest.log(LogStatus.PASS, "I successfully view the details");
    }

    //
    @And("I click edit button")
    public void i_click_edit_button(){
        jadwalPage.setEditJadwal();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "I click edit button");
    }

    @Then("I close the edit details")
    public void i_close_the_edit_details(){
        jadwalPage.setBtnSimpanBatal();
        DriverSingleton.delay(2);
        Assert.assertEquals(jadwalPage.txtJadwal(),"Testing");
        extentTest.log(LogStatus.PASS, "I close the edit details");
    }

    //
    @And("I click delete button")
    public void i_click_delete_button(){
        jadwalPage.setDeleteJadwal();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "I click delete button");
    }

    @Then("I cancel the delete")
    public void i_cancel_the_delete(){
        jadwalPage.setBtnNoDelete();
        DriverSingleton.delay(1);
        Assert.assertEquals(jadwalPage.txtJadwal(),"Testing");
        extentTest.log(LogStatus.PASS, "I cancel the delete");
    }

    //
    @And("I click reset search button")
    public void i_click_reset_search_button(){
        jadwalPage.setBtnReset();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "I click reset search button");
    }

    @Then("It should be blank")
    public void it_should_be_blank(){
        DriverSingleton.delay(1);
        extentTest.log(LogStatus.PASS, "It should be blank");
    }

    //
    @When("Scroll down to the bottom page")
    public void scroll_down_to_the_bottom_page(){
        DriverSingleton.refreshPage();
        DriverSingleton.delay(2);
        jadwalPage.scrollToBottom();
        DriverSingleton.delay(1);
        extentTest.log(LogStatus.PASS, "Scroll down to the bottom page");
    }

    @And("I click rows button")
    public void i_click_rows_button(){
        jadwalPage.setBtnSpanRow();
        DriverSingleton.delay(1);
        extentTest.log(LogStatus.PASS, "I click rows button");
    }

    @And("I change it to five row")
    public void i_change_it_to_five_row(){
        jadwalPage.setRowLima();
        DriverSingleton.delay(1);
        extentTest.log(LogStatus.PASS, "I change it to five row");
    }

    @And("I click next page and click previous page")
    public void i_click_next_page_and_click_previous_page(){
        jadwalPage.setNextPage();
        DriverSingleton.delay(2);
        jadwalPage.setPrevPage();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "I click next page and click previous page");
    }

    @And("I click last page and click first page")
    public void i_click_last_page_and_click_first_page(){
        jadwalPage.setLastPage();
        DriverSingleton.delay(2);
        jadwalPage.setFirstPage();
        extentTest.log(LogStatus.PASS, "I click last page and click first page");
    }

    @Then("The pages options is working correctly")
    public void the_pages_options_is_working_correctly(){
        DriverSingleton.delay(1);
        extentTest.log(LogStatus.PASS, "The pages options is working correctly");
    }
}
