package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginUserPage {
    private WebDriver driver;

    public LoginUserPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yhx7lq']//*[name()='svg']")
    private WebElement btnSeePassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnMasuk;

    @FindBy(xpath = "//div[@class='MuiAlert-message css-1xsto0d']")
    private WebElement txtFailedElement;

    //image
    @FindBy(xpath = "//img[@alt='bg']")
    private WebElement imageLogo;


    public void login(String email, String password){
        this.email.sendKeys(email);
        this.password.sendKeys(password);
    }

    public void clearAllField(){
        email.sendKeys(Keys.CONTROL+"A");
        email.sendKeys(Keys.DELETE);

        password.sendKeys(Keys.CONTROL+"A");
        password.sendKeys(Keys.DELETE);
    }

    public String popUpMessage(){
        return email.getAttribute("email");
    }

    public void setBtnSeePassword(){ btnSeePassword.click();}

    public void setBtnMasuk(){ btnMasuk.click();}

    public String getTxtFailedElement(){ return txtFailedElement.getText();}

    public void backButton(){
        driver.navigate().back();
    }

    //image branding
    public boolean setImage(){
        return imageLogo.isDisplayed();
    }

}
