package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImportStrukturUserPage {
    WebDriver driver;

    public ImportStrukturUserPage(WebDriver driver){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[normalize-space()='Download Template']")
    private WebElement btnDownloadTemplate;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnImport;

    @FindBy(xpath = "//input[@id='selfie']")
    private WebElement btnChooseFile;

    @FindBy(xpath = "//div[@class='MuiSnackbarContent-message css-1w0ym84']")
    private WebElement txtSuccessfulImport;

    @FindBy(xpath = "//p[@id='selfie-helper-text']")
    private WebElement txtWrongFile;

    @FindBy(xpath = "//div[@class='MuiSnackbarContent-message css-1w0ym84']")
    private WebElement txtWrongFile2;

    public void setBtnDownloadTemplate(){
        btnDownloadTemplate.click();
    }

    public void setBtnImport(){
        btnImport.click();
    }

    public String getTxtSuccessfulImport(){ return txtSuccessfulImport.getText();}

    public String getTxtWrongFile(){ return txtWrongFile.getText();}

    public void uploadFile(String filepath){
        WebElement upload = btnChooseFile;
        upload.sendKeys(filepath);
    }
}
