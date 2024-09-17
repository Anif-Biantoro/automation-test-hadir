package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAdminPage {

    private WebDriver driver;

    public LoginAdminPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement adminEmail;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement adminPass;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnAdminMasuk;


    public void adminLogin(String adminEmail, String adminPass){
        this.adminEmail.sendKeys(adminEmail);
        this.adminPass.sendKeys(adminPass);
    }

    public void setBtnAdminMasuk(){ btnAdminMasuk.click();}
}
