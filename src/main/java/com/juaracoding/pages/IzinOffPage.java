package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IzinOffPage {

    private WebDriver driver;

    public IzinOffPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    // locator use Page Factory
    @FindBy(xpath = "//p[normalize-space()='Laporan']")
    private WebElement menuLaporan;
    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-aqx7sf'][normalize-space()='Izin Off']")
    private WebElement menuIzinOff;
    @FindBy(xpath = "//input[@id='search']")
    private WebElement inputSearch;
    @FindBy(xpath = "//input[@id='name']")
    private WebElement inputName;

    @FindBy(xpath = "//input[@placeholder='Start Date']")
    private WebElement startDate;
    @FindBy(xpath = "//input[@placeholder='End Date']")
    private WebElement endDate;
    @FindBy(xpath = "//button[normalize-space()='save']")
    private WebElement btnsave;
    @FindBy(xpath = "///button[normalize-space()='cancel']")
    private WebElement btnCancel;


    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement btnReset;
    @FindBy(xpath = "//button[normalize-space()='Search']")
    private WebElement btnSearch;

    // Fitur Search
    public void inputSearch(String inputSearch){
        this.inputSearch.sendKeys(inputSearch);
        DriverSingleton.delay(2);
    }

    public void clickSearch(){
        DriverSingleton.delay(3);
        btnSearch.click();
    }
    public void clickReset(){
        DriverSingleton.delay(1);
        btnReset.click();
    }
    public void startDate(String startDate){
        DriverSingleton.delay(1);
        this.startDate.sendKeys(startDate);
    }
    public void endDate(String endDate){
        DriverSingleton.delay(4);
        this.endDate.sendKeys(endDate);
    }
    public void clickBtnSave(){
        DriverSingleton.delay(1);
        btnsave.click();
    }
    public void clickBtnCancel(){
        DriverSingleton.delay(1);
        btnCancel.click();
    }






    public void clickMenuLaporan(){
        menuLaporan.click();
    }
    public void clickMenuIzinOff(){
        menuIzinOff.click();
    }

    public void inputName(String inputName){
        this.inputName.sendKeys(inputName);
    }


    public void clearName(){
        inputName.sendKeys(Keys.CONTROL+"a");
        inputName.sendKeys(Keys.DELETE);
    }



}
