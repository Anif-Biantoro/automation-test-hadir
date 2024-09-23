package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DivisiPage {
    private WebDriver driver;

    public DivisiPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[normalize-space()='Tambahkan']")
    private WebElement btnTambahkan;

    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement btnReset;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSearch;

    @FindBy(xpath = "//input[@id='search']")
    private WebElement fieldSearch;

    @FindBy(xpath = "//span[@]")
    private WebElement btnShowMore;

    @FindBy(xpath = "//button[@type='button']")
    private WebElement btnEdit;

    @FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]//*[name()='svg']//*[name()='g']//*[name()='circle'][1]")
    private WebElement btnDelete;

    //Menu tambah divisi
    @FindBy(xpath = "//button[normalize-space()='Tambah']")
    private WebElement btnTambah;

    @FindBy(xpath = "//button[normalize-space()='Batal']")
    private WebElement btnBatal;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement fieldNamaDivisi;

    //Menu edit divisi
    @FindBy(xpath = "//input[@id='name']")
    private WebElement fieldEditNama;

    @FindBy(xpath = "//button[normalize-space()='Simpan']")
    private WebElement btnSimpan;

    //Menu delete divisi
    @FindBy(xpath = "//button[normalize-space()='Ya']")
    private WebElement btnYa;

    //path mengambil text
    @FindBy(xpath = "//div[@class='MuiSnackbarContent-message css-1w0ym84']")
    private WebElement txtSuccessful;

    @FindBy(xpath = "//h6[normalize-space()='3D Artist']")
    private WebElement txtNamaDivisi;

    //Inisiasi fungsi button
    public void setBtnTambahkan(){
        btnTambahkan.click();
    }

    public void setBtnReset(){
        btnReset.click();
    }

    public void setBtnSearch(){
        btnSearch.click();
    }

    public void setBtnTambah(){
        btnTambah.click();
    }

    public void setBtnBatal(){
        btnBatal.click();
    }

    public void setBtnSimpan(){
        btnSimpan.click();
    }

    public void setBtnShowMore(){
        btnTambahkan.click();
    }

    public void setBtnEdit(){
        btnEdit.click();
    }

    public void setBtnDelete(){
        btnDelete.click();
    }

    public void setBtnYa(){
        btnYa.click();
    }


    //Inisiasi fungsi field
    public void inputSearch(String search){
        this.fieldSearch.sendKeys(search);
    }

    public void inputNamaDivisi(String namaDivisi){
        this.fieldNamaDivisi.sendKeys(namaDivisi);
    }

    public void inputEditDivisi(String editDivisi){
        this.fieldEditNama.sendKeys(editDivisi);
    }

    public void clearFieldSearch(){
        fieldSearch.sendKeys(Keys.CONTROL+"A");
        fieldSearch.sendKeys(Keys.DELETE);
    }

    //Inisiasi fungsi assertion
    public String getTxtSuccessfulPopUp(){ return txtSuccessful.getText(); }

    public String getTxtNamaDivisi(){ return txtNamaDivisi.getText(); }


}
