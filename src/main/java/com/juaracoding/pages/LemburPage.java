package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LemburPage {

    private WebDriver driver;

    public LemburPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailUser;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordUser;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnLogin;

    @FindBy(xpath = "//img[@alt='Lembur']")
    private WebElement btnLembur;

    @FindBy(xpath = "//button[normalize-space()='Ajukan Lembur']")
    private WebElement btnAjukanLembur;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div/p")
    private WebElement txtAjukanLembur;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div/form/div/div[1]/div/div/div/button/svg")
    private WebElement calenderMasuk;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div/form/div/div[2]/div/div/div/button/svg")
    private WebElement calenderKeluar;

    @FindBy(xpath = "//*[@id=\"mui-1\"]")
    private WebElement ketikMasuk;

    @FindBy(xpath = "//*[@id=\"mui-2\"]")
    private WebElement ketikKeluar;

    @FindBy(xpath = "//*[@id=\"notes\"]")
    private WebElement isiCatatan;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div/form/div/div[4]/button[1]")
    private WebElement btnReset;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div/form/div/div[4]/button[2]")
    private WebElement btnAccept;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-15et00z']")
    private WebElement txtAcc; // Jika sudah berhasil ajukan kembali ke Halaman Lembur

    @FindBy(xpath = "//*[@id=\"mui-1-helper-text\"]")
    private WebElement txtRequiredMasuk;

    @FindBy(xpath = "//*[@id=\"mui-2-helper-text\"]")
    private WebElement txtRequiredKeluar;

    @FindBy(xpath = "//*[@id=\"notes-helper-text\"]")
    private WebElement txtRequiredCatatan;


    public void login(String emailUser, String passwordUser){
        this.emailUser.sendKeys(emailUser);
        this.passwordUser.sendKeys(passwordUser);

    }

    public void setBtnLogin(){
        btnLogin.click();
    }

    public void setBtnLembur(){ btnLembur.click();}

    public void setBtnAjukanLembur(){ btnAjukanLembur.click();}

    public void clickKetikMasuk(){
        ketikMasuk.click();
    }

    public void clickKetikKeluar(){
        ketikKeluar.click();
    }

    public void clickNotes(){
        isiCatatan.click();
    }

    public void setKetikMasuk(String ketikMasuk){

        this.ketikMasuk.sendKeys(ketikMasuk); // 20 08 2020, 70:00
    }

    public void setKetikKeluar(String ketikKeluar){
        this.ketikKeluar.sendKeys(ketikKeluar); // 20 08 2020, 71:00
    }

    public void setIsiCatatan(String isiCatatan){
        this.isiCatatan.sendKeys(isiCatatan); // testing
    }

    public void setBtnReset(){
        btnReset.click();
    }

    public void setBtnAccept(){
        btnAccept.click();
    }

    public String getTxtRequiredMasuk(){
        return txtRequiredMasuk.getText(); // Jam masuk harus di isi!
    }

    public String getTxtRequiredKeluar(){
        return txtRequiredKeluar.getText(); // Jam Keluar harus di isi!
    }

    public String getTxtRequiredCatatan(){
        return txtRequiredCatatan.getText(); // Masukan minimal 5 karakter
    }

    public String getTxtHalamanLembur(){
        return txtAcc.getText(); // Halaman Lembur
    }

    public String cekReset(){
        return isiCatatan.getText();
    }















}
