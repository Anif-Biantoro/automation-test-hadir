package com.juaracoding.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbsensiMobilePage {

    WebDriver driver;

    public AbsensiMobilePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement inputEmailLogin;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement inputPasswordLogin;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement masukButton;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    private WebElement absenMasukButton;

    @FindBy(xpath = "//form/button")
    private WebElement absenMasukButton2;

    @FindBy(xpath = "//div[2]/div/input")
    private WebElement jamAbsen;

    @FindBy(xpath = "//form/div[2]/div[2]/div/div")
    private WebElement workFrom;

    @FindBy(xpath = "//li[(text() = 'Work From Office' or . = 'Work From Office')]")
    private WebElement workFromOffice;

    @FindBy(xpath = "//li[(text() = 'Work From Home' or . = 'Work From Home')]")
    private WebElement workFromHome;

    @FindBy(xpath = "//input[@name='notes']")
    private WebElement notesAbsen;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    private WebElement keluarButton;

    @FindBy(xpath = "//form/div/div/div/div/input")
    private WebElement jamKeluar;

    @FindBy(xpath = "//textarea[@id='mui-4']")
    private WebElement notesKeluar;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement absenPulangButton;

    @FindBy(xpath = "//p[(text() = 'ALDO ANDRE ERZHAL SYAHREZA' or . = 'ALDO ANDRE ERZHAL SYAHREZA')]")
    private WebElement userAbsen;

    @FindBy(xpath = "//button[@type='button']")
    private WebElement menuButton;

    @FindBy(xpath = "(//button[@type='button'])[7]")
    private WebElement logoutButton;


    public void setEmailLogin(String email) {
        inputEmailLogin.sendKeys(email);
    }

    public void setPasswordLogin(String password) {
        inputPasswordLogin.sendKeys(password);
    }

    public void btnMasuk() {
        masukButton.click();
    }

    public void btnAbsenMasuk() {
        absenMasukButton.click();
    }

    public void btnAbsenMasuk2() {
        absenMasukButton2.click();
    }

    public String getJamAbsen() {
        return jamAbsen.getText();
    }

    public void btnWorkFrom() {
        workFrom.click();
    }

    public void btnWorkFromOffice() {
        workFromOffice.click();
    }

    public void btnWorkFromHome() {
        workFromHome.click();
    }

    public void setNotesAbsen(String absen) {
        notesAbsen.sendKeys(absen);
    }

    public void btnKeluar() {
        keluarButton.click();
    }

    public String getJamKeluar() {
        return jamKeluar.getText();
    }

    public void setNotesKeluar(String keluar) {
        notesKeluar.sendKeys(keluar);
    }

    public void btnAbsenPulang() {
        absenPulangButton.click();
    }

    public String getUserAbsen() {
        return userAbsen.getText();
    }

    public void btnMenu() {
        menuButton.click();
    }

    public void btnLogout() {
        logoutButton.click();
    }


}