package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    public LogoutPage(){
        WebDriver driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    // locator use Page Factory
    @FindBy(xpath = "//input[@id='email']")
    private WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnLogin;
    @FindBy(xpath = "//h5[@class='MuiTypography-root MuiTypography-h5 css-5shv7u']")
    private WebElement profile;
    @FindBy(xpath = "//*[@id=\"profile-menu\"]/div[3]/ul/div/button[2]")
    private WebElement btnLogout;

    @FindBy(xpath = "//h6[contains(@class, 'header-breadcrumb')]")
    private WebElement txtDashboard;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    private WebElement txtInvalid;
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    private WebElement txtErrorMessage; ////Required

    //ubah menjadi method params
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

    public void clickProfile() {
        profile.click();
    }

    public WebElement clickbtnLogout() {
        return btnLogout;
    }

    public void clearUsername(){
        username.sendKeys(Keys.CONTROL+"a");
        username.sendKeys(Keys.DELETE);
    }
    public void clearPassword(){
        password.sendKeys(Keys.CONTROL+"a");
        password.sendKeys(Keys.DELETE);
    }



    public void logout(){
        profile.click();
        btnLogout.click();

    }
    public String getTxtDashboard(){
        return txtDashboard.getText();
    }
    public String getTxtInvalid(){
        return txtInvalid.getText();
    }
    public String getTxtErrorMessage(){
        return txtErrorMessage.getText();
    }
}