package com.juaracoding.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DayOffPage {

    WebDriver driver;
    public DayOffPage(WebDriver driver) {
        driver.manage().window().maximize();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        WebElement sidebar = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[4]"));
//        js.executeScript("window.scrollBy(0,300)", sidebar);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorInherit MuiIconButton-sizeLarge css-17vpiyo']//*[name()='svg']")
    private WebElement sidebarButton;

    @FindBy(xpath = "//p[normalize-space()='Management']")
    private WebElement managementButton;

    @FindBy(xpath = "//p[normalize-space()='Day Off']")
    private WebElement dayOffButton;

//    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorInherit MuiIconButton-edgeStart MuiIconButton-sizeLarge css-nza314']//*[name()='svg']")
//    private WebElement sidebarCloseButton;
//
//
//    public WebElement getSidebarCloseButton() {
//        return sidebarCloseButton;
//    }

    public WebElement getSidebarButton() {
        return sidebarButton;
    }

    public WebElement getManagementButton() {
        return managementButton;
    }

    public WebElement getDayOffButton() {
        return dayOffButton;
    }
}
