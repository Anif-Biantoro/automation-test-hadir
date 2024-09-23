package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AturanCuti {
    WebDriver driver;
    public AturanCuti(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id='__next']/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div/div[2]/p")
    private WebElement muiManagement;
    @FindBy(xpath = "//*[@id='__next']/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div[2]/div/div/div/div[14]/div[2]/p")
    private WebElement muiAturanCuti;
    @FindBy(xpath = "//*[@id='mui-27']")
    private WebElement search;
    @FindBy(xpath = "//*[@id='__next']/div/div[2]/div/div[1]/section/div/div/div[1]/form/div/button[1]")
    private WebElement resetBtn;
    @FindBy(xpath = "//*[@id='__next']/div/div[2]/div/div[1]/section/div/div/div[1]/form/div/button[2]")
    private WebElement searchBtn;
    @FindBy(xpath = "//*[@id='__next']/div/div[2]/div/div[1]/section/div/div/div[1]/button")
    private WebElement addAturanCuti;
    @FindBy(xpath = "//*[@id=['__next']/div/header/div/p")
    private WebElement txtAturanCuti;
    @FindBy(xpath = "//*[@id='__next']/div/div[2]/div/div[1]/section/div/div/div[2]/label/span[1]/span[1]/input")
    private WebElement switchDensePadding;
    @FindBy(xpath = "/html/body/div[13]/div[3]/div/div[2]/button[1]")
    private WebElement cancelBtn;
    @FindBy(id = "name")
    private WebElement name;
    @FindBy(id = "eligible_leave_total_month")
    private WebElement pengaturanCuti;
    @FindBy(xpath = "//*[@id='mui-32']")
    private WebElement batasTanggal;
    @FindBy(xpath = "//*[@id='mui-33']")
    private WebElement batasBulan;
    @FindBy(id = "max_carry_forward")
    private WebElement maxCuti;
    @FindBy(id = "carry_forward_total_month")
    private WebElement totalCuti;
    @FindBy(xpath = "/html/body/div[13]/div[3]/div/div[2]/button[2]")
    private WebElement addBtn;
    @FindBy(xpath = "//*[@id='__next']/div/div[2]/div/div[1]/section/div/div/div[1]/div/div/div[1]")
    private WebElement txtAdd;
    @FindBy(xpath = "//*[@id='__next']/div/div[2]/div/div[1]/section/div/div/div[2]/div[1]/table/tbody/tr[1]/td[8]/div/div/button/svg")
    private WebElement opsBtn;
    @FindBy(xpath = "/html/body/div[12]/div[3]/ul/li[1]")
    private WebElement view;
    @FindBy(xpath = "/html/body/div[12]/div[3]/ul/li[2]")
    private WebElement edit;
    @FindBy(xpath = "/html/body/div[12]/div[3]/ul/li[2]")
    private WebElement delete;
    @FindBy(xpath = "/html/body/div[13]/div[3]/div/div[2]/button[1]")
    private WebElement deleteCuti;

    public void setMuiManagement(){
        muiManagement.click();
    }
    public void setMuiAturanCuti(){
        muiAturanCuti.click();
    }
    public void setSearch(){
        search.sendKeys("Cuti Air Asia");
    }
    public void setResetBtn(){
        resetBtn.click();
    }
    public void setSearchBtn(){
        searchBtn.click();
    }
    public void setAddAturanCuti(){
        addAturanCuti.click();
    }
    public String getTxtAturanCuti(){
        return txtAturanCuti.getText();
    }
    public void setSwitchDensePadding(){
        switchDensePadding.click();
    }
    public void setName(){
        name.sendKeys("Cuti Hadir KEL 3");
    }
    public void setPengaturanCuti(){
        pengaturanCuti.sendKeys(Keys.CONTROL, "A");
        pengaturanCuti.sendKeys("12");
    }
    public void setBatasTanggal(){
        pengaturanCuti.sendKeys(Keys.CONTROL, "A");
        batasTanggal.sendKeys("2");
    }
    public void setBatasBulan(){
        pengaturanCuti.sendKeys(Keys.CONTROL, "A");
        batasBulan.sendKeys("2");
    }
    public void setMaxCuti(){
        pengaturanCuti.sendKeys(Keys.CONTROL, "A");
        maxCuti.sendKeys("2");
    }
    public void setTotalCuti(){
        pengaturanCuti.sendKeys(Keys.CONTROL, "A");
        totalCuti.sendKeys("3");
    }
    public void setAddBtn(){
        addBtn.click();
    }
    public String getTxtAdd(){
        return txtAdd.getText();
    }
    public void setOpsBtn(){
        opsBtn.click();
    }
    public void setView(){
        view.click();
    }
    public void setEdit(){
        edit.click();
    }
    public void setDelete(){
        delete.click();
    }
    public void setCancelBtn(){
        cancelBtn.click();
    }
    public void setDeleteCuti(){
        deleteCuti.click();
    }
}

