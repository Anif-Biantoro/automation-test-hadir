package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class ImportCuti {
    WebDriver driver;

    public ImportCuti (){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id='__next']/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[3]/div/div/div[2]")
    private WebElement muiImport;
    @FindBy(xpath = "//*[@id='__next']/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div[4]/div[2]/p")
    private WebElement muiImportCuti;
    @FindBy(xpath = "//*[@id='__next']/div/div[2]/div/div[1]/div/div/div/form/div[2]/div/div[3]/button")
    private WebElement downloadBtn;
    @FindBy(xpath = "//*[@id='__next']/div/div[2]/div/div[1]/div/div/div/form/div[2]/div/div[2]/button")
    private WebElement importBtn;
    @FindBy(xpath = "//*[@id='file_excel']")
    private WebElement chooseFile;
    @FindBy (xpath = "//*[@id='__next']/div/div[2]/div/div[1]/div/div/div[1]/div/div[1]")
    private WebElement txtFailedUpload;
    @FindBy (xpath = "//*[@id='__next']/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]")
    private WebElement txtSuccsesUpload;
    @FindBy (xpath = "//*[@id='__next']/div/header/div/p")
    private WebElement txtDashboard;

    public String getTxtDashboard(){
        return txtDashboard.getText();
    }

    public void setMuiImport(){
        muiImport.click();
    }
    public void setMuiImportCuti(){
        muiImportCuti.click();
    }
    public void setDownloadBtn() {
        downloadBtn.click();
        try {
            File f = new File("C:\\Users\\irfan\\Downloads\\Template_Cuti_Hadir.xlsx");
            String Name = f.getName();
            System.out.println("File Name : " + Name);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public void setImportBtn(){
        importBtn.click();
    }
    public void setChooseFile(){
        chooseFile.click();
    }
    public String setBlankFile(){
        return chooseFile.getAttribute("required");
    }
    public void setChooseFileValid(){
        chooseFile.sendKeys("C:\\Users\\irfan\\Documents\\Juara Coding Batch 17\\Test_Cuti_Hadir.xlsx");
    }
    public void setChooseFileInvalid(){
        chooseFile.sendKeys("C:\\Users\\irfan\\Documents\\Juara Coding Batch 17\\Template_Cuti_Hadir.xlsx");
    }
    public String getTxtSuccsesUplaod(){
        return txtSuccsesUpload.getText();
    }
    public String getTxtFailedUpload(){
        return txtFailedUpload.getText();
    }

}
