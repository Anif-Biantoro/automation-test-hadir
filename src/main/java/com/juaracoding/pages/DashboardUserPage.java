package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardUserPage {

    private WebDriver driver;

    public DashboardUserPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//img[@alt='menu']")
    private WebElement btnNavbar;

    @FindBy(xpath = "//button[normalize-space()='Logout']")
    private WebElement btnLogout;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-ydwihx']")
    private WebElement txtNameDashboard;


    public void setBtnNavbar(){
        btnNavbar.click();
    }

    public void setBtnLogout(){
        btnLogout.click();
    }

    public String getTxtNameDashboard(){ return txtNameDashboard.getText();}

}
