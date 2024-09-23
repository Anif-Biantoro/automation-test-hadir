package com.juaracoding.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AturanCutiPage {
    WebDriver driver;

    public AturanCutiPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//p[normalize-space()='Management']")
    private WebElement btnMenuforAturanCuti;

    public void setBtnMenuforAturanCuti(){
        btnMenuforAturanCuti.click();
    }

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div[2]/div/div/div/div[14]/div[2]")
    private WebElement clickAturanCuti;

    public void setClickAturanCuti(){
        clickAturanCuti.click();
    }

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/section/div/div/div[1]/button")
    private WebElement btnTambahkanAturanCuti;

    public void setBtnTambahkanAturanCuti(){
        btnTambahkanAturanCuti.click();
    }

    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement inputNamaAturanCutiField;

    public void setInputNamaAturanCutiField(String NamaAturan){
        inputNamaAturanCutiField.sendKeys(NamaAturan);
    }

    @FindBy(xpath = "//*[@id=\"eligible_leave_total_month\"]")
    private WebElement inputEligiblePengaturanCutiField;

    public void setInputEligiblePengaturanCutiField(String Eligible){
        inputEligiblePengaturanCutiField.sendKeys(Eligible);
    }

    @FindBy(xpath = "/html/body/div[13]/div[3]/div/div[1]/form/div[3]/div/div/div/button")
    private WebElement clickTanggalBatasSisaCuti;

    public void setClickTanggalBatasSisaCuti(){
        clickTanggalBatasSisaCuti.click();
    }

    @FindBy(xpath = "/html/body/div[14]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/button[1]")
    private WebElement chooseTanggalBatasSisaCuti;

    public void setChooseTanggalBatasSisaCuti(){
        chooseTanggalBatasSisaCuti.click();
    }

    @FindBy(xpath = "/html/body/div[13]/div[3]/div/div[1]/form/div[4]/div/div/div/button")
    private WebElement clickBulanBatasSisaCuti;

    public void setClickBulanBatasSisaCuti(){
        clickBulanBatasSisaCuti.click();
    }

    @FindBy(xpath = "/html/body/div[14]/div[2]/div/div/div/div[2]/div/div/button[12]")
    private WebElement chooseBulanBatasSisaCuti;

    public void setChooseBulanBatasSisaCuti(){
        chooseBulanBatasSisaCuti.click();
    }

    @FindBy(xpath = "//*[@id=\"max_carry_forward\"]")
    private WebElement inputMaksimalSisaCutiField;

    public void setInputMaksimalSisaCutiField(String MaksimalSisaCuti){
        inputMaksimalSisaCutiField.sendKeys(MaksimalSisaCuti);
    }

    @FindBy(xpath = "//*[@id=\"carry_forward_total_month\"]")
    private WebElement inputJumlahBulanKerjaSisaCutiField;

    public void setInputJumlahBulanKerjaSisaCutiField(String JumlahBulanKerja){
        inputJumlahBulanKerjaSisaCutiField.sendKeys(JumlahBulanKerja);
    }

    @FindBy(xpath = "/html/body/div[13]/div[3]/div/div[2]/button[2]")
    private WebElement btnSimpanTambahkanAturanCuti;

    public void setBtnSimpanTambahkanAturanCuti(){
        btnSimpanTambahkanAturanCuti.click();
    }

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/section/div/div/div[1]/form/div/div/div/input")
    private WebElement inputSearchAturanCuti;

    public void setInputSearchAturanCuti(String SearchAturanCuti){
        inputSearchAturanCuti.sendKeys(SearchAturanCuti);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/section/div/div/div[1]/form/div/button[1]")
    private WebElement btnResetAturanCuti;

    public void setBtnResetAturanCuti(){
        btnResetAturanCuti.click();
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/section/div/div/div[1]/form/div/button[2]")
    private WebElement btnSearchAturanCuti;

    public void setBtnSearchAturanCuti(){
        btnSearchAturanCuti.click();
    }

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/section/div/div/div[2]/label/span[1]/span[1]")
    private WebElement btnDensePadding;

    public void setBtnDensePadding(){
        btnDensePadding.click();
    }

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/section/div/div/div[2]/div[1]/table/tbody/tr/td[8]/div/div/button")
    private WebElement btnAction;

    public void setBtnAction(){
        btnAction.click();
    }

    @FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[1]")
    private WebElement btnView;

    public void setBtnView(){
        btnView.click();
    }

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/section/div/div/div/div[1]/button")
    private WebElement btnTambahkanDetailAturanCuti;

    public void setBtnTambahkanDetailAturanCuti(){
        btnTambahkanDetailAturanCuti.click();
    }

    @FindBy(xpath = "//*[@id=\"total_month_greater\"]")
    private WebElement inputMinimalBulanBekerjaField;

    public void setInputMinimalBulanBekerjaField(String MinimalBulan){
        inputMinimalBulanBekerjaField.sendKeys(MinimalBulan);
    }

    @FindBy(xpath = "//*[@id=\"total_leave\"]")
    private WebElement inputTotalCutiField;

    public void setInputTotalCutiField(String TotalCuti){
        inputTotalCutiField.sendKeys(TotalCuti);
    }

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/button[2]")
    private WebElement btnSimpanTambahkanDetailAturanCuti;

    public void setBtnSimpanTambahkanDetailAturanCuti(){
        btnSimpanTambahkanDetailAturanCuti.click();
    }

    @FindBy(xpath = "/html/body/div[5]/div[3]/div/div[2]/button[1]")
    private WebElement btnTutupTambahkanDetailAturanCuti;

    public void setBtnTutupTambahkanDetailAturanCuti(){
        btnTutupTambahkanDetailAturanCuti.click();
    }

    @FindBy(xpath = "//*[@id=\"name-helper-text\"]")
    private WebElement errorMessageAturanCuti;

    public String getErrorMessageAturanCuti() {
        return errorMessageAturanCuti.getText();
    }

}
