package com.juaracoding.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KehadiranPage {

    WebDriver driver;

    public KehadiranPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/form/div/div[1]/div[2]/div[1]/div/div/button")
    private WebElement clickDateInput;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/form/div/div[1]/div[3]/div/div/div[1]/div[3]/div/div[2]/button[1]")
    private WebElement chooseStartDate;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/form/div/div[1]/div[3]/div/div/div[1]/div[3]/div/div[2]/button[20]")
    private WebElement chooseEndDate;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/div/div[1]/div/div[2]/form/div/div[1]/div[3]/div/div/div[2]/button[2]")
    private WebElement saveButton;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/form/div/div[2]/div/button[3]")
    private WebElement searchButton;

    @FindBy(xpath = "//input[@id='search']")
    private WebElement txtField;

    @FindBy(xpath = "//button[normalize-space()='Export']")
    private WebElement exportButton;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/form/div[1]/p")
    private WebElement confirmationMessage;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement confirmExportButton;

    @FindBy(xpath = "//p[normalize-space()='Laporan']")
    private WebElement laporanButton;

    @FindBy(xpath = "//p[normalize-space()='Kehadiran']")
    private WebElement kehadiranButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/form/div/div[1]/div[3]/div/div/div[1]/div[3]/div/div[2]/button[1]")
    public WebElement emptyStartDate;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/form/div/div[1]/div[3]/div/div/div[1]/div[3]/div/div[2]/button[20]")
    public WebElement emptyEndDate;

    public void setClickDateInput() {
        clickDateInput.click();
    }

    public void setChooseStartDate() {
        chooseStartDate.click();
    }

    public void setChooseEndDate() {
        chooseEndDate.click();
    }

    public void clickButton(String button) {
        if (button.equals("Save")) {
            saveButton.click();
        } else if (button.equals("Search")) {
            searchButton.click();
        } else if (button.equals("Export")) {
            exportButton.click();
        }
    }

    public void enterTxt(String txt) {
        txtField.sendKeys(txt);
    }

    public WebElement getLaporanButton() {
        return laporanButton;
    }

    public WebElement getKehadiranButton() {
        return kehadiranButton;
    }

    public void verifyReportUpdated() {
    }

    public void leaveDateFieldsEmpty() {
    }

    public String getConfirmationMessage() {
        return confirmationMessage.getText();
    }

    public void clickConfirmExport() {
        confirmExportButton.click();
    }

    public void verifyErrorMessage(String errorMessage) {
    }
}
