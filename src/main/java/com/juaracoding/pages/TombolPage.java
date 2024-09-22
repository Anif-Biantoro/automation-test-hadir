package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TombolPage {
    WebDriver driver;

    public TombolPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id='__next']/div/div[2]/div/div[1]/div/div[2]/div/div[3]/div/div/div[3]/button[3]")
    private WebElement nextPage;
    @FindBy(xpath = "//*[@id='__next']/div/div[2]/div/div[1]/div/div[2]/div/div[3]/div/div/div[3]/button[2]")
    private WebElement previousPage;
    @FindBy(xpath = "//*[@id='__next']/div/div[2]/div/div[1]/div/div[2]/div/div[3]/div/div/div[3]/button[4]")
    private WebElement lastPage;
    @FindBy(xpath = "//*[@id='__next']/div/div[2]/div/div[1]/div/div[2]/div/div[3]/div/div/div[3]/button[1]")
    private WebElement firstPage;
    @FindBy(id = "mui-54")
    private WebElement rowList;
    @FindBy(xpath = "//*[@id='mui-53']/li[1]")
    private WebElement row5;
    @FindBy(xpath = "//*[@id='mui-53']/li[2]")
    private WebElement row10;
    @FindBy(xpath = "//*[@id='mui-53']/li[3]")
    private WebElement row25;

    public void setNextPage(){
        nextPage.click();
    }

    public void setPreviousPage(){
        previousPage.click();
    }

    public void setLastPage(){
        lastPage.click();
    }

    public void setFirstPage(){
        firstPage.click();
    }
    public void setRowList(){
        rowList.click();
    }
    public void setRow5(){
        row5.click();
    }
    public void setRow10(){
        row10.click();
    }
    public void setRow25(){
        row25.click();
    }
}
