package com.juaracoding.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JadwalPage {
    WebDriver driver;

    public JadwalPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//p[normalize-space()='Management']")
    private WebElement btnManagementmenu;

    @FindBy(xpath = "//p[normalize-space()='Jadwal']")
    private WebElement clickJadwal;

    @FindBy(xpath = "//button[normalize-space()='Tambahkan']")
    private WebElement btnTambah;

    @FindBy(xpath = "//*[@id=\"alert-dialog-slide-description\"]/div[1]/div[1]/div/div")
    private WebElement clickJadwalTipe;

    @FindBy(xpath = "//*[@id=\"alert-dialog-slide-description\"]/div[1]/div[2]/div/div/div/div/button")
    private WebElement clickDate;

    @FindBy(xpath = "/html/body/div[14]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[4]/button[4]")
    private WebElement chooseDate;

    @FindBy(xpath = "/html/body/div[14]/div[3]/ul/li[1]")
    private WebElement clickChooseTipeJadwal1;

    @FindBy(xpath = "//*[@id=\"nameJadwal\"]")
    private WebElement inputJadwalTipe;

    @FindBy(xpath = "//*[@id=\"alert-dialog-slide-description\"]/button[1]")
    private WebElement clickModalHariKerja;

    @FindBy(xpath = "/html/body/div[14]/div[3]/div/div[1]/div/div/div[1]/div[2]/div" )
    private WebElement clickMHK1;

    @FindBy(xpath = "/html/body/div[15]/div[3]/ul/li[4]")
    private WebElement clickChooseMHK1;

    @FindBy(xpath = "/html/body/div[14]/div[3]/div/div[1]/div/div/div[2]/div[2]/div" )
    private WebElement clickMHK2;

    @FindBy(xpath = "/html/body/div[15]/div[3]/ul/li[14]")
    private WebElement clickChooseMHK2;

    @FindBy(xpath = "/html/body/div[14]/div[3]/div/div[1]/div/div/div[3]/div[2]/div" )
    private WebElement clickMHK3;

    @FindBy(xpath = "/html/body/div[15]/div[3]/ul/li[5]")
    private WebElement clickChooseMHK3;

    @FindBy(xpath = "/html/body/div[14]/div[3]/div/div[1]/div/div/div[4]/div[2]/div" )
    private WebElement clickMHK4;

    @FindBy(xpath = "/html/body/div[15]/div[3]/ul/li[6]")
    private WebElement clickChooseMHK4;

    @FindBy(xpath = "/html/body/div[14]/div[3]/div/div[1]/div/div/div[5]/div[2]/div" )
    private WebElement clickMHK5;

    @FindBy(xpath = "/html/body/div[15]/div[3]/ul/li[7]")
    private WebElement clickChooseMHK5;

    @FindBy(xpath = "/html/body/div[14]/div[3]/div/div[1]/div/div/div[6]/div[2]/div" )
    private WebElement clickMHK6;

    @FindBy(xpath = "/html/body/div[15]/div[3]/ul/li[8]")
    private WebElement clickChooseMHK6;

    @FindBy(xpath = "/html/body/div[14]/div[3]/div/div[1]/div/div/div[7]/div[2]/div" )
    private WebElement clickMHK7;

    @FindBy(xpath = "/html/body/div[15]/div[3]/ul/li[9]")
    private WebElement clickChooseMHK7;

    @FindBy(xpath = "/html/body/div[14]/div[3]/div/div[2]/button[1]")
    private WebElement btnTerapkan;

    @FindBy(xpath = "/html/body/div[14]/div[3]/div/div[2]/button[2]")
    private WebElement btnBatalTerapkan;

    @FindBy(xpath = "//*[@id=\"t_keterlambatan\"]")
    private WebElement inputKeterlambatan;

    @FindBy(xpath = "/html/body/div[13]/div[3]/div/form/div[1]/div/button[2]")
    private WebElement btnAssignKaryawan;

    @FindBy(xpath = "/html/body/div[13]/div[3]/div/form/div[2]/button[1]")
    private WebElement btnTambahJadwal;

    @FindBy(xpath = "/html/body/div[13]/div[3]/div/form/div[2]/button[2]")
    private WebElement btnBatalJadwal;

    @FindBy(xpath = "//*[@id=\"search\"]")
    private WebElement inputSearchJadwal;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/div[1]/form/div/button[2]")
    private WebElement btnSearchJadwal;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/div[1]/form/div/button[1]")
    private WebElement btnResetJadwal;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/div[2]/div/table/tbody/tr/td[4]/div/div/button")
    private WebElement btnMoreJadwal;

    @FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[1]")
    private WebElement btnMoreDetailJadwal;

    @FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[2]")
    private WebElement btnMoreEditJadwal;

    @FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[3]")
    private WebElement btnMoreDeleteJadwal;

    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/button")
    private WebElement btnKembaliDetailJadwal;

    @FindBy(xpath = "//*[@id=\"typeJadwal\"]")
    private WebElement clickEditTipeJadwal;

    @FindBy(xpath = "/html/body/div[14]/div[3]/ul/li[3]")
    private WebElement clickPilihEditTipeJadwal;

    @FindBy(xpath = "/html/body/div[4]/div[3]/div/form/div[2]/button[1]")
    private WebElement btnSimpanEditJadwal;

    @FindBy(xpath = "/html/body/div[4]/div[3]/div/form/div/div[2]/button[1]")
    private WebElement btnKonfirmDelete;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/div[1]/div/div[1]")
    private WebElement errorMessageEmptyHariKerja;


    public void setBtnManagementmenu(){
        btnManagementmenu.click();
    }

    public void setClickJadwal(){
        clickJadwal.click();
    }

    public void setBtnTambah(){
        btnTambah.click();
    }

    public void setClickJadwalTipe(){
        clickJadwalTipe.click();
    }

    public void setClickDate(){
        clickDate.click();
    }

    public void setChooseDate(){
        chooseDate.click();
    }

    public void setClickChooseTipeJadwal1(){
        clickChooseTipeJadwal1.click();
    }

    public void setInputJadwalTipe(String JadwalTipe){
        inputJadwalTipe.sendKeys(JadwalTipe);
    }

    public void setClickModalHariKerja(){
        clickModalHariKerja.click();
    }

    public void setClickMHK1(){
        clickMHK1.click();
    }

    public void setClickChooseMHK1(){
        clickChooseMHK1.click();
    }

    public void setClickMHK2(){
        clickMHK2.click();
    }

    public void setClickChooseMHK2(){
        clickChooseMHK2.click();
    }

    public void setClickMHK3(){
        clickMHK3.click();
    }

    public void setClickChooseMHK3(){
        clickChooseMHK3.click();
    }

    public void setClickMHK4(){
        clickMHK4.click();
    }

    public void setClickChooseMHK4(){
        clickChooseMHK4.click();
    }

    public void setClickMHK5(){
        clickMHK5.click();
    }

    public void setClickChooseMHK5(){
        clickChooseMHK5.click();
    }

    public void setClickMHK6(){
        clickMHK6.click();
    }

    public void setClickChooseMHK6(){
        clickChooseMHK6.click();
    }

    public void setClickMHK7(){
        clickMHK7.click();
    }

    public void setClickChooseMHK7(){
        clickChooseMHK7.click();
    }

    public void setBtnTerapkan(){
        btnTerapkan.click();
    }

    public void setBtnBatalTerapkan(){
        btnBatalTerapkan.click();
    }

    public void setInputKeterlambatan(String Keterlambatan){
        inputKeterlambatan.sendKeys(Keterlambatan);
    }

    public void setBtnAssignKaryawan(){
        btnAssignKaryawan.click();
    }

    public void setBtnTambahJadwal(){
        btnTambahJadwal.click();
    }

    public void setBtnBatalJadwal(){
        btnBatalJadwal.click();
    }

    public void setInputSearchJadwal(String SearchJadwal){
        inputSearchJadwal.sendKeys(SearchJadwal);
    }

    public void setBtnSearchJadwal(){
        btnSearchJadwal.click();
    }

    public void setBtnResetJadwal(){
        btnResetJadwal.click();
    }

    public void setBtnMoreJadwal(){
        btnMoreJadwal.click();
    }

    public void setBtnMoreDetailJadwal(){
        btnMoreDetailJadwal.click();
    }

    public void setBtnMoreEditJadwal(){
        btnMoreEditJadwal.click();
    }

    public void setBtnMoreDeleteJadwal(){
        btnMoreDeleteJadwal.click();
    }

    public void setBtnKembaliDetailJadwal(){
        btnKembaliDetailJadwal.click();
    }

    public void setClickEditTipeJadwal(){
        clickEditTipeJadwal.click();
    }

    public void setClickPilihEditTipeJadwal(){
        clickPilihEditTipeJadwal.click();
    }

    public void setBtnSimpanEditJadwal(){
        btnSimpanEditJadwal.click();
    }

    public void setBtnKonfirmDelete(){
        btnKonfirmDelete.click();
    }

    public String getErrorMessageEmptyHariKerja() {
        return errorMessageEmptyHariKerja.getText();
    }

}
