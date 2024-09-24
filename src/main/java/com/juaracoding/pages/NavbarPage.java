package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavbarPage {
    WebDriver driver;

    public NavbarPage(WebDriver driver){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[normalize-space()='Import']")
    private WebElement navbarImport;

    @FindBy(xpath = "//p[normalize-space()='Import Struktur User']")
    private WebElement navbarImportStrukturUser;

    @FindBy(xpath = "//p[normalize-space()='Management']")
    private WebElement navbarManagement;

    @FindBy(xpath = "//p[normalize-space()='Divisi']")
    private WebElement navbarDivisi;


    public void btnNavbarImport(){
        navbarImport.click();
    }

    public void btnNavbarImportStrukturUser(){
        navbarImportStrukturUser.click();
    }

    public void btnNavbarManagement(){
        navbarManagement.click();
    }

    public void btnNavbarDivisi(){
        navbarDivisi.click();
    }
}
