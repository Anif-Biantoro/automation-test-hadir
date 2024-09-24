package com.juaracoding.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PendingPage {

    WebDriver driver;

    public PendingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3 css-1h77wgb']//div[1]//div[1]//div[1]//button[1]//*[name()='svg']")
    private WebElement startDateButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div[1]/div/form/div/div[1]/div[2]/div/div/div[1]/div[3]/div/div[2]/button[1]")
    private WebElement startDatePick;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div[1]/div/form/div/div[1]/div[2]/div/div/div[1]/div[3]/div/div[2]/button[15]")
    private WebElement endDatePick;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div[1]/div/form/div/div[1]/div[2]/div/div/div[2]/button[2]")
    private WebElement saveDate;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div[1]/div/form/div/div[2]/button")
    private WebElement filterButton;

    @FindBy(xpath = "//input[@id='job_departement']")
    private WebElement jobDepartment;

    @FindBy(xpath = "//button[@type = 'submit' and (text() = 'Terapkan' or . = 'Terapkan')]")
    private WebElement saveJobDepartment;

    @FindBy(xpath = "//li[@id='job_departement-option-0']")
    private WebElement JobDepartmentClick;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div[1]/div/form/div/div[3]/button")
    private WebElement resetButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div[1]/div/form/div/div[4]/button")
    private WebElement searchButton;


    public void btnStartDate() {
        startDateButton.click();
    }

    public void btnStartDatePick() {
        startDatePick.click();
    }


    public void btnEndDatePick() {
        endDatePick.click();
    }

    public void btnSaveDate() {
        saveDate.click();
    }

    public void btnFilter() {
        filterButton.click();
    }

    public void setJobDepartment(String job) {
        jobDepartment.sendKeys(job);
    }

    public String getJobDepartment() {
        return jobDepartment.getText();
    }

    public void btnSaveJobDepartment() {
        saveJobDepartment.click();
    }

    public void btnSaveJobDepartmentClick() {
        JobDepartmentClick.click();
    }

    public void btnReset() {
        resetButton.click();
    }

    public void btnSearch() {
        searchButton.click();
    }

}
