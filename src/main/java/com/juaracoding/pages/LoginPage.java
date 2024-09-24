package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnLogin;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/div/button[3]/div/div[2]/h5[2]")
    private WebElement userDrop;

    @FindBy(xpath = "//*[@id=\"profile-menu\"]/div[3]/ul/div/button[2]")
    private WebElement btnLogout;

    public void login(String email, String password){
        this.email.sendKeys(email);
        this.password.sendKeys(password);
    }

    public void setBtnLogin(){
        btnLogin.click();
    }

    public void clearPassword(){
        password.sendKeys(Keys.CONTROL+"A");
        password.sendKeys(Keys.DELETE);
    }

    public void clearUsername(){
        email.sendKeys(Keys.CONTROL+"A");
        email.sendKeys(Keys.DELETE);
    }

    public void logout(){
        userDrop.click();
        btnLogout.click();
    }
}
