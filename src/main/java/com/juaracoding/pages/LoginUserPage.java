package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
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
    private WebElement seePassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnMasuk;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1qamc72']")
    private WebElement txtAccountNotFound;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1qamc72']")
    private WebElement txtInvalidAccount;

}
