package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavbarAdminPage {

    private WebDriver driver;

    public NavbarAdminPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//p[normalize-space()='Import']")
    private WebElement navbarImport;

    @FindBy(xpath = "//p[normalize-space()='Import Status Aktif']")
    private WebElement navbarImportStatusAktif;

    @FindBy(xpath = "//p[normalize-space()='Management']")
    private WebElement navbarManagement;

    @FindBy(xpath = "//p[normalize-space()='Divisi']")
    private WebElement navbarDivisi;


    public void btnNavbarImport(){
        navbarImport.click();
    }

    public void btnNavbarImportStatusAktif(){
        navbarImportStatusAktif.click();
    }

    public void btnNavbarManagement(){
        navbarManagement.click();
    }

    public void btnNavbarDivisi(){
        navbarDivisi.click();
    }
}
