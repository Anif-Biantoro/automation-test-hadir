package com.juaracoding.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KalenderPage {
    WebDriver driver;

    public KalenderPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//p[normalize-space()='Management']")
    private WebElement btnMenu;

    @FindBy(xpath = "//p[normalize-space()='Kalender']")
    private WebElement clickKalender;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div/div[1]/div/button")
    private WebElement btnTambahKalender;

    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement KalenderField;

    @FindBy(xpath = "/html/body/div[13]/div[3]/div/form/div[2]/button[1]")
    private WebElement ButtonTambah;

    @FindBy(xpath = "/html/body/div[13]/div[3]/div/form/div[2]/button[2]")
    private WebElement ButtonBatal;

    @FindBy(xpath = "//*[@id=\"search\"]")
    private WebElement SearchField;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div/div[1]/form/div/button[1]")
    private WebElement ButtonReset;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div/div[1]/form/div/button[2]")
    private WebElement ButtonSearch;

    @FindBy(xpath = "//*[@id=\"name-helper-text\"]")
    private WebElement ErrorMessageKalender;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/div[2]/div/table/tbody/tr/td[2]/div/div/button")
    private WebElement ButtonAction;

    @FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[1]")
    private WebElement ButtonView;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/div[2]/div/button")
    private WebElement ButtonTambahkanKalenderView;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/form/div[1]/div[1]/div/div/div/button")
    private WebElement ClickPilihTanggal;

    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[4]/button[7]")
    private WebElement ChoosePilihTanggal;

    @FindBy(xpath = "//*[@id=\"type\"]")
    private WebElement ClickTipeCuti;

    @FindBy(xpath = "/html/body/div[4]/div[3]/ul/li[2]")
    private WebElement ChooseTipeCuti;

    @FindBy(xpath = "//*[@id=\"description\"]")
    private WebElement InputDeskripsiTanggal;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/form/div[2]/button[1]")
    private WebElement ButtonSimpanTambahkanKalender;


    public void setBtnMenu(){
        btnMenu.click();
    }

    public void setClickKalender(){
        clickKalender.click();
    }

    public void setBtnTambahKalender(){
        btnTambahKalender.click();
    }

    public void setKalenderField(String Unit){
        KalenderField.sendKeys(Unit);
    }

    public void setButtonTambah(){
        ButtonTambah.click();
    }

    public void setButtonBatal(){
        ButtonBatal.click();
    }

    public void setSearchField(String Search){
        SearchField.sendKeys(Search);
    }

    public void setButtonReset(){
        ButtonReset.click();
    }

    public void setButtonSearch(){
        ButtonSearch.click();
    }

    public String getErrorMessageKalender() {
        return ErrorMessageKalender.getText();
    }

    public void setButtonAction(){
        ButtonAction.click();
    }

    public void setButtonView(){
        ButtonView.click();
    }


    public void setButtonTambahkanKalenderView(){
        ButtonTambahkanKalenderView.click();
    }

    public void setClickPilihTanggal(){
        ClickPilihTanggal.click();
    }

    public void setChoosePilihTanggal(){
        ChoosePilihTanggal.click();
    }

    public void setClickTipeCuti(){
        ClickTipeCuti.click();
    }

    public void setChooseTipeCuti(){
        ChooseTipeCuti.click();
    }

    public void setInputDeskripsiTanggal(String Deskripsi){
        InputDeskripsiTanggal.sendKeys(Deskripsi);
    }

    public void setButtonSimpanTambahkanKalender(){
        ButtonSimpanTambahkanKalender.click();
    }

}
