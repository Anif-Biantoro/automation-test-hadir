package com.juaracoding.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-aqx7sf'][normalize-space()='Dashboard']")
    private WebElement dashboardButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div[1]/div/div[1]/div/h3")
    private WebElement totalKaryawan;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/div/p")
    private WebElement jumlahTotalKaryawan;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div[2]/div/div[1]/div/h3")
    private WebElement karyawanAbsen;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[1]/div/div[2]/div/div[2]/div[1]/p")
    private WebElement jumlahKaryawanAbsen;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[1]/div/div[3]/div/div[1]/div/h3")
    private WebElement karyawanWfh;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[1]/div/div[3]/div/div[2]/div[1]/p")
    private WebElement jumlahKaryawanWfh;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[1]/div/div[4]/div/div[1]/div/h3")
    private WebElement karyawanCuti;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[1]/div/div[4]/div/div[2]/div[1]/p")
    private WebElement jumlahKaryawanCuti;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[1]/div/div[5]/div/div[1]/div/h3")
    private WebElement karyawanSakit;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[1]/div/div[5]/div/div[2]/div[1]/p")
    private WebElement jumlahKaryawanSakit;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[1]/div/div[6]/div/div[1]/div/h3")
    private WebElement karyawanIzin;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[1]/div/div[6]/div/div[2]/div[1]/p")
    private WebElement jumlahKaryawanIzin;



    public void btnDashboard() {
        dashboardButton.click();
    }

    public String getTotalKaryawan() {
        return totalKaryawan.getText();
    }

    public String getJumlahTotalKaryawan() {
        return jumlahTotalKaryawan.getText();
    }

    public String getKaryawanAbsen() {
        return karyawanAbsen.getText();
    }

    public String getJumlahKaryawanAbsen() {
        return jumlahKaryawanAbsen.getText();
    }

    public String getKaryawanWfh() {
        return karyawanWfh.getText();
    }

    public String getJumlahKaryawanWfh() {
        return jumlahKaryawanWfh.getText();
    }

    public String getKaryawanCuti() {
        return karyawanCuti.getText();
    }

    public String getJumlahKaryawanCuti() {
        return jumlahKaryawanCuti.getText();
    }

    public String getKaryawanSakit() {
        return karyawanSakit.getText();
    }

    public String getJumlahKaryawanSakit() {
        return jumlahKaryawanSakit.getText();
    }

    public String getKaryawanIzin() {
        return karyawanIzin.getText();
    }

    public String getJumlahKaryawanIzin() {
        return jumlahKaryawanIzin.getText();
    }



}
