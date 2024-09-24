package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImportPage {

    private WebDriver driver;

    public ImportPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[normalize-space()='Import']")
    private WebElement importMenu;

    @FindBy(xpath = "//p[normalize-space()='Import Absen']")
    private WebElement importAbsen;

    @FindBy(xpath = "//input[@id='selfie']")
    private WebElement chooseFile;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnImport;

    @FindBy(xpath = "//button[normalize-space()='Download Template']")
    private WebElement btnTemplate;

    @FindBy(xpath = "//div[@class='MuiBox-root css-1isemmb']")
    private WebElement txtImportAbsen;

    @FindBy(xpath = "//*[@id=\"selfie\"]")
    private WebElement requiredFile;

    @FindBy(xpath = "//div[@role='alert']")
    private WebElement templateAlert;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[1]/div/div/div[1]/div/div[2]")
    private WebElement importSuccess;


    public void setImportAbsen(){
        importMenu.click();
        importAbsen.click();
    }

    public void setChooseFile(){
        chooseFile.sendKeys("C:\\Users\\daffa\\Downloads\\DATA_ABSEN_HADIR.xlsx");
    }

    public void setWrongFile(){
        chooseFile.sendKeys("C:\\Users\\daffa\\Downloads\\Dokumen QA Software Testing.xlsx");
    }
    public void setBtnImport(){
        btnImport.click();
    }

    public void setBtnTemplate(){
        btnTemplate.click();
    }

    public boolean isRequiredFile(){
        String required = requiredFile.getAttribute("required");
        return required != null && required.equals("true");
    }

    public String getTemplateAlert(){
        return templateAlert.getText();
    }

    public String getImportSucess(){
        return importSuccess.getText();
    }



}
