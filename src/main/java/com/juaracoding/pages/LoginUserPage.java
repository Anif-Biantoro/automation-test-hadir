package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginUserPage {
    public LoginUserPage(){
        WebDriver driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='email']")
    private WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnLogin;


    public void loginform(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
    }
    public void inputUsername(String username) {

        this.username.sendKeys(username);
    }

    public void inputPassword(String password) {

        this.password.sendKeys(password);
    }
    public void clickBtnLogin() {
        btnLogin.click();
    }


}
