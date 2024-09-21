package com.juaracoding.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LemburPage {

    WebDriver driver;
    public LemburPage(WebDriver driver) {
        driver.manage().window().maximize();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        WebElement sidebar = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[4]"));
//        js.executeScript("window.scrollBy(0,300)", sidebar);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorInherit MuiIconButton-sizeLarge css-17vpiyo']//*[name()='svg']")
    private WebElement sidebarButton;

    @FindBy(xpath = "//body/div[@id='__next']/div[@class='css-10f63sf']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiDrawer-root MuiDrawer-docked css-1tu59u4']/div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1yw4omu']/div[@data-simplebar='init']/div[@class='simplebar-wrapper']/div[@class='simplebar-mask']/div[@class='simplebar-offset']/div[@aria-label='scrollable content']/div[@class='simplebar-content']/div[@class='MuiBox-root css-10klw3m']/div[@class='sidebar MuiBox-root css-ftf74w']/div[@class='MuiBox-root css-old1by']/div[2]/div[1]/div[1]/div[2]")
    private WebElement laporanButton;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-aqx7sf'][normalize-space()='Lembur']")
    private WebElement lemburButton;

    @FindBy(xpath = "//input[@id='search']")
    private WebElement searchField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchButton;

    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement resetButton;

//    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium css-1k0lhp1']//*[name()='svg']")
//    private WebElement filterButton;

//    @FindBy(xpath = "/html/body/div[3]/div[3]/div/form/div[1]/div/div/div/div/div/fieldset")
//    private WebElement filterField;

    @FindBy(xpath = "//input[@placeholder='Start Date']")
    private WebElement startDate;

    @FindBy(xpath = "//input[@placeholder='End Date']")
    private WebElement endDate;

    @FindBy(xpath = "//button[normalize-space()='save']")
    private WebElement dateButton;

    public void enterText(String text) {
        searchField.sendKeys(text);
    }
//    public void filterField(String text) {
//        filterField.sendKeys(text);
//    }
    public void startdate(String text) {
        startDate.sendKeys(text);
    }
    public void endDate(String text) {
        endDate.sendKeys(text);
    }


//    public WebElement getSidebarButton() {
//        return sidebarButton;
//    }

    public WebElement getLaporanButton() {
        return laporanButton;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getResetButton() {
        return resetButton;
    }

    public WebElement getLemburButton() {
        return lemburButton;
    }
    public WebElement getDateButton() {
        return dateButton;
    }

//    public WebElement getFilterButton() {
//        return filterButton;
//    }
}
