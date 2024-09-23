package com.juaracoding.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CutiUserPage {

    WebDriver driver;
    public CutiUserPage(WebDriver driver) {
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)");
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@alt='Cuti']")
    private WebElement cutiButton;

    @FindBy(xpath = "//button[normalize-space()='Ajukan Cuti']")
    private WebElement ajukanCutitButton;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div/div/button[2]")
    private WebElement infoCutiButton;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div/div/button[1]")
    private WebElement formCutiButton;


    public WebElement getCutiButton() {
        return cutiButton;
    }

    public WebElement getAjukanCutitButton() {

        return ajukanCutitButton;
    }

    public WebElement getInfoCutiButton() {

        return infoCutiButton;
    }


    public WebElement getFormCutiButton() {
        return formCutiButton;
    }

}
