package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KoreksiPage {private WebDriver driver;

    public KoreksiPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    // locator use Page Factory
    @FindBy(xpath = "//p[normalize-space()='Laporan']")
    private WebElement menuLaporan;
    @FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-aqx7sf'][normalize-space()='Koreksi'])[1]")
    private WebElement menukoreksi;
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

//    @FindBy(xpath = "(//*[name()='svg'][contains(@class,'feather feather-more-vertical')])[1]")
//    private WebElement titikTiga;
//    @FindBy(xpath = "(//li[@role='menuitem'][normalize-space()='Approval Koreksi'])[1]")
//    private WebElement approvalKoreksi;
//    @FindBy(xpath = "(//li[@role='menuitem'][normalize-space()='Reject Koreksi'])[1]")
//    private WebElement rejectKoreksi;

//    @FindBy(xpath = "//input[@id='rejectReason']")
//    private WebElement alasanReject;
//    @FindBy(xpath = "//button[normalize-space()='Tolak']")
//    private WebElement tolakReject;


//    @FindBy(xpath = "//button[normalize-space()='Setujui']")
//    private WebElement btnSetujui;
//    @FindBy(xpath = "//button[normalize-space()='Batal']")
//    private WebElement btnBatal;

//    public void clickTitikTiga(){
//        DriverSingleton.delay(1);
//        titikTiga.click();
//    }
//
//    public void clickApprov(){
//        approvalKoreksi.click();
//    }
//    public void clickReject(){
//        DriverSingleton.delay(1);
//        rejectKoreksi.click();
//    }
//    public void clickTolakReject(){
//        DriverSingleton.delay(1);
//        tolakReject.click();
//    }
//    public void clickSetujui(){
//        DriverSingleton.delay(1);
//        btnSetujui.click();
//    }
//    public void clickBatal(){
//        DriverSingleton.delay(2);
//        btnBatal.click();
//    }
//    public void alasanReject(String alasanReject){
//        this.alasanReject.sendKeys(alasanReject);
//        DriverSingleton.delay(2);
//    }


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
        DriverSingleton.delay(5);
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
    public void clickMenuKoreksi(){
        DriverSingleton.delay(3);
        menukoreksi.click();
    }

    public void inputName(String inputName){
        this.inputName.sendKeys(inputName);
    }


    public void clearName(){
        inputName.sendKeys(Keys.CONTROL+"a");
        inputName.sendKeys(Keys.DELETE);
    }



}

