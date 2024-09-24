package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ManagementUnitPage {

    WebDriver driver;

    public ManagementUnitPage(WebDriver driver){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //ManagementPage Button
    @FindBy(xpath = "//p[normalize-space()='Management']")
    private WebElement managementButton;

    //ManagementPage Menu Unit
    @FindBy(xpath = "//p[normalize-space()='Unit']")
    private WebElement unitButton;

    @FindBy(xpath = "//input[@id='search']")
    private WebElement search;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchButton;

    @FindBy(xpath = "//h6[normalize-space()='APP Jakarta']")
    private WebElement namaDepartment;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/div/div/div/div[2]/div/table/tbody/tr/td[3]/h6")
    private WebElement tanggalBuat;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/div/div/div/div[2]/div/table/tbody/tr/td[4]/h6")
    private WebElement tanggalUpdate;

    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement reset;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/div/div/div/div[3]/div/div/p[2]")
    private WebElement defaultDepartment;

    //ManagementPage Tambahkan Unit
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/div/div/div/div[1]/button")
    private WebElement tambahkanButton;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement namaDepartmentInput;

    @FindBy(xpath = "//button[normalize-space()='Tambah']")
    private WebElement tambahButton;

    @FindBy(xpath = "//h6[normalize-space()='AAA Compe']")
    private WebElement txtNamaDepartment;

    @FindBy(xpath = "//button[normalize-space()='Batal']")
    private WebElement batalButton;

    @FindBy(xpath = "//div[@id='__next']/div/div[2]/div/div/div/div/div/div[3]/div/div/p[2]")
    private WebElement dataCount;

    @FindBy(id = "mui-290")
    private WebElement rowPerPageButton;

    @FindBy(xpath = "//ul[@id='mui-1']/li[3]")
    private WebElement numRowPerPage;

    @FindBy(xpath = "//*[@id=\"alert-dialog-title\"]")
    private WebElement titleTambah;

    //Edit ManagementPage Unit
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div/div[2]/div/table/tbody/tr[1]/td[4]/div/div/button")
    private WebElement kebabButton;

    @FindBy(xpath = "//div[@id='card-actions-menu']/div[3]/ul/li")
    private WebElement editButton;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement simpanButton;

    @FindBy(xpath = "//div[2]/button[2]")
    private WebElement batalEditButton;

    @FindBy(xpath = "//h6[normalize-space()='ABB Compe']")
    private WebElement editData;


    //ManagementPage Button
    public void setManagementButton(){
        DriverSingleton.delay(5);
        managementButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //ManagementPage Menu Unit
    public void setUnitButton(){
        unitButton.click();
    }

    public void setSearch(String search){
        this.search.sendKeys(search);
    }

    public void setSearchButton(){
        searchButton.click();
    }

    public String getNamaDepartment(){
        return namaDepartment.getText();
    }

    public String getTanggalBuat(){
        return tanggalBuat.getText();
    }

    public String getTanggalUpdate(){
        return tanggalUpdate.getText();
    }

    public void setReset(){
        reset.click();
    }

    public String getDefaultDepartment(){
        return defaultDepartment.getText();
    }

    public void setRowPerPage(){
        rowPerPageButton.click();
    }

    public void setNumRowPerPage(){
        numRowPerPage.click();
    }

    public String getDataCount(){
        DriverSingleton.delay(3);
        return dataCount.getText();
    }


    //ManagementPage Tambahkan Unit
    public void setTambahkanButton(){
        DriverSingleton.delay(3);
        tambahkanButton.click();
    }

    public void sendTambahkan(String tambahkan){
        namaDepartmentInput.sendKeys(tambahkan);
    }

    public String getTambahkanInput(){
        return namaDepartmentInput.getAttribute("required");
    }

    public void setTambahButton(){
        DriverSingleton.delay(3);
        tambahButton.click();
    }

    public void setBatalButton(){
        DriverSingleton.delay(3);
        batalButton.click();
    }

    public String setTxtNamaDepartment(){
        return txtNamaDepartment.getText();
    }

    public String getTitle(){
        DriverSingleton.delay(3);
        return titleTambah.getText();
    }

    //Edit management Unit
    public void setKebabButton(){
        DriverSingleton.delay(3);
        kebabButton.click();
    }

    public void setEditButton(){
        editButton.click();
    }

    public void setSimpanButton(){
        simpanButton.click();
    }

    public void setBatalEditButton(){
        batalEditButton.click();
        DriverSingleton.delay(3);
    }

    public void inputEdit(String namaDepartmentInput){
        this.namaDepartmentInput.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        this.namaDepartmentInput.sendKeys(namaDepartmentInput);
    }

    public String getEditData(){
        return editData.getText();
    }

}
