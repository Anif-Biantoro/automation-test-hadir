package com.juaracoding.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PendaftaranUserPage {

    WebDriver driver;

    public PendaftaranUserPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators for account information fields
    @FindBy(xpath = "//p[normalize-space()='Management']")
    private WebElement managementButton;

    @FindBy(xpath = "//p[normalize-space()='Pendaftaran User']")
    private WebElement pendaftaranUserButton;

    @FindBy(xpath = "//label[@role='button']")
    private WebElement btnChooseFile;

    @FindBy(xpath = "//input[@id='nik']")
    private WebElement nik;

    @FindBy(xpath = "//input[@id='fullname']")
    private WebElement employeeName;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    // Locators for work information fields
    @FindBy(xpath = "//input[@id='divisi']")
    private WebElement division;

    @FindBy(xpath = "//input[@id='unit']")
    private WebElement unit;

    @FindBy(xpath = "//input[@id='posisi-kerja']")
    private WebElement workPosition;

    @FindBy(xpath = "//input[@id='jabatan']")
    private WebElement jobTitle;

    @FindBy(xpath = "//input[@id='tipe-kontrak']")
    private WebElement contractType;

    // Locators for attendance settings fields
    @FindBy(xpath = "//input[@id='lokasi-kerja']")
    private WebElement workLocation;

    @FindBy(xpath = "//input[@id='lokasi-kerja']")
    private WebElement shiftType;

    @FindBy(xpath = "//input[@id='jadwal-kerja']")
    private WebElement workSchedule;

    @FindBy(xpath = "//input[@id='jadwal-kerja']")
    private WebElement selfie;

    @FindBy(xpath = "//input[@id='jumlah-cuti']")
    private WebElement leaveQuota;

    // Submit button
    @FindBy(xpath = "//button[@id='submit']")
    private WebElement submitButton;

    public void setBtnChooseFile(String photoPath) {
        btnChooseFile.sendKeys(photoPath);
    }

    public void enterNIK(String nikValue) {
        nik.sendKeys(nikValue);
    }

    public void enterEmployeeName(String name) {
        employeeName.sendKeys(name);
    }

    public void enterEmail(String emailValue) {
        email.sendKeys(emailValue);
    }

    public void enterPassword(String passwordValue) {
        password.sendKeys(passwordValue);
    }

    public void selectDivision(String divisionValue) {
        division.sendKeys(divisionValue);
    }

    public void selectUnit(String unitValue) {
        unit.sendKeys(unitValue);
    }

    public void selectWorkPosition(String position) {
        workPosition.sendKeys(position);
    }

    public void selectJobTitle(String title) {
        jobTitle.sendKeys(title);
    }

    public void selectContractType(String type) {
        contractType.sendKeys(type);
    }

    public void selectWorkLocation(String location) {
        workLocation.sendKeys(location);
    }

    public void selectShiftType() {
        shiftType.click();
        shiftType.sendKeys(Keys.ARROW_DOWN);
        shiftType.sendKeys(Keys.ENTER);
    }

    public void selectWorkSchedule(String schedule) {
        workSchedule.sendKeys(schedule);
    }

    public void toggleSelfie(boolean requireSelfie) {
        if (requireSelfie) {
            selfie.click();
        }
    }

    public void enterLeaveQuota(String quota) {
        leaveQuota.sendKeys(quota);
    }

    public void clickSubmit() {
        submitButton.click();
    }

    public WebElement getManagementButton() {
        return managementButton;
    }

    public WebElement getPendaftaranUserButton() {
        return pendaftaranUserButton;
    }

    public void verifySuccessMessage() {
    }

    public void verifyUserListPage() {
    }

    public String getErrorMessage() {
        return
                email.getAttribute("email");
    }

    public void clickLoginButton() {
    }

    public void leaveRequiredFieldsEmpty() {
    }
}
