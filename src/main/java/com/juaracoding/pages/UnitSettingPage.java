package com.juaracoding.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnitSettingPage {

    WebDriver driver;

    public UnitSettingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[normalize-space()='Unit Setting']")
    private WebElement unitSettingButton;

    @FindBy(xpath = "(//button[@type='button'])[4]")
    private WebElement addButton;

    @FindBy(xpath = "//ul[@id='mui-5']/li[7]")
    private WebElement departmentSelect;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='ASS'])[1]/following::*[name()='svg'][1]")
    private WebElement deleteButton;

    @FindBy(xpath = "//div[@id='alert-dialog-slide-description']/p")
    private WebElement confirmationMessage;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement confirmYesButton;

    public void clickAddButton() {
        addButton.click();
    }

    public void selectDepartment() {
        departmentSelect.sendKeys(Keys.ARROW_DOWN);
        departmentSelect.sendKeys(Keys.ENTER);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public By getManagementButton() {
        return By.xpath("//p[normalize-space()='Management']");
    }

    public By getUnitSettingButton() {
        return By.xpath("//p[normalize-space()='Unit Setting']");
    }

    public void getSuccessMessage() {
    }

    public void clickDeleteButton() {
        deleteButton.click();
    }

    public void getConfirmationMessage() {
    }

    public void clickConfirmYesButton() {
    }
}
