package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LaporanSemuaPage {
    WebDriver driver;

    public LaporanSemuaPage(WebDriver driver){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[normalize-space()='Laporan']")
    private WebElement menuLaporan;
    @FindBy(xpath = "//p[normalize-space()='Semua']")
    private WebElement menuSemua;
    @FindBy(xpath = "//input[@id='search']")
    private WebElement inputSearch;
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/form/div/div[2]/div/button[3]")
    private WebElement buttonSearch;
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement buttonReset;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/form/div/div[1]/div[2]/div[1]/div/div/button")
    private WebElement buttonCalendar;
    //    @FindBy(xpath = "//div[@id='__next']/div/div[2]/div/div/div/div/div/div[2]/form/div/div/div[3]/div/div/div/div[2]/span/span/select")
//    private WebElement chooseMonth;
//    @FindBy(xpath = "//span[@class='rdrYearPicker']//select")
//    private WebElement chooseYear;
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/div/div[1]/div/div[2]/form/div/div[1]/div[3]/div/div/div[1]/div[3]/div/div[2]/button[1]")
    private WebElement startDate;
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/div/div[1]/div/div[2]/form/div/div[1]/div[3]/div/div/div[1]/div[3]/div/div[2]/button[20]")
    private WebElement endDate;
    @FindBy(xpath = "//button[normalize-space()='save']")
    private WebElement buttonSaveCalendar;
    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium css-1k0lhp1']//*[name()='svg']")
    private WebElement buttonFilter;
    @FindBy(xpath = "/html/body/div[3]/div[3]/div/form/div[1]/div/div/div/div/div")
    private WebElement inputJobDepartment;
    @FindBy(xpath = "//button[text()=\"Terapkan\"]")
    private WebElement buttonTerapkan;
    @FindBy(xpath = "//button[text()='Batal']")
    private WebElement buttonBatalFilter;
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div[1]/div/table/tbody/tr[1]/td[2]/h6")
    private WebElement txtSearchByName;
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div[1]/div/table/tbody/tr[2]/td[4]/h6[1]")
    private WebElement txtSearchByCalendar;
    @FindBy(xpath = "//button[@class='rdrDay rdrDayHovered']//span[contains(text(),'7')]")
    private WebElement invalidStartDate;
    @FindBy(xpath = "//button[@class='rdrDay rdrDayHovered']//span[contains(text(),'8')]")
    private WebElement invalidEndDate;
    @FindBy(xpath = "//p[@class='MuiTablePagination-displayedRows css-kim0d']")
    private WebElement txtInvalidDate;
    @FindBy(xpath = "//p[@class='MuiTablePagination-displayedRows css-kim0d']")
    private WebElement txtInvalidSearchByName;
    @FindBy(xpath = "//*[@id='__next']/div/header/div/p")
    private WebElement txtHeaderSemua;

    //method

    public void goToMenuLaporan(){
        menuLaporan.click();
    }
    public void goToMenuSemua(){
        menuSemua.click();
    }
    public void setButtonCalendar(){
        buttonCalendar.click();
    }

//    public void setChooseMonth(){
//        chooseMonth.sendKeys(Keys.ARROW_UP);
//        chooseMonth.sendKeys(Keys.ENTER);
//    }

//    public void setChooseYear(String inputYear){
//        chooseYear.sendKeys(inputYear);
//        chooseYear.sendKeys(Keys.ENTER);
//    }

    public void startDate(){
        startDate.click();
    }
    public void endDate(){
        endDate.click();
    }

    public void buttonSaveCalendar(){
        buttonSaveCalendar.click();
    }
    public void buttonSearch(){
        buttonSearch.click();
    }
    public void searchInputName(String inputSearch){
        this.inputSearch.sendKeys(inputSearch);
    }

    public void buttonFilter(){
        buttonFilter.click();
    }
    public void enterInputFilter(){
        inputJobDepartment.sendKeys(Keys.ENTER);
        buttonTerapkan.click();
    }
    public void buttonReset(){
        buttonReset.click();
    }

    public void buttonTerapkan(){
        buttonTerapkan.click();
    }

    //method awal
    public void inputJobDepartment(String inputJobDepartment){
        this.inputJobDepartment.sendKeys(inputJobDepartment);
        this.inputJobDepartment.sendKeys(Keys.ENTER);
    }
    public void searchFilter(String inputJobDepartment){
        buttonFilter.click();
        this.inputJobDepartment.sendKeys(inputJobDepartment);
        DriverSingleton.delay(3);
    }

    public void inputJobDepartment() {
        //inputJobDepartment.sendKeys("BCA");
        Select inputJobDepartment = new Select(driver.findElement(By.xpath("//*[@id=\"job_departement\"]")));
        DriverSingleton.delay(2);
        inputJobDepartment.selectByVisibleText("BCA");
        buttonTerapkan.click();
    }

    //validasi
    public String txtHeaderSemua(){
        return txtHeaderSemua.getText();
    }
    public String getTxtSearchByName(){
        return txtSearchByName.getText();
    }
    public String getTxtSearchByCalendar(){
        return txtSearchByCalendar.getText();
    }
    public String getTxtInvalidDateCalendar(){
        return txtInvalidDate.getText();
    }
    public String getTxtInvalidSearchByName(){
        return txtInvalidSearchByName.getText();
    }

}
