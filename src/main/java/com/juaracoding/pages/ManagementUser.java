package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

import java.io.File;

public class ManagementUser {
    WebDriver driver;


    public ManagementUser (WebDriver driver){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//*[@id='__next']/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div/div[2]/p")
    private WebElement muiManagement;
    @FindBy(xpath = "//*[@id='__next']/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div[2]/div/div/div/div[1]/div[2]/p")
    private WebElement muiUser;
    @FindBy(id = "search")
    private WebElement search;
    @FindBy(xpath = "//*[@id='__next']/div/div[2]/div/div[1]/div/div[1]/div/div[2]/div/form/div/div/div[3]/button")
    private WebElement searchBtn;
    @FindBy(xpath = "//*[@id='__next']/div/div[2]/div/div[1]/div/div[1]/div/div[2]/div/form/div/div/div[2]/button")
    private WebElement resetBtn;
    @FindBy(xpath = "//*[@id='__next']/div/div[2]/div/div[1]/div/div[1]/div/div[2]/div/form/div/div/div[4]/button")
    private WebElement filterBtn;
    @FindBy(xpath = "//*[@id='__next']/div/div[2]/div/div[1]/div/div[1]/div/div[2]/div/form/div/div/div[1]/div[1]/div")
    private WebElement muiSearch;
    @FindBy(xpath = "//*[@id='mui-47']/li[1]")
    private WebElement muiName;
    @FindBy(xpath = "//*[@id='mui-47']/li[2]")
    private WebElement muiNik;
    @FindBy(xpath = "//*[@id='__next']/div/div[2]/div/div[1]/div/div[2]/div/div[1]/button")
    private WebElement exportBtn;
    @FindBy(xpath = "//*[@id='mui-component-select-job_departement_id']")
    private WebElement unit;

    @FindBy(xpath = "//*[@id='mui-component-select-job_level_id']")
    private WebElement jobLevel;

    @FindBy(xpath = "//*[@id='mui-component-select-employee_type_id']")
    private WebElement employeeType;

    @FindBy(xpath = "//*[@id='mui-component-select-job_position_id']")
    private WebElement jobPosistion;

    @FindBy(xpath = "//*[@id='mui-component-select-location_point_id']")
    private WebElement locationPoint;

    @FindBy(xpath = "//*[@id='demo-select-small']")
    private WebElement status;
    @FindBy(xpath = "/html/body/div[13]/div[3]/div/form/div[2]/button[1]")
    private WebElement cancelBtn;
    @FindBy(xpath = "/html/body/div[13]/div[3]/div/form/div[2]/button[2]")
    private WebElement terapkanBtn;
    @FindBy(xpath = "//*[@id='__next']/div/div[2]/div/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[2]/td[2]/div/h5")
    private WebElement txtValidID;


    public void setMuiManagement(){
        muiManagement.click();
    }
    public void setMuiUser(){
        muiUser.click();
    }
    public void setSearchValid(){
        search.sendKeys("A Derry ramadhan");
    }
    public void setSearchInvalid(){
        search.sendKeys("Bimo Satrio Mukti");
    }
    public void setSearchBtn(){
        searchBtn.click();
    }
    public String getTxtValid(){
        return txtValidID.getText();
    }
    public void setFilterBtn(){
        filterBtn.click();
    }
    public void setUnit(){
        unit.click();

    }
    public void setJobLevel(){
        jobLevel.click();

    }
    public void setEmployeeType(){
        employeeType.click();

    }
    public void setJobPosistion(){
        jobPosistion.click();

    }
    public void setLocationPoint(){
        locationPoint.click();

    }
    public void setStatusActive(){
        status.click();
        DriverSingleton.delay(1);

    }
    public void setStatusDeactive(){
        status.click();
        DriverSingleton.delay(1);
    }
    public void setTerapkanBtn(){
        terapkanBtn.click();
    }
    public void setCancelBtn(){
        cancelBtn.click();
    }
    public void setResetBtn(){
        resetBtn.click();
    }
    public void setExportBtn(){
        exportBtn.click();
        try {
            File f = new File("C:\\Users\\irfan\\Documents\\Juara Coding Batch 17\\export-users.xlsx");
            String Name = f.getName();
            System.out.println("File Name : " + Name);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
