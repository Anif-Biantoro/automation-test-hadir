package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utils.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
        WebDriver driver;

        public LoginPage() {

            this.driver = DriverSingleton.getDriver();
            PageFactory.initElements(this.driver, this);
        }
        @FindBy(id = "email")
        private WebElement email;
        @FindBy(id = "password")
        private WebElement password;
        @FindBy(xpath = "//button[@type='submit']")
        private WebElement loginBtn;
        @FindBy(xpath = "//*[@id='__next']/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[1]/div/div[1]/div[2]/p")
        private WebElement txtDashboard;

        public void login(String email, String password){
            this.email.sendKeys(email);
            this.password.sendKeys(password);
        }
        public void clickLoginBtn(){
            loginBtn.click();
        }
        public String getTxtDashboard(){
            return txtDashboard.getText();
        }


    }