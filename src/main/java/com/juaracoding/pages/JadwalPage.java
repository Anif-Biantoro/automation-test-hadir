package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JadwalPage {

    private WebDriver driver;

    public JadwalPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

        @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div[1]/div[2]/p")
        private WebElement managementMenu;

        @FindBy(xpath = "//p[normalize-space()='Jadwal']")
        private WebElement menuJadwal;

        @FindBy(xpath = "//*[@id=\"search\"]")
        private WebElement searchNameBox;

        @FindBy(xpath = "//button[normalize-space()='Reset']")
        private WebElement btnReset;

        @FindBy(xpath = "//button[@type='submit']")
        private WebElement btnSearch;

        @FindBy(xpath = "//button[normalize-space()='Tambahkan']")
        private WebElement btnAdd; //button[normalize-space()='Tambahkan']

        @FindBy(xpath = "//input[@id='mui-27' and @type='tel']")
        private WebElement tambahTanggal;

        @FindBy(xpath = "//*[@id=\"typeJadwal\"]")
        private WebElement tipeJadwal;

        @FindBy(xpath = "//*[@id=\"mui-26\"]/li[1]")
        private WebElement jadwalKerjaTetap;

        @FindBy(xpath = "//*[@id=\"mui-26\"]/li[2]")
        private WebElement jadwalKerjaShift;

        @FindBy(xpath = "//li[normalize-space(text())='Jadwal kerja flexible']")
        private WebElement jadwalKerjaFlexible;

        @FindBy(xpath = "//input[@id='nameJadwal']")
        private WebElement namaJadwalKerja;

        @FindBy(xpath = "//*[@id=\"alert-dialog-slide-description\"]/div[3]/div")
        private WebElement inputHariKerja;

        @FindBy(xpath = "//*[@id=\"alert-dialog-slide-description\"]/div/div[1]/div[2]/div")
        private WebElement dropHariSenin; //*[@id="mui-28"]/li[17]

        @FindBy(xpath = "//li[contains(text(), 'Juara Coding')]")
        private WebElement kerjaHariSenin;

        @FindBy(xpath = "//*[@id=\"alert-dialog-slide-description\"]/div/div[2]/div[2]/div")
        private WebElement dropHariSelasa;

        @FindBy(xpath = "//li[contains(text(), 'Juara Coding')]")
        private WebElement kerjaHariSelasa;

        @FindBy(xpath = "//*[@id=\"alert-dialog-slide-description\"]/div/div[3]/div[2]/div")
        private WebElement dropHariRabu;

        @FindBy(xpath = "//li[contains(text(), 'Juara Coding')]")
        private WebElement kerjaHariRabu;

        @FindBy(xpath = "//*[@id=\"alert-dialog-slide-description\"]/div/div[4]/div[2]/div")
        private WebElement dropHariKamis;

        @FindBy(xpath = "//li[contains(text(), 'Juara Coding')]")
        private WebElement kerjaHariKamis;

        @FindBy(xpath = "//*[@id=\"alert-dialog-slide-description\"]/div/div[5]/div[2]/div")
        private WebElement dropHariJumat;

        @FindBy(xpath = "//li[contains(text(), 'Juara Coding')]")
        private WebElement kerjaHariJumat;

        @FindBy(xpath = "//*[@id=\"t_keterlambatan\"]")
        private WebElement toleransiTelat;

        @FindBy(xpath = "/html/body/div[14]/div[3]/div/div[2]/button[1]")
        private WebElement btnTerapkanHari;

        @FindBy(xpath = "//button[text()='Terapkan']")
        private WebElement btnBatalHari;

        @FindBy(xpath = "//*[@id=\"alert-dialog-slide-description\"]/p")
        private WebElement txtHariKerja;

        @FindBy(xpath = "//button[text()='Tambah']")
        private WebElement btnTambahJadwal;

        @FindBy(xpath = "/html/body/div[13]/div[3]/div/form/div[2]/button[2]")
        private WebElement btnBatalJadwal;

        @FindBy(xpath = "//h6[text()='Testing']")
        private WebElement txtJadwal;

        @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div/div[2]/div/table/tbody/tr[1]/td[4]/div/div/button")
        private WebElement btnSpanJadwal;

        @FindBy(xpath = "//*[@id=\"card-actions-menu\"]/div[3]/ul/li[1]")
        private WebElement detailJadwal;

        @FindBy(xpath = "//button[normalize-space(text())='Kembali']")
        private WebElement btnDetailKembali;

        @FindBy(xpath = "//*[@id=\"card-actions-menu\"]/div[3]/ul/li[2]")
        private WebElement editJadwal;

        @FindBy(xpath = "//button[normalize-space(text())='Simpan']")
        private WebElement btnSimpanEdit;

        @FindBy(xpath = "<div class=\"MuiSnackbarContent-message css-1w0ym84\">Harap mengedit data hari terdahulu</div>")
        private WebElement txtSimpanGagal;

        @FindBy(xpath = "//button[normalize-space(text())='Batal']")
        private WebElement btnSimpanBatal;

        @FindBy(xpath = "//li[text()='Delete']")
        private WebElement deleteJadwal;

        @FindBy(xpath = "//button[normalize-space(text())='Tidak']")
        private WebElement btnNoDelete;

        @FindBy(xpath = "//div[contains(@class, 'MuiSelect-select')]")
        private WebElement btnSpanRow;

        @FindBy(xpath = "//*[@id=\"mui-1\"]/li[1]")
        private WebElement rowLima;

        @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div/div[3]/div/div/div[3]/button[3]")
        private WebElement btnNextPage;

        @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div/div[3]/div/div/div[3]/button[2]")
        private WebElement btnPrevPage;

        @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div/div[3]/div/div/div[3]/button[4]")
        private WebElement btnLastPage;

        @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div/div[3]/div/div/div[3]/button[1]")
        private WebElement btnFirstPage;

        public void setMenuJadwal(){
            menuJadwal.click();
        }
        public void setManagementMenu(){
            managementMenu.click();
        }

        public void setSearchNameBox(String namaJadwal){
            this.searchNameBox.sendKeys(namaJadwal);
        }

        public void setBtnSearch(){
            btnSearch.click();
        }

        public void setBtnReset(){
            btnReset.click();
        }

        public void setBtnAdd(){
            btnAdd.click();
        }

        public void setTipe(){
            tipeJadwal.click();
            jadwalKerjaFlexible.click();
        }

        public void setTanggal(String tgl){
            this.tambahTanggal.sendKeys(tgl);
        }

        public void clearTanggal(){
            tambahTanggal.clear();
        }

        public void klikNamaJadwalKerja(){
            namaJadwalKerja.click();
        }

        public void setNamaJadwalKerja(String jadwalKerja){
            this.namaJadwalKerja.sendKeys(jadwalKerja);
        }

        public void setInputHariKerja(){
            inputHariKerja.click();
        }

        public void setHariSenin(){
            dropHariSenin.click();
            DriverSingleton.delay(2);
            kerjaHariSenin.click();
        }

        public void setHariSelasa(){
            dropHariSelasa.click();
            DriverSingleton.delay(2);
            kerjaHariSelasa.click();
        }

        public void setHariRabu(){
            dropHariRabu.click();
            DriverSingleton.delay(2);
            kerjaHariRabu.click();
        }

        public void setHariKamis(){
            dropHariKamis.click();
            DriverSingleton.delay(2);
            kerjaHariKamis.click();
        }

        public void setHariJumat(){
            dropHariJumat.click();
            DriverSingleton.delay(2);
            kerjaHariJumat.click();
        }

        public void setBtnTerapkanHari(){
            btnTerapkanHari.click();
        }

        public void setToleransiTelat(String toleransiTelat){
            this.toleransiTelat.sendKeys(toleransiTelat);
        }

        public void setBtnTambahJadwal(){
            btnTambahJadwal.click();
        }

        public void setBtnSpanJadwal(){
            btnSpanJadwal.click();
        }

        public void setDetailJadwal(){
            detailJadwal.click();
        }

        public void setBtnDetailKembali(){
            btnDetailKembali.click();
        }

        public void setEditJadwal(){
            editJadwal.click();
        }

        public void setBtnSimpanEdit(){
            btnSimpanEdit.click();
        }

        public String setTxtSimpanGagal(){
            return txtSimpanGagal.getText();
        }

        public void setBtnSimpanBatal(){
            btnSimpanBatal.click();
        }

        public void setDeleteJadwal(){
            deleteJadwal.click();
        }

        public void setBtnNoDelete(){
            btnNoDelete.click();
        }

        public void setBtnSpanRow(){
            btnSpanRow.click();
        }

        public void setRowLima(){
            rowLima.click();
        }

        public void setNextPage(){
            btnNextPage.click();
        }

        public void setPrevPage(){
            btnPrevPage.click();
        }

        public void setLastPage(){
            btnLastPage.click();
        }

        public void setFirstPage(){
            btnFirstPage.click();
        }

        public String txtJadwal(){
            return txtJadwal.getText();
        }

        public void scrollToBottom(){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        }






}
