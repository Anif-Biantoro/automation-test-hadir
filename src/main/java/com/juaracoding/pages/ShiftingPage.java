package com.juaracoding.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShiftingPage {

    WebDriver driver;

    public ShiftingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[(text() = 'Management' or . = 'Management')]")
    private WebElement managementMenu;

    @FindBy(xpath = "//div[11]/div[2]/p")
    private WebElement shiftingBar;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement inputName;

    @FindBy(xpath = "//input[@id='job_departement']")
    private WebElement inputJob;

    @FindBy(xpath = "//li[@id = 'job_departement-option-1' and (text() = 'BCA' or . = 'BCA')]")
    private WebElement listBca;

    @FindBy(xpath = "//li[@id = 'job_departement-option-0' and (text() = 'Chef' or . = 'Chef')]")
    private WebElement listChef;

    @FindBy(xpath = "//li[@id = 'job_departement-option-0' and (text() = 'Iforte' or . = 'Iforte')]")
    private WebElement listIforte;

    @FindBy(xpath = "//input[@id='code']")
    private WebElement inputShiftCode;

    @FindBy(xpath = "//input[@id='search']")
    private WebElement inputSearch;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchButton;

    @FindBy(xpath = "(//button[@type='button'])[4]")
    private WebElement resetButton;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    private WebElement dotButton;

    @FindBy(xpath = "//div[@id='card-actions-menu']/div[3]/ul/li")
    private WebElement editButton;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement saveButton;

    @FindBy(xpath = "//div[@id='card-actions-menu']/div[3]/ul/li[2]")
    private WebElement deleteButton;

    @FindBy(xpath = "//div[2]/button")
    private WebElement deleteConfirmButton;



    public void btnManagementMenu() {
        managementMenu.click();
    }

    public void btnShiftingBar() {
        shiftingBar.click();
    }

    public void setInputSearch(String search) {
        inputSearch.sendKeys(search);
    }

    public String getInputSearch() {
        return inputSearch.getText();
    }

    public void btnSearch() {
        searchButton.click();
    }

    public void btnReset() {
        resetButton.click();
    }

    public void btnDot() {
        dotButton.click();
    }

    public void btnEdit() {
        editButton.click();
    }

    public void clearInputName() {
        inputName.clear();
    }

    public void setInputName(String name) {
        inputName.sendKeys(name);
    }

    public void setInputJob(String job) {
        inputJob.sendKeys(job);
    }

    public void btnListBca() {
        listBca.click();
    }

    public void btnListChef() {
        listChef.click();
    }

    public void btnListIforte() {
        listIforte.click();
    }

    public void setInputShiftCode(String shiftCode) {
        inputShiftCode.sendKeys(shiftCode);
    }

    public void btnSave() {
        saveButton.click();
    }

    public void btnDelete() {
        deleteButton.click();
    }

    public void btnDeleteConfirm() {
        deleteConfirmButton.click();
    }


}
